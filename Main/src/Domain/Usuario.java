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
public class Usuario {
    
    private String nombre, usuario, contrasena;
    private int edad;

    public Usuario() {
        this.nombre="";
        this.usuario="";
        this.contrasena="";
        this.edad=0;
    }

    public Usuario(String nombre, String usuario, String contrasena, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
