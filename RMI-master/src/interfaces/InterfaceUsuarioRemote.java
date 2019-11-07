/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import server.entidades.Carro;
import server.entidades.LocarVeiculo;
import server.entidades.Usuarios;

/**
 *
 * @author lucas
 */
//extends Remote para utilizar o rmi remoto
public interface InterfaceUsuarioRemote extends Remote{
    //---------------cliente------------------------//
    
    //métodos que seram implementados no servidor
    //tendo que lançar a exceção remota OBRIGATORIO
    public void save(Usuarios usuario)throws RemoteException;
    //retorna o Array lista de usuarios
    public ArrayList<Usuarios> lista() throws RemoteException;
    
    //-------------------Carro---------------------//
    
    public void saveCar(Carro carro)throws RemoteException;
    public ArrayList<Carro> listaCar() throws RemoteException;
    
    //-------------------locarVeiculo---------------//
    public void saveLocar(LocarVeiculo locar)throws RemoteException;
    public ArrayList<LocarVeiculo> listaLocar()throws RemoteException;
   
    
    
}
