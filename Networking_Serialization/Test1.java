import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		Person james = new Person();
		james.id = 1 ;
		james.name = "James" ;
		james.surname = "sea-ngow" ;
		james.phone = "085-3507540" ;
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		try {
			FileOutputStream fileout = new FileOutputStream(new File("d://james.bin")); 
			
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(james);
			out.flush();
			byte[] buffer = bout.toByteArray();
			System.out.println(buffer.length);
			System.out.println(Arrays.toString(buffer));
			
			fileout.write(buffer);
			fileout.flush();
			fileout.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
