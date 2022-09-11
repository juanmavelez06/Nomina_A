/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nomina_a;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class Nomina_A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcion ; 
       
        
        
        do{
            System.out.println(" Bienvenido a empresa XYZ \n");
            
            System.out.println("Seleccione un cargo laboral \n 1.Operativo \n 2.Comercial" + "\n");
            opcion = input.nextInt();
          

            switch(opcion){

                case 1 -> {
                    System.out.println(" Por favor ingrese el nombre y primer apellido del empleado a liquidar  : ");
                    System.out.println(" NOTA importante : Los datos deben ser ingresado sin espacio" + "\n");
                    String nombre = input.next();
                    Operativos empleado_nombre = new Operativos(nombre);
                    
                    Operativos empleado;
                    empleado = new Operativos(nombre);
                    empleado.empleado();
                    
                    Operativos empleador;
                    empleador = new Operativos (nombre);
                    empleador.empleador();
                }
                    
                case 2 -> {
                    
                     System.out.println(" Por favor ingrese el nombre y primer apellido del empleado a liquidar  : " + "\n");
                     System.out.println(" NOTA importante : Los datos deben ser ingresado sin espacio" + "\n");
                     String nombre = input.next();
                     Comerciales nombre_empleado = new Comerciales(nombre);
                    
                     Comerciales empleado_Comerciales;
                     empleado_Comerciales = new Comerciales(nombre);
                     empleado_Comerciales.empleado();
        
                     Comerciales empleador_Comerciales;
                     empleador_Comerciales = new Comerciales(nombre);
                     empleador_Comerciales.empleador();
                    
                }
                  
              }
          
            System.out.println("Deseas continuar \n 1.Si \n 2.No");
            opcion = input.nextInt();
        }while(opcion == 1);
    
        
        
         
        
         
         
        
        
    }
}
