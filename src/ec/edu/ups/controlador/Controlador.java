/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class Controlador <T>{
    
     private List<T> listado;
     private int tamaño;

    public Controlador() {
        listado = new ArrayList();
        tamaño = 0;
        
    }

    public Controlador(List<T> listado, int tamaño) {
        this.listado = listado;
        this.tamaño = tamaño;
        
    }
    
    public boolean crear(T objeto) {
         return listado.add(objeto);
        
    }
    
    public List<T> buscar(T objetoBuscado){
        return listado.stream().filter(objeto -> objeto.equals(objetoBuscado)).collect(Collectors.toList());
        
    }
    
    public boolean actualizar(T objetoActalizado) {
        for (T objeto : listado) {
            if (objeto.equals(objetoActalizado)) {
                listado.set(listado.indexOf(objeto), objetoActalizado);
                return true;
            }
            
        }
        return false;
    }
    
    public boolean eliminar(T objeto) {
        return listado.remove(objeto);
        
    }
    
    public List<T> listar() {
        return listado;
    }
}
