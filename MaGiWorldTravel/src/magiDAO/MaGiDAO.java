package magiDAO;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import magiworldtravelpassageiro.MaGi;

public class MaGiDAO{
        public void create(String nome, int cpf, int cep, String embarque, String destino, String endereco){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO magi (nome, cpf, cep, embarque, destino, endereco) VALUE(?,?,?,?,?,?)");
            stmt.setString(1, nome);
            stmt.setInt(2, cpf);
            stmt.setInt(3, cep);
            stmt.setString(4, embarque);
            stmt.setString(5, destino);
            stmt.setString(6, endereco);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvaro!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
            
    }
    
    public List<MaGi> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MaGi> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM magi");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                MaGi mg = new MaGi();
                mg.setId(rs.getInt("id"));
                mg.setNome(rs.getString("nome"));
                mg.setCpf(rs.getInt("cpf"));
                mg.setCep(rs.getInt("cep"));
                mg.setEmbarque("embarque");
                mg.setDestino("destino");
                mg.setEndereco("endereco");
                produtos.add(mg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaGiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
    }
    
    public void update(String nome, int cpf, int cep, String embarque, String destino, String endereco, int id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE magi SET nome = ?, cpf = ?, cep = ?, embarque = ?, destino = ?, endereco = ? WHERE id = ?");
            stmt.setString(1, nome);
            stmt.setInt(2, cpf);
            stmt.setInt(3, cep);
            stmt.setString(4, embarque);
            stmt.setString(5, destino);
            stmt.setString(6, endereco);
            stmt.setInt(7, id);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(int id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM magi WHERE id = ?");
            stmt.setInt(1, id);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
