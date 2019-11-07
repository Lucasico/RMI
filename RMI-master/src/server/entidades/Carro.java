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
public class Carro implements Serializable{
    private static final long serialVersionUID = 1L;
    //(nome, placa e fabricante
    private String nome;
    private String placa;
    private String fabricante;

    public Carro() {
      
    }

    public Carro(String nome, String placa, String fabricante) {
        this.nome = nome;
        this.placa = placa;
        this.fabricante = fabricante;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
