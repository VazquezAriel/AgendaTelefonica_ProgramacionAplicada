/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ControladorPersona extends AbstracControlador<Persona>{

    @Override
    public boolean validar(Persona persona) {
        return true;
        
    }
    
    public List<Persona> buscarPorApellido(String apellido){
        return getListado().stream().filter(persona -> persona.getApellido().equals(apellido)).collect(Collectors.toList());
        
    }
    
    public List<Persona> buscarPorNumero(String numero){
        return getListado().stream().filter(persona -> persona.getTelefono().getNumero().equals(numero)).collect(Collectors.toList());
        
    }
    
    
}
