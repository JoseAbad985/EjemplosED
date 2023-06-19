/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.est.practica.ed.uno.main;

import ec.edu.ups.est.practica.ed.uno.controlador.ControladorContacto;
import ec.edu.ups.est.practica.ed.uno.modelo.Agenda;
import ec.edu.ups.est.practica.ed.uno.vista.VistaContacto;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class PracticaEDUno {

    public static void main(String[] args) {
        VistaContacto vistaContacto = new VistaContacto();
        Agenda agenda = new Agenda();
        ControladorContacto controladorContacto = new ControladorContacto(vistaContacto, agenda);
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        
        
        do {
            System.out.println("""                              
                                Menu de Opciones 
                               1. Ingreso de Contacto
                               2. Buscar Contacto por nombre 
                               3. Eliminar Contacto por nombre 
                               4. Salir""");
            opcion = teclado.nextInt();
            
        switch (opcion) {
                case 1:
                    //Se registra un Cantante
                    controladorContacto.registrarContacto();
                    break;

                case 2:
                    //Se registra un Compositor
                    controladorContacto.verContacto();
                    break;

                case 3:
                    //Se regustra un Cliente
                    controladorContacto.eliminarContacto();
                    break;
                case 4:
                    System.out.println("Gracias ");
                    break;
                }
        }while (opcion != 4);
    }
    
}    
    
    
    
    

