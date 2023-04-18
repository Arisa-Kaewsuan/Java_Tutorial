package M;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnectDatabase.GlobalData;

public class UserManager 
{
		public static ArrayList<UserDB> getAllUser()     
		{
			 ArrayList<UserDB> list = new ArrayList<UserDB>();
			 try
			    {

			      String myDriver = "om.mysql.cj.jdbc.Driver";
			      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
			      
			      String query = "SELECT * FROM users";            
			      Statement st = conn.createStatement();
			      ResultSet rs = st.executeQuery(query);
			      
			      while (rs.next())
			      {
			    	  
			        int id = rs.getInt("Id");                        
			        String username = rs.getString("username");
			        String password = rs.getString("password");
			        String usertype = rs.getString("usertype");
			        
			        UserDB cc = new UserDB(id,username,password,usertype); 
			        list.add(cc);                                               
			      }
			      st.close();
			    }
			    catch (Exception e)
			    {
			    	e.printStackTrace();
			    }
	        return list; 
		}
		
		public static boolean checkLogin(String username , String password)
		{
			 ArrayList<UserDB> list = new ArrayList<UserDB>();
			 try
			    {
			      String myDriver = "om.mysql.cj.jdbc.Driver";
			      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
			      
			      String query = "SELECT * FROM users WHERE username = '"+username+"' AND password = '"+ password+"'";   
			      System.out.println( query);
			      Statement st = conn.createStatement();
			      ResultSet rs = st.executeQuery(query);
			      
			      while (rs.next())
			      {
			           GlobalData.CurrentUser_userID = rs.getInt(1); 
			           GlobalData.CurrentUser_username = rs.getString(2); 
			           GlobalData.CurrentUser_usertype = rs.getString(4); 
			           return true;
			      }
			      st.close();
			    }
			    catch (Exception e)
			    {
			    	e.printStackTrace();
			    }
			 
			 try
			    {
			      String myDriver = "om.mysql.cj.jdbc.Driver";
			      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
			      
			      String query = "SELECT * FROM users WHERE username = ? AND password = ?";   
			      System.out.println( query);
			      PreparedStatement st = conn.prepareStatement(query);
			      st.setString(1, username);
			      st.setString(2, password);
			      ResultSet rs = st.executeQuery();
			      
			      while (rs.next())
			      {
			           GlobalData.CurrentUser_userID = rs.getInt(1); 
			           GlobalData.CurrentUser_username = rs.getString(2); 
			           GlobalData.CurrentUser_usertype = rs.getString(4); 
			           return true;
			      }
			      st.close();
			    }
			    catch (Exception e)
			    {
			    	e.printStackTrace();
			    }
			 
			 
			 return false;
		}
		
		public static void saveNewUser(UserDB x)
		{
			try
		    {
		      String myDriver = "org.gjt.mm.mysql.Driver";
		      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD);      
		      String query = "INSERT INTO users VALUES (0 , '"+x.username+"' , '"+x.password+"' , '"+x.usertype+"')";
		      Statement st = conn.createStatement();
		      st.executeUpdate(query);
		
		      st.close();
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    }
		}
		

	}

