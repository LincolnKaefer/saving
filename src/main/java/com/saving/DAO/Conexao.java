
package com.saving.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public static Connection conectarBD(){
        
        Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/saving";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,pass);
            System.out.println("Conectado nova forma");
            return conexao;
                     
                        
        } catch (Exception e) {
            System.out.println("Erro ao conectar");
            System.out.println(e);
            return null;
        }
                
        
    }
    
}
