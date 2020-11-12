/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;

/**
 *
 * @author ariel
 */
public class ControladorTelefono extends AbstracControlador<Telefono> {

    @Override
    public boolean validar(Telefono objeto) {
        return true;
    }
    
}
