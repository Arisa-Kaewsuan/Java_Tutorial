package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import Server.MsgReceive;

public class Client 
{
      Socket xSocket;
      Scanner scanner;
  	  PrintWriter printwriter;
      MsgReceive xrecieve;
 
      
      public Client(MsgReceive recieve , String host , int port)
      {
    	  xrecieve = recieve;
    	  
    	  try {
			xSocket = new Socket(host , port);
			scanner = new Scanner(xSocket.getInputStream());
			printwriter = new PrintWriter(xSocket.getOutputStream());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	  
    	  Thread t = new Thread(new Runnable() {
  			@Override
  			public void run() {
  				while (true) {
  					String s = scanner.nextLine();
  					xrecieve.getMsg(s);
  				}
  			}
  		});
    	  t.start();
      }
      

	public void send(String s) // ส่ง String
  	{
  		printwriter.println(s);
  		printwriter.flush();
  	}

}
