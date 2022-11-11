/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;




import Model.CadastroPaciente;
import UTILS.Conexao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.util.List;
//import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class CadastroDAO {

    private Connection connection = (Connection) Conexao.getConexao();
    
    public void save(CadastroPaciente cadastros) {
        try {
            PreparedStatement ps =  (PreparedStatement) connection.prepareStatement("INSERT INTO cadastroo ( nome, cpf, idade, endereco, telefone, comorbidade) VALUES (?,?,?,?,?,?)");
            ps.setString(1, "nome");
            ps.setString(2, "cpf");
            ps.setString(3, "idade");
            ps.setString(4, "endereco");
            ps.setString(5, "telefone");
            ps.setString(6, "Comorbidade");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(CadastroPaciente cadastros) {
        try {
            PreparedStatement ps =  (PreparedStatement) connection.prepareStatement("UPDATE cadastroo SET nome=?, cpf=?, idade=?, endereco=?, telefone=?, comorbidade=?, WHERE id=?");
            ps.setString(1, cadastros.getNome());
            ps.setString(2, cadastros.getCpf());
            ps.setString(3, cadastros.getIdade());
            ps.setString(4, cadastros.getEndereco());
            ps.setString(5, cadastros.getTelefone());
            ps.setString(6, cadastros.getComorbidade());
            ps.setInt(7, cadastros.getID());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveOrUpdate(CadastroPaciente cadastros) {
        if (cadastros.getID() == 0) {
            save(cadastros);
        } else {
            update(cadastros);
        }
    }

    public void delete(CadastroPaciente cadastros) {
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement("DELETE FROM cadastroo WHERE id=?");
            ps.setInt(1, cadastros.getID());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<CadastroPaciente> getAll() {
        List<CadastroPaciente> cadastroo = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement("SELECT * FROM cadastroo");
            ResultSet rs = (ResultSet) ps.executeQuery();

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
}
