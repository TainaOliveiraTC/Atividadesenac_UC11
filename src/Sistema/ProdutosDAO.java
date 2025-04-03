package Sistema;

import Sistema.conectaDAO;
import Sistema.ProdutosDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO p){
        Connection conn = conectaDAO.connectDB();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO produtos(nome, valor, status)VALUES(?,?,?)");
            stmt.setString(1,p.getNome());
            stmt.setInt(2,p.getValor());
            stmt.setString(3,p.getStatus());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:(" + ex);
        }
    }
        
        
    
    
    //public List<ProdutosDTO> listarProdutos(){
        //Connection conn = conectaDAO.connectDB();
    
          //  return;s
    
    //}
    
    
    
        
}
