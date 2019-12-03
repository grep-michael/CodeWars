public class Fracts {
  // your code
 public static String convertFrac(long[][] lst) {
	int lstSize = 0;
	// .size() method wont work on a list of lists for some reason
	//so we do it manually
	for(long[] l : lst){
		lstSize += 1;
	}
  if(lstSize == 0){
    return "";
  }

	// 1
	//simplify fractions
	for(int i = 0; i<lstSize;i++){
		long[] fraction = lst[i];
		long n = fraction[0];
		long d = fraction[1];
		
		long smallest;
		if(n < d){
			smallest = n;
		}
		else{
			smallest = d;
		}

		long HCF = -1;
		for (long v = smallest; v > 0; --v) {
			if (n%v==0&&d%v==0) {
				HCF = v;
				long[] simple = {(n/HCF),(d/HCF)};
				lst[i] = simple;
				break;
			}
		}
	}

	//first find least common multiple
  long[] denominators = new long[lstSize];
	for(int i = 0; i<lstSize;i++){

		denominators[i] = lst[i][1];
	}

	//2 lcm
	//lcm is equal to the product of all numbers divided by the greatest common divisor
	//lcm = (a,b) / gcd(a,b), this is not extendable
	
	//find lcm
	long ans = denominators[0];
	for(int i=0;i<denominators.length;i++){
		//find gcd
		long a2 = denominators[i];
		long b2 = ans;
		while(a2 != b2){
			if(a2>b2){
				a2 = a2-b2;
			}else{
				b2 = b2-a2;
			}
		}
		b2 = a2;
		//a2 = gcd of the two numbers
		//lcm
		ans = ans * denominators[i] / a2;

	}
	//using lcm to set up final array
	String output = "";
	for(int i=0;i< lstSize;i++){
		long num = lst[i][0] *(ans/lst[i][1]) ;
		long demo = ans;
		output+= String.format("(%d,%d)",num,demo);
	}
	return output;
  }
}
