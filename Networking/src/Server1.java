import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Server1 {

	public static void main(String[] args) 
	{
		try {
			ServerSocket ss = new ServerSocket(1234);              // ประกาศ server ขึ้นมา 1 ตัว รองรับ port 1234
			System.out.println("start server ...");
			Socket socket = ss.accept();                           // accept คือ รอรับ client
			
			Scanner sc = new Scanner (socket.getInputStream());    // เอา scanner ไปต่อ inputstream
			String s = sc.nextLine();                              //รับ input มา 1 บรรทัด
			Calendar now = Calendar.getInstance();
			SimpleDateFormat format1 = new SimpleDateFormat("HH-mm-ss");
			s = s.toUpperCase() + "   " + format1.format(now.getTime());
			
			// ทำฝั่ง Output
			PrintWriter pw = new  PrintWriter(socket.getOutputStream());
			pw.println(s);
			pw.flush();                                             // บังคับให้มันส่งจริงๆ เพราะ บางทีมันจะรอให้ข้อมูลแยอะๆจังส่งทีเดียว
			
			
			
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     

	}

}
