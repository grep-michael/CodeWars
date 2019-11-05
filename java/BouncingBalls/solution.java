public class main {
	public static void print(Object obby) {
		System.out.println(obby);
	}
	public static void main(String[] args) {
		int test1 = bouncingBall(30.0, 0.66, 1.5);
		int test2 = bouncingBall(3.0, 0.66, 1.5);
		print(test1);//should be 3
		print(test2);//should be 15
		
	}
	public static int bouncingBall(double h, double bounce, double window) {

		//test for 3 conditions
		if(!(h > 0)) {
			//if kid drops ball from ground level or below
			return -1;
		}
		if( !(bounce > 0 && bounce < 1)) {
			//makes sure the ball will have a real bounce
			return -1;
		}
		if( !(window < h) ) {
			//make sure mom isnt above child
			return -1;
		}
	
		
		//h = height of child
		//bounce = bounce factor
		//window = the mothers position
    //calculate ball drop
		int count = 0 ;//how many times it passes mother
		while(h>window) {
			//print(h);
			count +=1; //ball drops to 0 passed window
			
			h = h*bounce; 
			if(h>window) {
        //calculate if ball passes mothers window
				count +=1;
			}
			
			
		}
		return count;
	}
}
