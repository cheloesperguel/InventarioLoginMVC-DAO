/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.inventariomvcdao.modelo;

/**
 *
 * @author Marcelo Esperguel
 */
public class Usuario {
    
    private String user;
    private String pass;
    private int id;

    public Usuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Usuario(String user, String pass, int id) {
        this.user = user;
        this.pass = pass;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
   
}
