package M;

public class UserDB 
{
     public int Id;
     public String username;
     public String password;
     public String usertype;
     
     public  UserDB() {}
     
     public  UserDB(int xId , String xusername , String xpassword , String xusertype) 
     {
    	 Id = xId;
         username = xusername;
         password = xpassword;
         usertype = xusertype;
     }
}
