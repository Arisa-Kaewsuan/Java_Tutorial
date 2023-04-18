import java.util.LinkedList;

public class Stack {

	LinkedList ll;
	
	public Stack() {
		ll = new LinkedList();
	}
	
	public void push(int x) {
		ll.addFirst(x);
	}
	
	public int pop() {
		int x = (int) ll.get(0);
		ll.remove(0);
		return x;
	}
	
	public int top() {
		return (int) ll.get(0);
	}

	public static void main(String[] args) {
		Stack aa = new Stack();
		aa.push(0);
		aa.push(1);
		aa.push(2);
		aa.push(3);
		aa.push(4);
		aa.push(5);
		aa.push(6);
		aa.push(7);
		aa.push(8);
		System.out.println(aa.top());

	}

}
