/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VO;

/**
 *
 * @author narja
 */
public class TransacaoVO {
    
    private String tipo;  
    private double valor;
    private String detalhes;
    private String dataHora;
    
    public TransacaoVO(String tipo, double valor, String dataHora, String detalhes) {
        this.tipo = tipo;
        this.valor = valor;
        this.detalhes = detalhes;
        this.dataHora = dataHora;
    }
    
    public TransacaoVO(String tipo, double valor, String detalhes) {
        this.tipo = tipo;
        this.valor = valor;
        this.detalhes = detalhes;
    } 
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
 
}
