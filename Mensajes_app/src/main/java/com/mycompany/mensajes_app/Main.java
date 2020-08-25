/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;


import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int opcion = 0;
        
        
        ConexionMysql conexion = new ConexionMysql();          //se crea un objeto de tipo de conexión.
        
        try(Connection cmx = conexion.get_Connection()){      //se crea una validacion de la conexión.
            
        }catch(Exception e){
            System.out.println(e);
            
        }
        
        do{
            System.out.println("----------------------------");
            System.out.println("Aplicaion de mensajes");
            System.out.println("1. crear un mensaje");
            System.out.println("2. listar un mensaje");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");
            
            //Se lee la opción del menu
            opcion = sn.nextInt();
            
            switch(opcion){
                
                case 1: 
                    MensajesService.crearMensaje();
                    break;
                case 2: 
                    MensajesService.listarMensaje();
                    break;
                case 3: 
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    break;
        }
            
        }while(opcion != 5);
        
    }
    
}
