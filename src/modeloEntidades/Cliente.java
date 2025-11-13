/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloEntidades;

import java.util.Date;

/**
 *
 * @author hanzo
 */
public class Cliente {
    private int id;
    private String nombres;
    private String apellidos;
    private int dni;
    private int telefono;
    private Date fechaNacimiento;
    private int correo;
    
    // getters
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCorreo() {
        return correo;
    }
    
    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(int correo) {
        this.correo = correo;
    }
    
    

    
}
