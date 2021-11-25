
package com.saving;

public class Retorno {
    
    private static int cotacao;
    private static String fornecedor;
    private static Double vInicial;
    private static Double vFinal;
    
    public void salvar(int cotacao, String fornecedor, Double vInicial, Double vFinal){
        Retorno.setCotacao(cotacao);
        Retorno.setFornecedor(fornecedor);
        Retorno.setvInicial(vInicial);
        Retorno.setvFinal(vFinal);
      
    }
    
    public Double saving(Double vInicial, Double vFinal){
         return vInicial-vFinal;
    }

     
    public static int getCotacao() {
        return cotacao;
    }

    
    public static void setCotacao(int aCotacao) {
        cotacao = aCotacao;
    }

    
    public static String getFornecedor() {
        return fornecedor;
    }

   
    public static void setFornecedor(String aFornecedor) {
        fornecedor = aFornecedor;
    }

    
    public static Double getvInicial() {
        return vInicial;
    }

   
    public static void setvInicial(Double avInicial) {
        vInicial = avInicial;
    }

  
    public static Double getvFinal() {
        return vFinal;
    }

   
    public static void setvFinal(Double avFinal) {
        vFinal = avFinal;
    }
    
    


    
    
 
}
