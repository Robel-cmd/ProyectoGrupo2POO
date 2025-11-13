/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloFactura;

/**
 *
 * @author hanzo
 */
public class Detalle {
    private int id ;
    private int  idFactura;
    private int idProducto;
    private int cantidad;
    private double PrecioUnitario;
    private double totalFila;
    
    public void crearDetalle(){
    
    }
    
    public void imprimirDetalle(){
    
    }

    public int getId() {
        return id;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public double getTotalFila() {
        return totalFila;
    }
    
    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public void setTotalFila(double totalFila) {
        this.totalFila = totalFila;
    }
    
    
}
