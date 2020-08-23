/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;


import java.sql.Connection;

/**
 *
 * @author david
 */
public class Main {
    public static void main(String[] args) {
        ConexionMysql conexion = new ConexionMysql();
        
        try(Connection cmx = conexion.get_Connection()){
            
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}
