package UTILS;

//import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
///**
// *
// * @author victo
// */
//public class Conexao {
//
//    public static Connection getConexao() {
//        try {
//            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto?useTimezone=true&serverTimezone=UTC", "root", "123456");
//            System.out.println("conectado com sucesso!");
//            return (Connection) connection;
//        } catch (SQLException e) {
//            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
//        }
//        return null;
//    }
//    
//    public static void main (String [] args){
//    
//        Conexao.getConexao();
//        
//    }
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws SQLException{
            
//		String url = "jdbc:mysql://localhost:3306/projeto?useTimezone=true&serverTimezone=UTC"; //Nome da base de dados
//		String user = "root"; //nome do usuário do MySQL
//		String password = "123456"; //senha do MySQL
               
		Connection conexao = null;
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto?useTimezone=true&serverTimezone=UTC", "root", "123456");

		return conexao;
	}
        

}