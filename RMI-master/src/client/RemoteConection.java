/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author lucas
 */
//onde de fato vai acontecer a conexão com serv
//especifica a porta eo ip a ser conectado
public class RemoteConection {

    private static Registry registry;
    private String ip = "127.0.0.1";
    private int port = 1999;

    public RemoteConection() {
        try {
            //funciona como se fosse um soquete conjunto de 
            //ip e porta que viabiliza a conecção
            registry = LocateRegistry.getRegistry(ip, port);
            //aqui já tenho o registro e a porta do servidor
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //caso eu chame o regisro e ele não tenha sido chamado na função acima
    //cria um novo com o construtor acima
    public static Registry getRegistry() {
        if (registry == null) {
            RemoteConection remoteConection = new RemoteConection();
        }
        return registry;
    }

}
