/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloFactura;

import java.util.Date;

/**
 *
 * @author hanzo
 */
public class Factura {
    private int id;
    private int numero;
    private int idCliente;
    private int idUsuario;
    private Date fecha;
    private double subtotal;
    private double descuento;
    private  double total;
    
    public void creaFactura(){
    
    }
    
    public void eliminarFactura(){
    
    }
    
    public void imprimirFactura(){
    
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setTotal(double total) {
        this.total = total;
    }
      
}
