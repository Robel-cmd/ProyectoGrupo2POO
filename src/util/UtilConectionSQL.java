/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hanzo
 */
public class UtilConectionSQL {
    
    private static String URL ="/home/hanzo/NetBeansProjects/sistemaGestionComercial01/src/dataBase/dataBaseTienda.db";
    private static Connection conectado =null;
    
    public static Connection conectar(){
        try{
            if (conectado == null || conectado.isClosed()){
                conectado= DriverManager.getConnection(URL);
                System.out.println("Base de datos, Conexion Exitosa ");
            }
        }catch(SQLException exception){ 
            System.out.println("Base de datos, error de Conexion "+ exception);
        }
        return conectado;
    
    }
}
