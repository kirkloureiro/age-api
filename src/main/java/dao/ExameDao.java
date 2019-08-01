package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.H2ServerConfig;
import model.Exame;

public class ExameDao {

	
	static {
		H2ServerConfig.startServer();
	}
	
	public void createExam(Exame exame) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:mem:exames;", "sa", "");
			Statement statement = conn.createStatement();

			// insert the data
			statement.executeUpdate("INSERT INTO EXAMES.TB_EXAME(NOME_CLIENTE, TIPO_EXAME, OBSERVACAO) VALUES('" + exame.getNomeExame() + "','" + exame.getTipoExame() + "','" + exame.getObservacao() + "') ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Exame> readAllExams() {
		List<Exame> resultList = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:mem:exames;", "sa", "");
			PreparedStatement statement =conn.prepareStatement("SELECT * from EXAMES.TB_EXAME;");
			ResultSet rs = statement.executeQuery();
			
	        while (rs.next()) {
	        	resultList.add(new Exame(rs.getLong("ID"),
	        			rs.getString("NOME_CLIENTE"),
	        			rs.getString("TIPO_EXAME"),
	        			rs.getString("OBSERVACAO")));
	        }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resultList;
	}
	
	public void updateExam(Exame exame) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:mem:exames;", "sa", "");
			Statement statement = conn.createStatement();

			statement.executeUpdate("UPDATE EXAMES.TB_EXAME  SET NOME_CLIENTE='TEST', TIPO_EXAME='MAMOGRAFIA', OBSERVACAO='TESTE Edicao' WHERE ID = " + exame.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Ops");
			e.printStackTrace();
		}
	}
	
	public void deleteExam(Long examId) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:mem:exames;", "sa", "");
			Statement statement = conn.createStatement();

			statement.executeUpdate("DELETE FROM EXAMES.TB_EXAME  WHERE ID = " + examId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
