/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.inventariomvcdao.dao;

import com.ufro.inventariomvcdao.modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Marcelo Esperguel
 */
public class UsuarioDAO {
    
    private Conexion con;

    public UsuarioDAO() {
        con = new Conexion();
    }
    
    public Usuario getUsuarioByUser(String user){
        
        Usuario u;
        Connection accesoBD = con.getConexion();
        String sql="SELECT * FROM usuario WHERE user='"+user+"'";
        try{
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if( rs.first() ) {
                String userBD = rs.getString("user");
                String passBD = rs.getString("pass");
                
                u = new Usuario(userBD, passBD);
                
                return u;
            }else {
                
                return null;
            }
        }catch(Exception e){
            System.out.println("Error al obtener usuario.");
            e.printStackTrace();
            return null;
        } 
        
        
    }
    
    
}
