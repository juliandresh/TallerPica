package co.com.foundation.javeriana.sandbox.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import oracle.jdbc.OracleDriver;

@Path("/database")
@Component
public class DBService {

	@GET
	@Path("/process")
	@Produces({ MediaType.APPLICATION_XML })
	public String processCreditRequest() throws SQLException {

		DriverManager.registerDriver(new OracleDriver());

		for (int i = 0; i < 5; i++) {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MAINTENANCE", "qwerty");
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM MAINTENANCE_ASSIGMENTS");
			ResultSet set = ps.executeQuery();
			set.next();
			
		}
		
		return "<db-executed>" + new Date() + "</db-executed>";
	}
}
