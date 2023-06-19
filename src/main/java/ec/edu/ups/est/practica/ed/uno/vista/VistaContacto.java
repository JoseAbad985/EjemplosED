/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.ed.uno.vista;
import ec.edu.ups.est.practica.ed.uno.modelo.Contacto;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class VistaContacto<T> {
    
    
    public Contacto ingresarContacto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el telefono: ");
        String telefono = teclado.nextLine();
        
        return new Contacto(telefono, nombre);
    }
    
    public String pedirNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del contacto a buscar: ");
        String nombre = teclado.nextLine();
        return nombre;
    }
}
