package br.com.lucianokogut.model.dao;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {

	static final Dotenv dotenv = Dotenv.load();
	
	private static final String DRIVER = dotenv.get("DRIVER_MYSQL_8");
	//private static final String DRIVER = dotenv.get("DRIVER_MYSQL_5");

	private static final String BANCODADOS = dotenv.get("BANCODADOS");
	//private static final String BANCODADOS = dotenv.get("BANCODADOS_CLOUD");

	private static final String ENDERECO = dotenv.get("ENDERECO");
	//private static final String ENDERECO = dotenv.get("ENDERECO_CLOUD");
	//private static final String ENDERECO = dotenv.get("ENDERECO_EXT");
	
	//private static final String ENDERECO = "127.0.0.1"; //Endereço de rede da
	// própria placa de rede (IP de Loopback)
	
	// private static final String ENDERECO = "192.168.0.19"; //Endereço de rede de
	// outra máquina na rede interna (LAN)

	// private static final String ENDERECO = "52.91.67.246"; //Endereço de rede de
	// outra máquina em rede externa (WAN)

	// private static final String ENDERECO =
	// "ls-dbc9869ccfce2d64047cb125ac2a234c3f6b76b7.cki3j5maddog.us-east-1.rds.amazonaws.com";
	// //Endereço de DNS para uma instância em nuvem

	private static final String PORTABD = dotenv.get("PORTABD");

	private static final String CONEXAO = "jdbc:mysql://" + ENDERECO + ":" + PORTABD + "/" + BANCODADOS;

	private static final String USER = dotenv.get("USERBD");
	//private static final String USER = dotenv.get("USER_CLOUD");
	
	private static final String PASSWORD = dotenv.get("USERPASS");
	//private static final String PASSWORD = dotenv.get("PASSWORD_CLOUD");

	public static Connection getConnection() {
		try {
			Connection conn = null;
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(CONEXAO, USER, PASSWORD);
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Classe do Driver não foi encontrada.");
			System.out.println("Erro: " + e.getMessage());
			return null;
		} catch (SQLException e) {
			System.out.println("Erro ao obter a Connection.");
			System.out.println("Erro: " + e.getMessage());
			return null;
		}
	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento da conexão.");
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static Statement getStatement(Connection conn) {
		try {
			Statement stmt = conn.createStatement();
			return stmt;
		} catch (SQLException e) {
			System.out.println("Erro ao obter o Statement.");
			System.out.println("Erro: " + e.getMessage());
			return null;
		}
	}

	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento do Statement.");
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static PreparedStatement getPreparedStatement(Connection conn, String sql) {
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			return stmt;
		} catch (Exception e) {
			System.out.println("Erro ao obter o PreparedStatement.");
			System.out.println("Erro: " + e.getMessage());
			return null;
		}
	}

	public static PreparedStatement getPreparedStatementWithPk(Connection conn, String sql) {
		try {
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			return stmt;
		} catch (Exception e) {
			System.out.println("Erro ao obter o PreparedStatement.");
			System.out.println("Erro: " + e.getMessage());
			return null;
		}
	}

	public static void closePreparedStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento do PreparedStatement.");
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void closeResultSet(ResultSet result) {
		try {
			if (result != null) {
				result.close();
			}
		} catch (SQLException e) {
			System.out.println("Problema no fechamento do ResultSet");
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
