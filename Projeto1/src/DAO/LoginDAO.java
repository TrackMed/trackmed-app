/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Login;
import UTILS.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Victo
 */
public class LoginDAO {

    private final Connection connection;

    public LoginDAO()throws SQLException {
        this.connection = ConnectionFactory.createConnection();
    }
    
    public void save(Login login) {
        try {
            PreparedStatement ps =  connection.prepareStatement("INSERT INTO login (crm,senha) VALUES (?,?)");
            ps.setString(1, login.getCrm());
            ps.setString(2, login.getSenha());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Login efetudo com sucesso");
        } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void delete(Login login) {
//        try {
//            PreparedStatement ps = connection.prepareStatement("DELETE FROM login WHERE id=?");
//            ps.setInt(1, login.getID());
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "Login deletado com sucesso!");
//        } catch (SQLException ex) {
//        }
//    }


}