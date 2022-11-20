package UTILS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws SQLException{
               
		Connection conexao = null;
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto?useTimezone=true&serverTimezone=UTC", "root", "123456");

		return conexao;
	}
        

}