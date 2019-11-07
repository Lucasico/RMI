/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.entidades;

import java.io.Serializable;

/**
 *
 * @author lucas
 */
public class LocarVeiculo implements Serializable{
     private static final long serialVersionUID = 1L;
    //valor, qtde de dias
    private String valor;
    private String qtdDias;
    private String carroLocado;
    private String usuarioCliente;

    public LocarVeiculo(String valor, String qtdDias, String carroLocado, String usuarioCliente) {
        this.valor = valor;
        this.qtdDias = qtdDias;
        this.carroLocado = carroLocado;
        this.usuarioCliente = usuarioCliente;
    }    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(String qtdDias) {
        this.qtdDias = qtdDias;
    }
     public String getCarroLocado() {
        return carroLocado;
    }

    public void setCarroLocado(String carroLocado) {
        this.carroLocado = carroLocado;
    }

    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(String usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }
    public LocarVeiculo() {
    }

    
    
    
}
