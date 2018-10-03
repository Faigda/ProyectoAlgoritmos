/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import Utility.Cola;

/**
 * 
 * @author Jasson Rojas (Faigda)
 */
public class Canal {
    
    private Cola programas;
    private int numero;

    public Canal() {
        this.programas=null;
        this.numero=0;
    }

    public Canal(Cola programas, int numero) {
        this.programas = programas;
        this.numero = numero;
    }    

    public Cola getProgramas() {
        return programas;
    }

    public void setProgramas(Cola programas) {
        this.programas = programas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
