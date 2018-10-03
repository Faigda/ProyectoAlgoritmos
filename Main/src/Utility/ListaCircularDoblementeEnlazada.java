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
public class ListaCircularDoblementeEnlazada implements Lista {

    Nodo inicio;
    Nodo fin;

    public ListaCircularDoblementeEnlazada() {
        inicio = fin = null;
    }

    @Override
    public int getSize() throws ListaVaciaException {
        if (isEmpty()) {
            throw new ListaVaciaException("Lista vacía");
        }
        Nodo auxiliar = inicio;
        int c = 0;

        while (auxiliar != fin) {
            c++;
            auxiliar = auxiliar.sgte;
        }
        return c + 1;
    }

    @Override
    public void anular() {
        inicio = fin = null;
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public void insertar(Object element) throws ListaVaciaException {
        Nodo auxiliar = inicio;
        Nodo nuevoNodo = new Nodo(element);

        if (isEmpty()) {
            inicio = fin = nuevoNodo;
        } else {
            while (auxiliar != fin) {
                auxiliar = auxiliar.sgte;
            }
            auxiliar.sgte = nuevoNodo;
            nuevoNodo.ant = auxiliar;
            fin = nuevoNodo;
        }
        //realizamos el doble enlace
        fin.sgte = inicio;
        inicio.ant = fin;
        System.out.println("Agregamos el elemento: " + element);
    }

    @Override
    public int getPosicion(Object element) {
        int c = 1;
        if (isEmpty()) {
            throw new ListaVaciaException("Lista vacía");
        }
        Nodo auxiliar = inicio.sgte;
        if (inicio.elemento.equals(element)) {
            return c;
        }
        while (auxiliar != inicio) {
            if (auxiliar.elemento.equals(element)) {
                return c + 1;
            }
            c++;
            auxiliar = auxiliar.sgte;
        }
        return -1;
    }

    @Override
    public void insertarOrdenado(Object element) {
        if (isEmpty()) {//si la lista esta vacia solo inserta normal
            inicio = fin = new Nodo (element);
        }
        Nodo aux = inicio;
        Nodo nodoAnterior = null;
        boolean continuar = true;
        while (aux != fin) {
            if ((int) inicio.elemento > (int) element) {
                Nodo temp = new Nodo(element);
                temp.sgte = inicio;
                inicio = temp;
                continuar = false;
                break;
            } else {
                if ((int) aux.elemento > (int) element) {
                    Nodo temp = new Nodo(element);
                    temp.sgte = aux;
                    nodoAnterior.sgte = temp;
                    continuar = false;
                    break;
                }
            }
            nodoAnterior = aux;
            aux = aux.sgte;
        }
        if (continuar) {
            insertar(element);
        }
        fin.sgte = inicio;
        inicio.ant = fin;
        
    }

    @Override
    public void borrar(Object element) {
        if (isEmpty()) {
            throw new ListaVaciaException("Lista vacía");
        }
        Nodo auxiliar = inicio;

        if (inicio.elemento.equals(element)) {
            inicio = inicio.sgte;
            inicio.ant = fin;
        } else {
            while (auxiliar != fin && !auxiliar.elemento.equals(element)) {
                auxiliar = auxiliar.sgte;
            }
            if (auxiliar.elemento.equals(element)) {
                auxiliar.ant.sgte = auxiliar.sgte;
            }
            if (auxiliar == fin) {
                fin = auxiliar.ant;
            }
        }
        fin.sgte = inicio;
        inicio.ant = fin;

        if (inicio == fin && inicio.elemento.equals(element)) {
            anular();
        }
    }

    @Override
    public boolean exists(Object element) {
        if (isEmpty()) {
            throw new ListaVaciaException("Lista vacia");
        }
        Nodo auxiliar = inicio.sgte;
        if (inicio.elemento.equals(element)) {
            return true;
        }
        while (auxiliar != inicio) {
            if (auxiliar.elemento.equals(element)) {
                return true;
            }
            auxiliar = auxiliar.sgte;
        }
        return false;
    }

    @Override
    public Object firstInList() throws ListaVaciaException {
        if (isEmpty()) {
            throw new ListaVaciaException("Lista Vacía");
        }
        return inicio.elemento;
    }

    @Override
    public Object lastInList() throws ListaVaciaException {
        if (isEmpty()) {
            throw new ListaVaciaException("Lista Vacía");
        }
        return fin.elemento;
    }

}
