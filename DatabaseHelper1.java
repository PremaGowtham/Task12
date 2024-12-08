package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper1 {
	
	// mysql library should be added to POM
		
		 public static void main(String[] args) throws SQLException, ClassNotFoundException {

			 String sqlQuery = "SELECT * FROM Employee2";
		  // 1) Class for instantiation of the Driver Object 

		  Class.forName("com.mysql.cj.jdbc.Driver");

		  // 2) Establish the Connection to the Database 
	      Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Empl", "root" ,"premagowtham");

		  // 3) Create a Statement to run the sql query 
	      Statement statement = connection.createStatement();
		 
		  // 4) Execute the query and save its result in ResultSet object
	      ResultSet result = statement.executeQuery(sqlQuery);
	      
	   // 5) Retrieve the data from the ResultSet object 

	      while(result.next()) {

	       System.out.print(result.getInt(1)+ "  ");

	       System.out.print(result.getString(2)+ "  ");

	       System.out.print(result.getInt(3)+ "  ");

	       System.out.print(result.getInt(4)+ "  ");

	       System.out.println();

	      }

		 }

}
