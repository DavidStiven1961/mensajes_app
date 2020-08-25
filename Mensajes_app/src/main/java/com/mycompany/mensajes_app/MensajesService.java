/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class MensajesService {
    
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensajesS = sc.nextLine();
        
        System.out.println("Escribe tu nombre");
        String autor = sc.nextLine();
        
        Mensajes mensaje = new Mensajes();
        mensaje.setMensajes(mensajesS);
        mensaje.setAutor_mensajes(autor);
        MensajesDAO.crearMensajeDB(mensaje);
    }
    
    public static void listarMensaje(){
        
    }
    public static void borrarMensaje(){
        
    }
    
    public static void editarMensaje(){
        
    }
}
