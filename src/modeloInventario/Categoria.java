/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloInventario;

import java.util.Date;

/**
 *
 * @author hanzo
 */
public class Categoria {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean activa;
    private Date fechaCreacion;
    
    // metodos
    public void agregarCategoria(){
    
    }
   public void eliminarCategoria(){
    
    }
    public void actualizarCategoria(){
    
    }
    
    public void mostrarCategoria(){
    
    }
    
    // getters 

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isActiva() {
        return activa;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
   

}