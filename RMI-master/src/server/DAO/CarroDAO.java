/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;

import java.util.ArrayList;
import server.entidades.Carro;


/**
 *
 * @author lucas
 */
public class CarroDAO {
    private final String CARRO = "carro";
    private Persistencia persistencia;
    
    
    //construtor que vai inicializar uma nova instancia de persistencia 
    public CarroDAO(){
        persistencia = new Persistencia();
    }
    
    public void saveCar(Carro carro){
        ArrayList<Carro> lista = listaCar();
        if(lista == null){
            lista = new ArrayList<Carro>();
        }
        lista.add(carro);
        persistencia.saveCar(CARRO, lista);
    }
    //metodo de lista
    public ArrayList<Carro>listaCar(){
        return (ArrayList<Carro>) persistencia.loadCar(CARRO);
    }
    
}
