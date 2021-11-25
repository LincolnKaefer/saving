package com.saving.DAO;

import com.saving.tela.TelaAlterarSenha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparaSqlAlterarSenha extends TelaAlterarSenha {
    
   
        
    
  
    public static void conectar() throws SQLException, InterruptedException{
             
    Connection conn = null;
    conn = Conexao.conectarBD();
    
    String senhaAlterada = TelaAlterarSenha.getNovaSenha();
    String comprador = TelaAlterarSenha.getUsuario();
    String compradorAjustado = "'"+comprador+"'";
    String sql = "UPDATE saving.usuario SET ds_senha="+senhaAlterada+" WHERE nm_usuario = "+compradorAjustado;
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.execute();
            stm.close();
            conn.close();
    
    }
    
    
    
}