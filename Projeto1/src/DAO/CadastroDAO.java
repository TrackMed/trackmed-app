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
import javax.swing.JTable;

/**
 *
 * @author victo
 */
public class CadastroDAO {

    private final Connection connection;
    public JTable getAll;

    public CadastroDAO() throws SQLException {
        this.connection = ConnectionFactory.createConnection();
    }
    
    public void save(CadastroPaciente cadastros) {
        try {
            PreparedStatement ps =  connection.prepareStatement ("INSERT INTO cadastroo (nome,cpf,idade,endereco,telefone,comorbidade) VALUES (?,?,?,?,?,?)");
            ps.setString(1, cadastros.getNome());
            ps.setString(2, cadastros.getCpf());
            ps.setString(3, cadastros.getIdade());
            ps.setString(4, cadastros.getEndereco());
            ps.setString(5, cadastros.getTelefone());
            ps.setString(6, cadastros.getComorbidade());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        }  catch (SQLException ex) {
           Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void update(CadastroPaciente cadastros) {
//        try {
//            PreparedStatement ps =  (PreparedStatement) connection.prepareStatement("UPDATE cadastroo SET nome=?, cpf=?, idade=?, endereco=?, telefone=?, comorbidade=?, WHERE id=?");
//            ps.setString(1, cadastros.getNome());
//            ps.setString(2, cadastros.getCpf());
//            ps.setString(3, cadastros.getIdade());
//            ps.setString(4, cadastros.getEndereco());
//            ps.setString(5, cadastros.getTelefone());
//            ps.setString(6, cadastros.getComorbidade());
//            ps.setInt(7, cadastros.getID());
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
//        } catch (SQLException ex) {
//        }
//    }

//    public void saveOrUpdate(CadastroPaciente cadastros) {
//        if (cadastros.getID() == 0) {
//            save(cadastros);
//        } else {}
//    }

//    public void delete(CadastroPaciente cadastros) {
//        
//       CadastroPaciente adastros = new CadastroPaciente();
//       
//            cadastros.setNome(" ");
//            cadastros.setCpf(" ");
//            cadastros.setIdade(" ");
//            cadastros.setEndereco(" ");
//            cadastros.setTelefone(" ");
//            cadastros.setComorbidade(" ");
//        
//        try {
//            PreparedStatement ps = connection.prepareStatement("DELETE FROM cadastroo WHERE id=?");
//            ps.setInt(1, cadastros.getID());
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
//        } catch (SQLException ex) {
//            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    

    public List<CadastroPaciente> getAll() {
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
                cadastroo.add(cadastros);
            }
            return cadastroo;
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
//    public void listar (){
//        //1: Definir o comando SQL
//        String sql = "SELECT * FROM cadastroo";
//        //2: Abrir uma conexão
//        ConnectionFactory factory = new ConnectionFactory();
//        try (Connection c = factory.obtemConexao()){
//            //3: Pré compila o comando
//            PreparedStatement ps = c.prepareStatement(sql);
//            //4: Executa o comando e guarda
//            //o resultado em um ResultSet
//            ResultSet rs = ps.executeQuery();
//            //5: itera sobre o resultado
//            String aux = "";
//            while (rs.next()){
//                int ID = rs.getInt("ID");
//                String nome = rs.getString("nome");
//                String cpf = rs.getString("cpf");
//                String idade = rs.getString("Idade");
//                String endereco = rs.getString("endereco");
//                String telefone = rs.getString("telefone");
//                String Comorbidade = rs.getString("Comorbidade");
//                aux = aux + String.format("ID: %d, nome: %s, cpf: %s, idade: %s, endereco: %s, telefone: %s, Comorbidade: %s", ID, nome, cpf, idade, endereco, telefone, Comorbidade ) +"\n";
//                //JOptionPane.showMessageDialog (null, aux);
//            }
//            JOptionPane.showMessageDialog (null, aux);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    
}
