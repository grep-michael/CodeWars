public class main {
	public static void print(Object obby) {
		System.out.println(obby);
	}
	public static void main(String[] args) {
		String a = showSequence(6);
		print(a);
	}
	public static String showSequence(int value){
	    String output = "";
		if(value < 0) {
			return String.valueOf(value) + "<0";
		}
		if(value == 0) {
			return String.valueOf(value) + "=0";
		}
		int outint = 0;
	    for(int i = 0; i<= value;i++) {
			output += String.valueOf(i)+"+";
			outint += i;
			
		}
	    output = output.substring(0,output.length()-1);
	    output += " = " + String.valueOf(outint);

		return output;
	  }
}
