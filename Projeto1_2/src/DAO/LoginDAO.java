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
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author Victo
 */
public class LoginDAO {

   Connection connection;
    
    public ResultSet autenticacaoUsuario(Login objusuarioDTO) throws SQLException{
       connection = new ConnectionFactory().createConnection();
       try{

            String sql = "SELECT * FROM login where crm = ? and senha = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, objusuarioDTO.getCrm());
            ps.setString(2, objusuarioDTO.getSenha());

            ResultSet rs = ps.executeQuery();
            
               
           
            return rs;
 
       } catch (SQLException erro){
           JOptionPane.showMessageDialog(null, "LoginDAO: " + erro);
           return null;
       }
       
    }

}