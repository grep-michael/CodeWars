import java.util.Arrays;
public class main {
	public static void print(Object obby) {
		System.out.println(obby);
	}
	public static void main(String[] args) {
		boolean a = isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058});
		print(a);//true
		boolean b = isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969});
		print(b);//false
	}
	public static boolean isAscOrder(int[] arr) {
		int[] temp = arr.clone(); 
		//create a clone array the use sort to put it into ascending  order.
		Arrays.sort(temp); 
		return Arrays.equals(temp, arr)
	  }
}
