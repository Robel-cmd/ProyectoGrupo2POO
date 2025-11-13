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
public class Usuario {
    // atributos
    private int id;
    private String nombress;
    private String apellidos;
    private String genero;
    private int dni;
    private int telefono;
    private int correo;
    private String contraseña;
    private Date fechaNacimiento;
    private int rol;
   
    
    public void registrarUsuario(){
        
    }
    public void eliminarUsuario(){
        
    }
    public void actualizarUsuario(){
        
    }
    
    public void buscarUsuario(){
    
    }

    public int getId() {
        return id;
    }

    public String getNombress() {
        return nombress;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
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

    public String getContraseña() {
        return contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getRol() {
        return rol;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombress(String nombress) {
        this.nombress = nombress;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
    
}
