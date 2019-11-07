/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;

import java.util.ArrayList;
import server.entidades.Usuarios;

/**
 *
 * @author lucas
 */
public class UsuarioDAO {
    private final String USUARIOS = "usuarios";
    private Persistencia persistencia;
    
    //construtor que vai inicializar uma nova instancia de persistencia 
    public UsuarioDAO(){
        persistencia = new Persistencia();
    }
    
    //método de salvar
    public void save(Usuarios usuario){
        ArrayList<Usuarios> lista = lista();
        
        if(lista == null){
            lista = new ArrayList<Usuarios>();
        }
        lista.add(usuario);
        persistencia.save(USUARIOS, lista);
    }
    
    //metodo de lista
    public ArrayList<Usuarios>lista(){
       
        return(ArrayList<Usuarios>)persistencia.load(USUARIOS);
    }
    
}
