/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saving.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginBack {
    Connection conexao = null; //IRÁ FAZER A CONEXAO COM O BD
    PreparedStatement ps = null; // IRA FAZER AS OPERAÇOES NO BD
    ResultSet rs = null; // PEGA O RETORNO DE DENTRO DO BD
    
    public boolean autenticar(String usuario, String senha){
        boolean autorizado = false;
        
        try {
            conexao = Conexao.conectarBD();
            
            String sql = "select * from usuario where nm_usuario = ? and ds_senha = ?";
            ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            
            
            if(rs.next()) {
                autorizado =true;
                
            }
            
        } catch (Exception e) {
            System.out.println("Erro de login");
        }
        
        return autorizado;
        
    }
    
}

