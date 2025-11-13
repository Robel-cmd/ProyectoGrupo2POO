/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloInventario;

/**
 *
 * @author hanzo
 */
public class Producto {
    private  int id;
    private  int codigo;
    private String nombre;
    private String descripcion;
    private double PrecioUnitario;
    private double PrecioMayorista;
    private int stock;
    private int Categoria;
    private boolean activo;
    
    // metodos
    public void agregarProducto(){
    
    }
    
    public void removerProducto(){
    
    }
    
    public void actualizarProducto(){
    
    }
    
    public void verProducto(){
    
    }
    
    // getters

    public int getId() {
        return id;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public double getPrecioMayorista() {
        return PrecioMayorista;
    }

    public int getStock() {
        return stock;
    }

    public int getCategoria() {
        return Categoria;
    }

    public boolean isActivo() {
        return activo;
    }
    
    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public void setPrecioMayorista(double PrecioMayorista) {
        this.PrecioMayorista = PrecioMayorista;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
