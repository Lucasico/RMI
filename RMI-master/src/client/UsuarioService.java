/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import interfaces.InterfaceUsuarioRemote;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import server.entidades.Carro;
import server.entidades.LocarVeiculo;
import server.entidades.Usuarios;

/**
 *
 * @author lucas
 */

//vai especificar qual interface a ser conectada
//vai servir de interceptor dos métodos da interface
public class UsuarioService {
    
    private Registry registry;
    private InterfaceUsuarioRemote usuarioIF;

    //construtor recebendo o registro da conexão
    public UsuarioService() {
        //como o metodo é estatico ele vai chamar diretamente
        // caso ele não tenha sido chamado ele vai criar o 
        //construtor lá, e retornar aqui.
       registry = RemoteConection.getRegistry();
       //lookup ->  vai procurar por usuarioRemote, que é o host do usuario
       try{
           usuarioIF = (InterfaceUsuarioRemote) registry.lookup("UsuarioRemote");
       }catch(AccessException e){
           e.printStackTrace();
       }catch(RemoteException e){
           e.printStackTrace();
       }catch(NotBoundException e){
           e.printStackTrace();
       }
    }
    //----------------------cliente------------------
    //metodo para chamar atravez da interface o metodo save
    public void save(Usuarios usuario){
        try {
            usuarioIF.save(usuario);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    //metodo para chamar atravez da interface o metodo lista
    public ArrayList<Usuarios> lista(){
        try{
            return usuarioIF.lista();
        }catch(RemoteException e){
            e.printStackTrace();
        }
        return null;
    }
    
    //----------------------carro---------------------
    public void saveCar(Carro carro){
        try {
            usuarioIF.saveCar(carro);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Carro> listaCar(){
        try{
            return usuarioIF.listaCar();
        }catch(RemoteException e){
            e.printStackTrace();
        }
        return null;
    }
    
    //------------------------alocarCarro---------------
    
    public void saveLocar(LocarVeiculo locar){
        try {
            usuarioIF.saveLocar(locar);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<LocarVeiculo> listaLocar(){
        try{
            return usuarioIF.listaLocar();
        }catch(RemoteException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
