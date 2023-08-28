package br.com.projeto.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection conexao;
	public Connection getConnection() throws SQLException {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/READ7NOVO");
		return conexao;
	}
}
