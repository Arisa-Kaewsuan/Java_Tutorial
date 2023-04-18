package M;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnectDatabase.GlobalData;

public class CompanyInfoManager {
	public  static CompanyInfoDB getCompanyInfo() {
		 ArrayList<CustomerDB> list = new ArrayList<CustomerDB>();
		 Connection con = null;
		 Statement st = null;
		 ResultSet rs = null;

		 String url = "jdbc:mysql://localhost:3306/test";
		 String user = "root";
		 String password = "";
		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * From customer2 ");
			/*String myDriver = "com.mysql.jdbc.Driver";
			String myUrl = "jdbc:mysql://" + GlobalData.DATABASE_LOCATION + ":" + GlobalData.DATABASE_PORT + "/"
					+ GlobalData.DATABASE_DATABASE_NAME;
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME,
					GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?

			String query = "SELECT * FROM company_info";
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
				/*CompanyInfoDB cc = new CompanyInfoDB();
				cc.id = rs.getInt("id");
				cc.company_name = rs.getString("company_name");
				cc.address = rs.getString("address");
				cc.phone = rs.getString("phone");
				cc.email = rs.getString("email");
				
				return cc;*/
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void edit(CompanyInfoDB x)
	{
		try
		{
			 /* String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://"+GlobalData.DATABASE_LOCATION+":"+GlobalData.DATABASE_PORT+"/"+GlobalData.DATABASE_DATABASE_NAME;
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, GlobalData.DATABASE_USERNAME, GlobalData.DATABASE_PASSWORD); // login เข้าใช้งาน ?
		      
		      String query = "UPDATE company_info SET company_name = '"+ x.company_name +"' , address = '"+ x.address +"' , phone = '"+ x.phone +"' , email = '\"+ x. email +\"' WHERE id = "+ x.id + "" ;           

		      Statement st = conn.createStatement();
		      
		      ResultSet rs = st.executeQuery(query);
		      st.executeUpdate(query);
		      st.close();*/
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
}
