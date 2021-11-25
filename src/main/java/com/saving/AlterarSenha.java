/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saving;

public class AlterarSenha {
    
    private static String usuario;
    private static String senhaAlterada;

    public void alteracaoSenha(String usuario, String senhaAlterada){
        AlterarSenha.setUsuario(usuario);
        AlterarSenha.setSenhaAlterada(senhaAlterada);
    }
    

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        AlterarSenha.usuario = usuario;
    }

    public static String getSenhaAlterada() {
        return senhaAlterada;
    }

    public static void setSenhaAlterada(String senhaAlterda) {
        AlterarSenha.senhaAlterada = senhaAlterada;
    }
      
    
}
