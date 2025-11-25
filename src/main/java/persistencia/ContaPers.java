/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import VO.ContaVO;
import VO.TransacaoVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


public class ContaPers {
    
    public ContaVO autenticarPers(String cpf, String senha) throws SQLException{
        ContaVO conta = null;
        try(Connection bd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabancario_projeto", "root", "")){

            PreparedStatement stmt = bd.prepareStatement("SELECT * FROM contas WHERE cpf = ? AND senha = ?");
            stmt.setString(1, cpf);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                
                conta = new ContaVO();
                
                conta.setId(rs.getInt("id"));
                conta.setCpf(rs.getString("cpf"));
                conta.setNumeroConta(rs.getString("numero_conta"));
                
                conta.setTitular(rs.getString("titular"));
                conta.setEmail(rs.getString("email"));
                
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setEmail(rs.getString("email")); 
                conta.setTipoConta(rs.getString("tipo_conta"));

                conta.setCep(rs.getString("cep"));
                conta.setRua(rs.getString("rua"));
                conta.setNumeroCasa(rs.getString("numero"));
                conta.setComplemento(rs.getString("complemento"));
                conta.setCidade(rs.getString("cidade"));
                conta.setEstado(rs.getString("estado"));
                conta.setCidade(rs.getString("cidade"));
                conta.setEstado(rs.getString("estado"));             
                
                String sqlHist = "SELECT * FROM transacoes WHERE conta_id = ?";
                PreparedStatement stmtHist = bd.prepareStatement(sqlHist);
                stmtHist.setInt(1, conta.getId());
                
                ResultSet rsHist = stmtHist.executeQuery();
                SimpleDateFormat formatadorDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                
                
                while (rsHist.next()) {//Fica adicionando as linhas no historico
                    
                    java.sql.Timestamp dataHora = rsHist.getTimestamp("data_hora");//pega data e horas
                    
                    TransacaoVO t = new TransacaoVO(rsHist.getString("tipo_operacao"), 
                            rsHist.getDouble("valor"), 
                            formatadorDataHora.format(dataHora),//coloca formatado na lista
                            rsHist.getString("detalhes"));
                    conta.adicionarTransacao(t);//adiciona no ContaVO as linhas ja feitas no Banco de dados
                }
            }          
            bd.close();
            return conta;
        }
        finally{
            ///////////////////////////////////////
        }
    }
    
    public ContaVO buscarConta(String contaTransf) throws SQLException{

        try (Connection bd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabancario_projeto", "root", "")){
            ContaVO conta = null;
             String sql = "SELECT * FROM contas WHERE numero_conta = ?";
             PreparedStatement stmt = bd.prepareStatement(sql);
             stmt.setString(1, contaTransf);

             ResultSet rs = stmt.executeQuery();

             if (rs.next()) {
                conta = new ContaVO();
                conta.setId(rs.getInt("id"));
                conta.setTitular(rs.getString("titular"));
                conta.setSaldo(rs.getDouble("saldo"));

                conta.setId(rs.getInt("id"));
                conta.setCpf(rs.getString("cpf"));
                conta.setNumeroConta(rs.getString("numero_conta"));
                
                conta.setTitular(rs.getString("titular"));
                conta.setEmail(rs.getString("email"));
                
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setEmail(rs.getString("email")); 
                conta.setTipoConta(rs.getString("tipo_conta"));

                conta.setCep(rs.getString("cep"));
                conta.setRua(rs.getString("rua"));
                conta.setNumeroCasa(rs.getString("numero"));
                conta.setComplemento(rs.getString("complemento"));
                conta.setCidade(rs.getString("cidade"));
                conta.setEstado(rs.getString("estado"));
                conta.setCidade(rs.getString("cidade"));
                conta.setEstado(rs.getString("estado"));
             }
             bd.close();
             return conta;
         }
        finally{
            ///////////////////////////////////////
        }
     }
    
    public boolean existeCPF(String cpf) throws SQLException{
        
        try (Connection bd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabancario_projeto", "root", "")){
            
            String sql = "SELECT * FROM contas WHERE cpf = ?";
            PreparedStatement stmt = bd.prepareStatement(sql);
            stmt.setString(1, cpf);

            ResultSet rs = stmt.executeQuery();
        
            return rs.next();
            }
    }
    
    public boolean cadastrarConta(ContaVO conta) throws SQLException{
        try (Connection bd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabancario_projeto", "root", "")) {     
            String sqlConta = "INSERT INTO contas (titular, cpf, email, numero_conta, tipo_conta, " 
                    + "cep, rua, numero, complemento, cidade, estado, senha, saldo) " 
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            PreparedStatement stmt = bd.prepareStatement(sqlConta, java.sql.Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, conta.getTitular());
            stmt.setString(2, conta.getCpf());
            stmt.setString(3, conta.getEmail());
            stmt.setString(4, conta.getNumeroConta());
            stmt.setString(5, conta.getTipoConta());
            stmt.setString(6, conta.getCep());
            stmt.setString(7, conta.getRua());
            stmt.setString(8, conta.getNumeroCasa());
            stmt.setString(9, conta.getComplemento());
            stmt.setString(10, conta.getCidade());
            stmt.setString(11, conta.getEstado());
            stmt.setString(12, conta.getSenha());
            stmt.setDouble(13, conta.getSaldo());

            stmt.executeUpdate();
            ResultSet rsId = stmt.getGeneratedKeys();
            int idGerado = 0;
            if (rsId.next()) {
                idGerado = rsId.getInt(1);
                conta.setId(idGerado);
            }
            System.out.println("Criou");
            return true;
        }
    }
    
}
