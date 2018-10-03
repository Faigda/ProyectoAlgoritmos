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
public interface Cola {
    
    public int getSize();

    public void anular();

    public boolean isEmpty();

    public void encolar(Object element) throws ColaException;

    public int getPosicion(Object elemento);

    public Object desencolar();

    public boolean exist(Object elemento);

    public Object front() throws ColaException;
    
}

