package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server 
{
	ServerSocket xServerSocket;
	MsgReceive reciever;
	ArrayList<ServerSideClient> list;

	public Server(MsgReceive msgReceiver) {                                     // constuctor ให้มัน new server 
		reciever = msgReceiver;
		list = new ArrayList<ServerSideClient>();
		try {
			xServerSocket = new ServerSocket(1234);

			Thread t = new Thread(new Runnable() {                             // ใช้ thread ช่วยให้มันรอรับ client ได้หลายคน
				@Override
				public void run() {
					while (true) {
						try {
							Socket socket = xServerSocket.accept();
							ServerSideClient ssc = new  ServerSideClient (socket , reciever);
							list.add(ssc);
						} catch (IOException e) {
							e.printStackTrace();
						}
                        
					}
				}

			});
			t.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void sendAll(String s)                    // method สำหรับ ส่งข้อมูลหา client
	{
		for(ServerSideClient ss : list)
		{
			ss.send(s);
		}
	}
}
