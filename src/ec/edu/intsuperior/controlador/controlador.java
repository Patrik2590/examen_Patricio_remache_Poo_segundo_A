/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Empresa;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
/**
 *
 * @author Usuario
 */
public class controlador {
    
    public void menu() {
    
         Scanner leer= new Scanner(System.in);
         int Op =  0 ;
        int Op1;
    
          {                
                System.out.println("Bienvenido al examen del primer bimestre\n"
                    + "Que desea hacer....\n"
                    + "1.- Registrar Empresa\n"
                    + "2.- Registrar empleado\n"
                    + "3.- Registrar clientes\n"
                    + "5.- Salir");
            Op = leer.nextInt();
            
            switch (Op){
                
            case 1:
               Empresa em1= Empresa();
                System.out.println("Ingrese ruc ");
                em1.setRuc(leer.next());
                break;
            case 2: 
               
                break;
            case 3:
                break;
              
            case 5: 
            JOptionPane.showMessageDialog(null, "gracias por reviasr el examen");
              break;
              
           }
                
            } Op1= 5;
            

              }

    private Empresa Empresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
