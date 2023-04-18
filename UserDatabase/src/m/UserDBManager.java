package m;

import java.sql.*;
import java.util.ArrayList;

import common.GlobalData;

public class UserDBManager // select delete insert update
{
	// S E L E C T
	public static ArrayList<UserDB> getAllUsers()
	{
		ArrayList<UserDB> list = new ArrayList<UserDB>();

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			System.out.println(url);
			System.out.println(password);
			System.out.println(user);
			con = DriverManager.getConnection(url, user, password); // get connection
			st = con.createStatement(); // create statement
			rs = st.executeQuery("SELECT * FROM users"); // ดึง database มา

			while (rs.next()) // เป็น while เพราะ เรามี user หลายคน
			{
				UserDB x = new UserDB(); // new object จาก class UserDB
				x.id = rs.getInt(1); // get ค่า Int ใส่ใน colum 1
				x.Username = rs.getString(2);
				x.Password = rs.getString(3);
				x.UserType = rs.getString(4);

				list.add(x); // เก็บค่าทั้งหมดลงใน Arraylist
			}
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}

		return list;
	}

	// I N S E R T
	public static void addNewUser(UserDB x)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/world" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			int i = st.executeUpdate(
					"INSERT INTO users VALUES (0,'" + x.Username + "','" + x.Password + "','" + x.UserType + "')");

		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}

	}

	// U P D A T E
	public static void updateUser(UserDB x)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/world" + GlobalData.DatabaseName;
		String user = GlobalData.DatabaseUser;
		String password = GlobalData.DatabasePassword;

		try
		{
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			String sql = "UPDATE users SET username = '" + x.Username + "'  ,  password = '" + x.Password
					+ "' , usertype = '" + x.UserType + "' WHERE id = " + x.id;
			int i = st.executeUpdate(sql);
			System.out.println(sql);

		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (st != null)
				{
					st.close();
				}
				if (con != null)
				{
					con.close();
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	//D E L E T E
		public static void deleteUser(UserDB x)
		{
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;

			String url = "jdbc:mysql://" + GlobalData.DatabaseHostName + ":3306/world" + GlobalData.DatabaseName;
			String user = GlobalData.DatabaseUser;
			String password = GlobalData.DatabasePassword;

			try
			{
				con = DriverManager.getConnection(url, user, password);
				st = con.createStatement();
				String sql = "DELETE FROM users  "+"WHERE id = " + x.id;
				int i = st.executeUpdate(sql);
				System.out.println(sql);

			} catch (SQLException ex)
			{
				ex.printStackTrace();
			} finally
			{
				try
				{
					if (rs != null)
					{
						rs.close();
					}
					if (st != null)
					{
						st.close();
					}
					if (con != null)
					{
						con.close();
					}
				} catch (SQLException ex)
				{
					ex.printStackTrace();
				}
			}
		}
}
