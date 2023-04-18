package M;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import ConnectDatabase.GlobalData;

public class CustomerManager
{

	public static ArrayList<CustomerDB> getAllCustomer ()     // return ออกมาเป็น Arraylist ชื่อ method getAllCustomer
	{
		 ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
		 Connection con = null;
		 Statement st = null;
		 ResultSet rs = null;

		 String url = "jdbc:mysql://localhost:3306/test";
		 String user = "root";
		 String password = "";
		 try
		    {
			// con = DriverManager.getConnection(
			// "jdbc:mysql://localhost:3306/test?user=root&password=");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * From customer2 ");

		      /*String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
		      
		      String query = "SELECT * FROM customer2";          
		      Statement st = conn.createStatement();
		      ResultSet rs = st.executeQuery(query);*/
		      
		      while (rs.next())
		      {
		    	  int id = rs.getInt("id");
					 String firstName = rs.getString("name");
					 String lastName = rs.getString("surname");
					 String phone = rs.getString("phone");

					 CustomerDB cc = new CustomerDB(id,firstName,lastName,phone);
					 list.add(cc);

					 System.out.format("%d, %s, %s, %s \n", id, firstName, lastName, phone);
		       /* int id = rs.getInt("id");                       
		        String firstName = rs.getString("name");
		        String lastName = rs.getString("surname");
		        String phone = rs.getString("phone");
		        
		        CustomerDB cc = new CustomerDB(id,firstName,lastName,phone); 
		        list.add(cc);                                                
0		        System.out.format("%d, %s, %s, %s \n", id, firstName, lastName, phone); */
		      }
		      st.close();
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    }
        return list;  
	}
	
	public static void saveNewCustomer(CustomerDB x)
	{
		 ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
		 Connection con = null;
		 Statement st = null;
		 ResultSet rs = null;

		 String url = "jdbc:mysql://localhost:3306/test";
		 String user = "root";
		 String password = "";
		try
	    {

	      /*String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); */   
	      String query = "INSERT INTO customer2 VALUES (0 , '"+x.name+"' , '"+x.surname+"' , '"+x.phone+"')";
	      Statement st = conn.createStatement();
	      st.executeUpdate(query);
			  while (rs.next())
		      {
		    	  int id = rs.getInt("id");
					 String firstName = rs.getString("name");
					 String lastName = rs.getString("surname");
					 String phone = rs.getString("phone");

					 CustomerDB cc = new CustomerDB(id,firstName,lastName,phone);
					 list.add(cc);

					 System.out.format("%d, %s, %s, %s \n", id, firstName, lastName, phone);
		      }
	
	      st.close();
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	
	public static void editCustomer(CustomerDB x)
	{
		try
		{
			  String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
		      
		      String query = "UPDATE customer2 SET name = '"+ x.name +"' , surname = '\"+ x.surname +\"' , phone = '\"+ x.phone +\"' WHERE id = "+ x.id + "" ;           

		      Statement st = conn.createStatement();
		      
		      ResultSet rs = st.executeQuery(query);
		      st.executeUpdate(query);
		      st.close();
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
	
	public static void deleteCustomer(CustomerDB x)
	{
		
	}
	
	public static ArrayList<CustomerDB> searchCustomer (String s)     // return ออกมาเป็น Arraylist ชื่อ method getAllCustomer
	{
		 ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
		 try
		    {
		      String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
		      
		      String query = "SELECT * FROM customer2 WHERE name LIKE '"+s+"'  OR surname LIKE '"+s+"' ";          
		      Statement st = conn.createStatement();
		      ResultSet rs = st.executeQuery(query);
		      
		      while (rs.next())
		      {
		        int id = rs.getInt("id");                       
		        String firstName = rs.getString("name");
		        String lastName = rs.getString("surname");
		        String phone = rs.getString("phone");
		        
		        CustomerDB cc = new CustomerDB(id,firstName,lastName,phone); 
		        list.add(cc);                                                
		        System.out.format("%d, %s, %s, %s \n", id, firstName, lastName, phone); 
		      }
		      st.close();
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    }
        return list;  
	}
	
	public static void main (String [] args)  // unit Test
	{
		ArrayList<CustomerDB> ll = CustomerManager.getAllCustomer();
		System.out.println(ll.size());
	}


}
