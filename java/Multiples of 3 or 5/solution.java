
class main{
public static void print(Object ob){
	System.out.println(ob);
}
public static void main(String[] args){
	int a = solution(10);
	print(a); //should be 23

}
public static int solution(int number) {
    
    int sum = 0;
    for(int i=0; i<number;i++){

    	if(i%3 == 0){ sum += i;}
    	else if(i%5 == 0){ sum += i;}
    }
    return sum;
}
}
