package config;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;
import org.flywaydb.core.Flyway;
import org.h2.tools.Server;

public class H2ServerConfig {
	
	private static final Logger logger = Logger.getLogger(H2ServerConfig.class);
	
	public static void startServer() {
		Server server = null;
		try {
			server = Server.createWebServer("-web", "-webPort", "8082").start();
			
			if (server.isRunning(true)) {
				
				Class.forName("org.h2.Driver");
				Connection conn = DriverManager.getConnection("jdbc:h2:mem:exames;INIT=CREATE SCHEMA IF NOT EXISTS exames;", "sa", "");
				logger.info("Connection Established: " + conn.getMetaData().getDatabaseProductName() + "/" + conn.getCatalog());
				
				Flyway.configure()
					.dataSource("jdbc:h2:mem:exames", "sa", "")
					.schemas("exames")
					.load().migrate();
			}
			
			//server.stop();

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error", e);
		}
	}
	
	public static void main(String[] args) {
		startServer();
	}
}
