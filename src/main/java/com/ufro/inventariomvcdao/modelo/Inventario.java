/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.inventariomvcdao.modelo;

import java.util.ArrayList;

/**
 *
 * @author Marcelo Esperguel
 */
public class Inventario {
    
    private String nombre;
    private int id;
    private ArrayList<Producto> pdctos;
    
    public Inventario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        pdctos= new ArrayList<>();
    }
    
    public Inventario(String nombre) {
        this.nombre = nombre;
        pdctos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
