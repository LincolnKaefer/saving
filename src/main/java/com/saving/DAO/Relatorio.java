package com.saving.DAO;


import com.saving.tela.RelatorioSaving;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;







public class Relatorio{
  
        
    int id;
    String cotacao, fornecedor, comprador, data, valinicial, valfinal, saving, compra, dataInicialFiltro,
            dataFinalFiltro, totalSaving;
     
    public static void main(String[] args) {
        
        
    }
    
    
    
    public void pegaDadosBd(int id, String cotacao, String fornecedor, 
            String valinicial, String valfinal, String comprador, String data, String saving){
        
        this.id = id;
        this.cotacao = cotacao;
        this.fornecedor = fornecedor;
        this.valinicial = valinicial;
        this.valfinal = valfinal;
        this.comprador= comprador;
        this.data = data;
        this.saving = saving;
              
    }
    
 
    
    public ArrayList<Relatorio> listar(){
        
        
        ArrayList<Relatorio> dados = new ArrayList<Relatorio>();
           
        Connection con = Conexao.conectarBD();
        
        PreparedStatement psm = null;
        
        ResultSet rs = null;
        
        
        compra = RelatorioSaving.getCompradorrr();
        String teste = "teste";
        System.out.println(teste);
        dataInicialFiltro = RelatorioSaving.getDataInicialFiltro();
        dataFinalFiltro = RelatorioSaving.getDataFinalFiltro();
       
        System.out.println("compra "+compra);
        System.out.println("DatainicialFiltro "+dataInicialFiltro);
        
        
            try {
                
                if(compra.equals("Todos")){
                    psm = con.prepareStatement("SELECT cotacao, comprador, fornecedor, "
                        + "valinicial, valfinal, DATA,"
                        + "SUM(valinicial-valfinal) as saving FROM cotacoes "
                        + "WHERE DATA BETWEEN '"+dataInicialFiltro+"'AND '"+dataFinalFiltro+"'"
                        + "GROUP BY cotacao, fornecedor, valinicial, valfinal, comprador, DATA ORDER BY id;");

                rs = psm.executeQuery();
                
                while(rs.next()){
                    Relatorio relatorio = new Relatorio();
                    
                    //relatorio.setId(rs.getInt(1));
                    relatorio.setCotacao(rs.getString("cotacao"));
                    relatorio.setFornecedor(rs.getString("fornecedor"));
                    relatorio.setValinicial(rs.getString("valinicial"));
                    relatorio.setValfinal(rs.getString("valfinal"));
                    relatorio.setComprador(rs.getString("comprador"));
                    relatorio.setData(rs.getString("data"));
                    relatorio.setSaving(rs.getString("saving"));
                    
                    dados.add(relatorio);
                    
                }
                }else{
                
                psm = con.prepareStatement("SELECT cotacao, comprador, fornecedor, "
                        + "valinicial, valfinal, DATA,"
                        + "SUM(valinicial-valfinal) as saving FROM cotacoes "
                        + "WHERE DATA BETWEEN '"+dataInicialFiltro+"'AND '"+dataFinalFiltro+"' AND comprador = '"+compra+"' "
                        + "GROUP BY cotacao, fornecedor, valinicial, valfinal, comprador, DATA ORDER BY id;");

                rs = psm.executeQuery();
                
                while(rs.next()){
                    Relatorio relatorio = new Relatorio();
                    
                    //relatorio.setId(rs.getInt(1));
                    relatorio.setCotacao(rs.getString("cotacao"));
                    relatorio.setFornecedor(rs.getString("fornecedor"));
                    relatorio.setValinicial(rs.getString("valinicial"));
                    relatorio.setValfinal(rs.getString("valfinal"));
                    relatorio.setComprador(rs.getString("comprador"));
                    relatorio.setData(rs.getString("data"));
                    relatorio.setSaving(rs.getString("saving"));
                    
                    dados.add(relatorio);
                    
                }
                
                System.out.println(dados);
                
                
                
                }   
            } catch (SQLException ex) {
                Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
            }
             

        
         return dados;
         
         
     }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCotacao() {
        return cotacao;
    }

    public void setCotacao(String cotacao) {
        this.cotacao = cotacao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValinicial() {
        return valinicial;
    }

    public void setValinicial(String valinicial) {
        this.valinicial = valinicial;
    }

    public String getValfinal() {
        return valfinal;
    }

    public void setValfinal(String valfinal) {
        this.valfinal = valfinal;
    }
    
     public String getSaving() {
        return saving;
    }

    private void setSaving(String saving) {
        this.saving = saving;
        
        
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public String getDataInicialFiltro() {
        return dataInicialFiltro;
    }

    public void setDataInicialFiltro(String dataInicialFiltro) {
        this.dataInicialFiltro = dataInicialFiltro;
    }

    public String getDataFinalFiltro() {
        return dataFinalFiltro;
    }

    public void setDataFinalFiltro(String dataFinalFiltro) {
        this.dataFinalFiltro = dataFinalFiltro;
    }
    
    

}
        

        