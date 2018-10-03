/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

/**
 * 
 * @author Jasson Rojas (Faigda)
 */
public class Programa {
    
    private String nombre, horario;
    private int edadMinima;

    public Programa() {
        this.nombre="";
        this.horario="";
        this.edadMinima=0;
    }

    public Programa(String nombre, String horario, int edadMinima) {
        this.nombre = nombre;
        this.horario = horario;
        this.edadMinima = edadMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
}
