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
public class ColaPrioridad implements Cola {

    Nodo anterior, posterior;

    public ColaPrioridad() {
        anterior = posterior = null;
    }

    @Override
    public int getSize() {
        Nodo aux = anterior;
        if (isEmpty()) {
            throw new ColaException("la cola está vacia");
        }

        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.sgte;
        }
        return cont;
    }

    @Override
    public void anular() {
        anterior = posterior = null;
    }

    @Override
    public boolean isEmpty() {
        return anterior == null;
    }

    @Override
    public void encolar(Object element) throws ColaException {
        if (isEmpty()) {
            posterior = new Nodo(element);
            anterior = posterior;
        } else {
            posterior.sgte = new Nodo(element);
            posterior = posterior.sgte;
        }
    }

    @Override
    public int getPosicion(Object elemento) {
        Nodo aux = anterior;
        if (isEmpty()) {
            throw new ColaException("la cola está vacia");
        }
        int cont = 1;
        while (aux != null) {
            if (aux.elemento.equals(elemento)) {
                return cont;
            }
            cont++;
            aux = aux.sgte;
        }
        return -1;
    }

    @Override
    public Object desencolar() {
        if (isEmpty()) {
            throw new ColaException("la cola está vacia");
        }
        Object retornar = anterior.elemento;
        anterior = anterior.sgte;

        return retornar;

    }

    @Override
    public boolean exist(Object elemento) {
        if (isEmpty()) {
            throw new ColaException("Cola vacia");
        }
        Nodo aux = anterior;
        while (aux != null) {
            if (aux.elemento.equals(elemento)) {
                return true;
            }
            aux = aux.sgte;
        }

        return false;
    }

    @Override
    public Object front() throws ColaException {
        if (isEmpty()) {
            throw new ColaException("Cola vacia");
        }

        return anterior.elemento;
    }

}
