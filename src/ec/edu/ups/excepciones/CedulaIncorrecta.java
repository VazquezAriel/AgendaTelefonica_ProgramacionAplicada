/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author ariel
 */
public class CedulaIncorrecta extends Exception{
    
    public CedulaIncorrecta() {
    }

    public CedulaIncorrecta(String mensaje) {
        super(mensaje);
    }
}
