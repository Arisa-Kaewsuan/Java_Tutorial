 import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.InvalidParameterException;

public class DoublyLinkedList {
	
	public int size;
	public Node header;
	public Node tail;

	public DoublyLinkedList() {
		header = new Node();
		tail = new Node();
		header.next = tail;
		tail.prev = header;
		size = 0;
	}
	
	public void addFirst(int x) {
		Node n = new Node();
		n.next = header.next;
		header.next = n;
		n.next.prev = n;
		n.prev = header;
		size++;
	}
	
	public void addLast(int x) {
		Node n = new Node();
		n.prev = tail.prev;
		tail.prev = n;
	    n.prev.next = n;
	    n.next = tail;
		size++;
	}
	
	public void insertAt(int x , int i)
	{
		int k = 0;
		Node n = header;
		while(n.next != null && k< i) {
			n =n.next;
			k++;
		}
		Node m = n.next;
		n.next = new Node();
		n.next.data = x;
		n.next.next = m;
	}
	
	public void removeAt(int i) {
		
		if(index < 0 || index >= size) {
			throw new InvalidParameterException("index out of range : ");
		}
		 int i = 0;
		 Node p = header;
		 while(p.next != tail && i < index)
		 {
			 p = p.next;
			 i++;
		 }
		 p.next = p.next.next;
	}
	
	public void draw(Graphics g)
	{
		int i = 0;
		Node n = header;
		Font fn = new Font("Serif",Font.BOLD,20);
		while(n != null)
		{
			//Draw Oval
			i++;
			g.setColor(Color.BLACK);
			g.fillOval(50+60*i,50,50+1,50+1);
			g.setColor(Color.YELLOW);
			g.fillOval(50+60*i, 50, 50, 50);
			
			//Draw Data
			g.setColor(Color.BLACK);
			g.setFont(fn);
			g.drawString(""+n.data, 40+60*i+25, 80);
			
			//Draw straight line
			g.drawLine(40+60*i+50,55 , 40+60*i+50, 95);
			
			//Draw arrow line
			g.drawLine(40+60*i+50, 75, 50+60*(i+1), 75);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 65);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 85);
			
			n =n.next;
		}
	}

}
