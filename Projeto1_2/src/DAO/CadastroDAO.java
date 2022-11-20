/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;




import Model.CadastroPaciente;
import UTILS.ConnectionFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author victo
 */
public class CadastroDAO {

    public static void setRowSorter(TableRowSorter tableRowSorter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Connection connection;

    public CadastroDAO() throws SQLException {
        this.connection = ConnectionFactory.createConnection();
    }
    
    public void save(CadastroPaciente cadastros) {
        try {
            PreparedStatement ps =  connection.prepareStatement ("INSERT INTO cadastroo (nome,cpf,idade,endereco,telefone,comorbidade,situacao) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, cadastros.getNome());
            ps.setString(2, cadastros.getCpf());
            ps.setString(3, cadastros.getIdade());
            ps.setString(4, cadastros.getEndereco());
            ps.setString(5, cadastros.getTelefone());
            ps.setString(6, cadastros.getComorbidade());
            ps.setString(7, cadastros.getSituacao());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
            
            
            
        }  catch (SQLException ex) {
           Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

   public List<CadastroPaciente> getAll(String c) {
        List<CadastroPaciente> cadastroo = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM cadastroo WHERE cpf=?");
             ps.setString(1, c); 
            ResultSet rs = ps.executeQuery();
            String aux = "";
            while (rs.next()) {
                CadastroPaciente cadastros = new CadastroPaciente();
                cadastros.setID(rs.getInt("ID"));
                cadastros.setNome(rs.getString("nome"));
                cadastros.setIdade(rs.getString("idade"));
                cadastros.setCpf(rs.getString("cpf"));
                cadastros.setEndereco(rs.getString("endereco"));
                cadastros.setTelefone(rs.getString("telefone"));
                cadastros.setComorbidade(rs.getString("Comorbidade"));
                cadastros.setSituacao(rs.getString("situacao"));
                cadastroo.add(cadastros);
                aux = String.format(" ID: %d\n Nome: %s\n CPF: %s\n Idade: %s\n Endereco: %s\n Telefone: %s\n Comorbidade: %s\n Situacao: %s", cadastros.getID(), cadastros.getNome(), cadastros.getCpf(), cadastros.getIdade(), cadastros.getEndereco(), cadastros.getTelefone(), cadastros.getComorbidade(), cadastros.getSituacao()) +"\n";
                JOptionPane.showMessageDialog (null, aux);
                
                              
            }
            return cadastroo;
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public List<CadastroPaciente> listar() {
        List<CadastroPaciente> cadastroo = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM cadastroo"); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CadastroPaciente cadastros = new CadastroPaciente();
                cadastros.setID(rs.getInt("ID"));
                cadastros.setNome(rs.getString("nome"));
                cadastros.setIdade(rs.getString("idade"));
                cadastros.setCpf(rs.getString("cpf"));
                cadastros.setEndereco(rs.getString("endereco"));
                cadastros.setTelefone(rs.getString("telefone"));
                cadastros.setComorbidade(rs.getString("Comorbidade"));
                cadastros.setSituacao(rs.getString("situacao"));
                cadastroo.add(cadastros);
            }
            return cadastroo;
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public void deletar(int ID) {
        
        try {
            CadastroPaciente cadastros = new CadastroPaciente();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM cadastroo WHERE id=?"); 
            ps.setInt(1, ID);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
           }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o cadastro!");
           }
    }
//     
//         public void alterar(int ID) {
//        try {
//            CadastroPaciente cadastros = new CadastroPaciente();
//            PreparedStatement ps =  connection.prepareStatement ("UPDATE cadastroo set nome=?,cpf=?,idade=?,endereco=?,telefone=?,comorbidade=?,situacao=?  WHERE id=?");
//            ps.setString(1, cadastros.getNome());
//            ps.setString(2, cadastros.getCpf());
//            ps.setString(3, cadastros.getIdade());
//            ps.setString(4, cadastros.getEndereco());
//            ps.setString(5, cadastros.getTelefone());
//            ps.setString(6, cadastros.getComorbidade());
//            ps.setString(7, cadastros.getSituacao());
//            ps.setInt(8, ID);
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);   
//            
//        }  catch (SQLException ex) {
//           Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
