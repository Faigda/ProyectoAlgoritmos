/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author Jasson Rojas (Faigda)
 */
public class Nodo {

    public Object elemento;//Información del nodo
    public Nodo ant, sgte;

    public Nodo(Object elemento) {
        this.elemento = elemento;

        //Controla el apuntador del nodo, adelante o atrás
        this.ant = this.sgte = null;
    }

}
