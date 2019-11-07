/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;

import java.util.ArrayList;
import server.entidades.LocarVeiculo;

/**
 *
 * @author lucas
 */

public class LocarVeiculoDAO {
   private final String LOCARVEICULO = "locarveiculo";
   private Persistencia persistencia;
   
   public LocarVeiculoDAO(){
       persistencia = new Persistencia();
   }
   
   public void saveLocar(LocarVeiculo locar){
       ArrayList<LocarVeiculo> lista = listaLocar();
       if(lista ==  null){
           lista = new ArrayList<LocarVeiculo>();
       }
       lista.add(locar);
       persistencia.saveLocar(LOCARVEICULO, lista);
   }
   
   public ArrayList<LocarVeiculo>listaLocar(){
       return(ArrayList<LocarVeiculo>)persistencia.loadLocar(LOCARVEICULO);
   }
}
