/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.main;


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.remote.UsuarioRemote;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        //inicializar o servidor recebendo os request dos clientes
        
        int port = 1999; 
        String usuarioHost = "UsuarioRemote";
        
        try {
            //ao iniciar cria um registro
            Registry registry = LocateRegistry.createRegistry(port);
            //inicializar o servidor, que atraves de um registro do metodo bind, que tem 
            //o indentificador usuarioHost para indentificar atraves da rede
            registry.bind(usuarioHost, new UsuarioRemote());
            System.out.println("Servidor iniciado com sucesso");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } 
    }
}
