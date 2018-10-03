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
public interface Lista {
    
    //Devuelve el número de elementos en una lista
    public int getSize() throws ListaVaciaException;
    
    //Elimina toda la lista
    public void anular();
    
    //true si la lista está vacia
    public boolean isEmpty();
    
    public void insertar (Object element) throws ListaVaciaException;
    
    //Devuelve la posición de un elemento en la lista
    public int getPosicion (Object element);
    
    //agregar un elemento en forma ordenada, sin aceptar repetidos
    public void insertarOrdenado(Object element) throws ListaVaciaException;
    
    //Eliminar un elemento de la lista
    public void borrar(Object element);
    
    //Devuelve true si el elemento existe
    public boolean exists (Object element);
    
    //retorna el primer elemento de la lista
    public Object firstInList() throws ListaVaciaException;
    
    //retorna el ultimo elmento de la lista
    public Object lastInList() throws ListaVaciaException;
    
}

