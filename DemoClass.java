//JDBC Connectivity

/*1. Import ---> java.sql
 *2. Load and Register --> oracle or mysql driver --> oracle.jdbc.driver.oracledriver
 *3. Create Connection -->
 *4. Create Statement
 *5. Execute query
 *6. Process Result
 *7. Close Connection
 * 
 * 
 */
import java.sql.*;


public class DemoClass {

	public static void main(String[] args) throws Exception {
		
		
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String password="system";
			String query="select * from student";
			
			
			//Step 1 Load the Driver Class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Step 2 Create connection object
			Connection con = DriverManager.getConnection(url, user, password);
			
			//Step 3 create the statement object
			Statement statement = con.createStatement();
			
			//Step 4 execute query
			ResultSet rs =statement.executeQuery(query);
			
			//step 5 to print the result
			rs.next();
			String name = rs.getString("name");
			
			System.out.println(name);
			
			//step 6 close the connection
			statement.close();
			con.close();
		

	}

}
