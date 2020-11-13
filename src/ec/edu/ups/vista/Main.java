/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Telefono;

/**
 *
 * @author ariel
 */
public class Main {
    
    public static void main(String[] args) {
        
        ControladorPersona personas = new ControladorPersona();
        ControladorTelefono telefonos = new ControladorTelefono();
        
        Persona p1 = new Persona(0, "0302610076", "Ariel", "Vazquez", "Av de los alcaldes", new Telefono());
        Persona p2 = new Persona(1, "030275", "Renato", "Calle", "Av 24 de mayo", new Telefono());
        Persona p3 = new Persona(2, "0302610072", "Adriana", "Gomez", "Azogues", new Telefono());
        Persona p4 = new Persona(2, "0302610070", "Erika", "Castro", "Cuenca", new Telefono());

        personas.crear(p1);
        personas.crear(p2);
        personas.crear(p3);
        personas.crear(p4);
                
        Telefono t1 = new Telefono(0, "0987969359", "Movistar", "movil");
        Telefono t2 = new Telefono(1, "0987969345", "Claro", "movil");
        Telefono t3 = new Telefono(2, "2243275", "cnt", "casa");
        Telefono t4 = new Telefono(3, "0987969633", "Tuenti", "movil");
        
        telefonos.crear(t1);
        telefonos.crear(t2);
        telefonos.crear(t3);
        telefonos.crear(t4);
        
        personas.imprimirListadoEnConsola();
        System.out.println("");
        telefonos.imprimirListadoEnConsola();
        System.out.println("");
    }
}
