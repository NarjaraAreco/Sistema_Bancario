/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import VO.ContaVO;
import VO.TransacaoVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author narja
 */
public class OperacoesPers {
    
    public boolean historicoTransacoes(TransacaoVO novaTransacao, int id) throws SQLException{
        
        int retorno;
        try (Connection bd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabancario_projeto", "root", "")) {     
            String sql = "INSERT INTO transacoes (conta_id, tipo_operacao, valor, detalhes) VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = bd.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, novaTransacao.getTipo());
            stmt.setDouble(3, novaTransacao.getValor());
            stmt.setString(4, novaTransacao.getDetalhes());          
            
            retorno = stmt.executeUpdate();
            System.out.println("Gerou historico");
        }
        finally {
            
        }
       return retorno == 1;
    }
    // DEIXAR OPERAÇÃO COM O UMA (DEPOSITO E SAQUE)//////////////////////////////////////////////////////////////////////
    public boolean transacoes(ContaVO conta) throws SQLException{
        
        int retorno;
        try (Connection bd = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabancario_projeto", "root", "")) {
            String sql = "UPDATE contas SET saldo = ? WHERE id = ?";
            
            PreparedStatement stmt = bd.prepareStatement(sql);
            stmt.setDouble(1, conta.getSaldo());
            stmt.setInt(2, conta.getId());
            retorno = stmt.executeUpdate(); //update n retorna então perguntamos quantas linhas foram alteradas
        }
        finally {
            //PENSAR
        }
        return retorno == 1; //se retorno for 1 quer dizer que trocou a linha
            
    }
    

}