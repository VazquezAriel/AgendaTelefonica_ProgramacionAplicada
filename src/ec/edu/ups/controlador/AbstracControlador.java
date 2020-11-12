/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ariel
 */
public abstract class AbstracControlador<T> {
    
    private List<T> listado;

    public AbstracControlador() {
        listado = new ArrayList();
    }
    
    public abstract boolean validar(T objeto);
    
    public boolean crear(T objeto) {
        if (validar(objeto)) {
            return listado.add(objeto);
        } 
        return false;
    }
    
    public T buscar(T objetoBuscado){
        return listado.stream().filter(objeto -> objeto.equals(objetoBuscado)).findFirst().orElse(null);
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
    
    public int generarId() {
        if(listado.size() > 0) {
            return listado.indexOf(listado.get(listado.size() - 1 )) + 1;
        }
        return 1;
    }
    
    public List<T> getListado() {
        return listado;
    }

    public void setListado(List<T> listado) {
        this.listado = listado;
    }
}
