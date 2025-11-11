/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;

/**
 *
 * @author hanzo
 */
public class ControladorLogin {
    public ControladorLogin() {
        System.out.println("Controlador de Login");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de usuario:");
        String id = scanner.nextLine();
        System.out.println("Ingrese la contraseña:");
        String password = scanner.nextLine();
    }


}
