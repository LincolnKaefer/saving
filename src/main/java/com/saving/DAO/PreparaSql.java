
package com.saving.DAO;
import com.saving.Retorno;
import com.saving.tela.TelaLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparaSql extends Retorno {
    
    ResultSet rs;
    
    public static void conectar() throws SQLException, InterruptedException{
             
    Connection conn = null;
    conn = Conexao.conectarBD();
    
    
    TelaLogin login = new TelaLogin();    
    
    String comprador = TelaLogin.getUsuario();
    int cotacao = Retorno.getCotacao();
    String fornecedor = Retorno.getFornecedor();
    double valInicial = Retorno.getvInicial();
    double valFinal = Retorno.getvFinal();
    System.out.println("cotacao "+ cotacao);

    String sql =  "insert into cotacoes (cotacao,fornecedor,valinicial,valfinal,comprador) values(?,?,?,?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,cotacao);
            stm.setString(2,fornecedor);
            stm.setDouble(3,valInicial);
            stm.setDouble(4,valFinal);
            stm.setString(5,comprador);
            stm.execute();
            stm.close();
            conn.close();
    
            
            
            
    }
    
    public Retorno consultar(String comprador) throws SQLException{
        
        Retorno retorno = new Retorno();
        Connection conn = null;
        conn = Conexao.conectarBD();
        String sql = "SELECT * FROM cotacoes WHERE comprador = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, comprador);
        ResultSet rs = stm.executeQuery();
        
        if(rs.next()){
            retorno.salvar(0, comprador, Double.NaN, Double.NaN);
            
        }
        return null;
   
    } 
    
}
