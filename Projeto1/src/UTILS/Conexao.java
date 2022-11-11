package UTILS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class Conexao {

    public static Connection getConexao() {
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto?useTimezone=true&serverTimezone=UTC", "root", "123456");
            System.out.println("conectado com sucesso!");
            return (Connection) connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
        }
        return null;
    }
    
    public static void main (String [] args){
    
        Conexao.getConexao();
        
    }
}