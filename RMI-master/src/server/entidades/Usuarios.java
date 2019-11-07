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

// classe de criação de usuarios
public class Usuarios implements Serializable{
    private static final long serialVersionUID = 1L;
    //nome, senha,cpf, telefone e email
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private String telefone;
    private String divisor;

    //para implementar a interface
    public Usuarios() {
        
    }

    //para facilitar na hora de persistir
    public Usuarios(String nome, String senha,String email, String cpf, String telefone) {
        super();
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
