
public class LinkedListString {
	
	SNode head;
	int size;

	public LinkedListString() {
		head = new SNode();
	}
	
	public void addFirst(String s) {
		SNode n = new SNode();
		n.data = s;
		n.next = head.next;
		head.next = n;
		size++;
	}
	
	public void addLast(String s) {
		SNode n = head;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = new SNode();
		n.next.data = s;
		size++;
	}
	
	public void insertAt(String s,int i) {
		int k = 0;
		SNode n = head;
		while(n.next != null && k < i)
		{
			n = n.next;
			k++;
		}
		SNode m = n.next;
		n.next = new SNode();
		n.next.data = s;
		n.next.next = m;
		size++;
	}
	
	public void removeAt(int i) {
		int k = 0;
		SNode n = head;
		while(n.next != null && k < i)
		{
			n = n.next;
			k++;
		}
		if(n.next == null)
			return;
		n.next = n.next.next;
		size--;
	}
	
	public String get(int i) {
		int k = 0;
		SNode n = head;
		for(; k <= i && n != null; k++)
		{
			n = n.next;
		}
		return n.data;
	}
	
	public int size() {
		return size;
	}

}
