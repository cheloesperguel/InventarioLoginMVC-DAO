/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.inventariomvcdao.controlador;

import com.ufro.inventariomvcdao.dao.UsuarioDAO;
import com.ufro.inventariomvcdao.modelo.Usuario;
import com.ufro.inventariomvcdao.vista.Login;
import com.ufro.inventariomvcdao.vista.VentanaInventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo Esperguel
 */
public class LoginController implements ActionListener{

    private Login vLogin;
    
    public LoginController(Login v) {
    
        this.vLogin = v;        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Extrar la informacion de los textfield
        
        String user = vLogin.getLoginTF().getText();
        String pass=  new String(vLogin.getPassTF().getPassword());
        
        UsuarioDAO uDAO = new UsuarioDAO();
        
        Usuario userBD = uDAO.getUsuarioByUser(user);
        
        
        if( userBD!=null && userBD.getPass().equals(pass)){
            System.out.println("LOGIN EXITOSO !!!!!");
            VentanaInventario vInventario = new VentanaInventario();
            vInventario.setVisible(true);
            vLogin.dispose();
        }else{
            JOptionPane.showMessageDialog(vLogin, "Error: Usuario o Contraseña invalidos");
        }
        
    }
    
}
