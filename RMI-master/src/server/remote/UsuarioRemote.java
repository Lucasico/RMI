
package server.remote;
//importações necessarias
import interfaces.InterfaceUsuarioRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import server.DAO.CarroDAO;
import server.DAO.LocarVeiculoDAO;
import server.DAO.UsuarioDAO;
import server.entidades.Carro;
import server.entidades.LocarVeiculo;
import server.entidades.Usuarios;
//extends remoteObject para herdar o método que vai
//possiblitar o objetoRemoto chegar

//implementar a interface, para herdar seus métodos
public class UsuarioRemote extends UnicastRemoteObject implements InterfaceUsuarioRemote{
    /*
        metodos que seram implementados quando o cliente clicar no método
        usuando a regra de negocio implementar e salvar o usuario
    */
    
    //add contrutor padrão do usuarioRemote
    public UsuarioRemote() throws RemoteException{
        super();
    }
    @Override
    //toda vez que esse método for chamda vou chamar para salva persisttir no BANCO
    public void save(Usuarios usuario) throws RemoteException {
        UsuarioDAO dao = new UsuarioDAO();
        dao.save(usuario);
    }

    @Override
    //toda vez que esse método for chamda vou chamar para lista os usuario no BANCO
    public ArrayList<Usuarios> lista() throws RemoteException {
        UsuarioDAO dao = new UsuarioDAO();
        return dao.lista();
    }
    
    //--------------------------carro--------------------------------------//
    
    @Override
    public void saveCar(Carro carro) throws RemoteException {
         CarroDAO dao = new CarroDAO();
         dao.saveCar(carro);
    }

    @Override
    public ArrayList<Carro> listaCar() throws RemoteException {
       CarroDAO dao = new CarroDAO();
       return dao.listaCar();
    }
    
    //------------------------locar------------------------------------//
    
    @Override
    public void saveLocar(LocarVeiculo locarveiculo) throws RemoteException{
        LocarVeiculoDAO dao = new LocarVeiculoDAO();
        dao.saveLocar(locarveiculo);
    }
    
    @Override
    public ArrayList<LocarVeiculo> listaLocar() throws RemoteException {
        LocarVeiculoDAO dao = new LocarVeiculoDAO();
       return dao.listaLocar();
    }
    
    
}
