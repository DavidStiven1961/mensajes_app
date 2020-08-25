/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje){
        ConexionMysql db_conexion = new ConexionMysql();
        try(Connection conexion = db_conexion.get_Connection()){
            PreparedStatement ps= null;
            try{
                String query ="INSERT INTO mensajes (mensaje,autor_mensaje) VALUES (?,?)"; 
                ps = conexion.prepareStatement(query);         
                ps.setString(1, mensaje.getMensajes());             
                ps.setString(2, mensaje.getAutor_mensajes());
                ps.executeUpdate();  // envia a la intrucion a la base de datos para que ejecute esta sentencia
                System.out.println("Mensaje creado");
                
            }catch(SQLException ex){
                System.out.println(ex);
            }
        
    }catch(SQLException e){
            System.out.println(e);
    }
        
        
    }
    
    public static void leerMensajeDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajesDB(Mensajes mensaje){
        
    }
}
