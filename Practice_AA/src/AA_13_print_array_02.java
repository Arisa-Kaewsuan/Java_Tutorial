
public class AA_13_print_array_02 {

	public static void main(String[] args) {
		int []l = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.print("[");
		for(int i=0 ; i<l.length ; i++)
		{
			System.out.print(l[i]);
			if(i != l.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

}
