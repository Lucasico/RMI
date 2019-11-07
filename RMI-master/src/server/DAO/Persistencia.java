/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.DAO;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author lucas
 */
public class Persistencia {
    //--------------------cliente-----------------------//
    //classe para persistir os dados no doc.XML
    public void save(String fileName,Object object){
        XMLEncoder e;
        try{
            e = new XMLEncoder(
                    new BufferedOutputStream(
                         new FileOutputStream(fileName+".xml")));
            e.writeObject(object);
            e.close();
        }catch(FileNotFoundException el){
            el.printStackTrace();
        }
        
    }
    
    //classe para carregar os dados do doc.XML
    public Object load(String fileName){
        XMLDecoder d;
        try{
            d = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(fileName+".xml")));
            Object result = d.readObject();
            d.close();
            return result;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    
    //---------------------carro-----------------//
    
    public void saveCar(String fileName,Object object){
        XMLEncoder e;
        try{
            e = new XMLEncoder(
                    new BufferedOutputStream(
                         new FileOutputStream(fileName+".xml")));
            e.writeObject(object);
            e.close();
        }catch(FileNotFoundException el){
            el.printStackTrace();
        }
        
    }
    
    public Object loadCar(String fileName){
        XMLDecoder d;
        try{
            d = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(fileName+".xml")));
            Object result = d.readObject();
            d.close();
            return result;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    
    //---------------------locarCarro-----------------//
    
    public void saveLocar(String fileName,Object object){
        XMLEncoder e;
        try{
            e = new XMLEncoder(
                    new BufferedOutputStream(
                         new FileOutputStream(fileName+".xml")));
            e.writeObject(object);
            e.close();
        }catch(FileNotFoundException el){
            el.printStackTrace();
        }
        
    }
    
    public Object loadLocar(String fileName){
        XMLDecoder d;
        try{
            d = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(fileName+".xml")));
            Object result = d.readObject();
            d.close();
            return result;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
