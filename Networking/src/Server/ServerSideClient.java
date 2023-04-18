package Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSideClient {
	Socket xSocket;
	Scanner scanner;
	PrintWriter printwriter;
	MsgReceive reciever;

	public ServerSideClient(Socket x_Socket , MsgReceive x_reciever) // รับ MSG ส่ง MSG ผ่าน socket ชื่อ x_Socket
	{
		xSocket = x_Socket;
		reciever = x_reciever;
		try {
			scanner = new Scanner(xSocket.getInputStream());
			printwriter = new PrintWriter(xSocket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					String s = scanner.nextLine();
					reciever.getMsg(s);
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
