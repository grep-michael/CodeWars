import java.util.*;
class main{
public static void print(Object ob){
	System.out.println(ob);
}
public static void main(String[] args){
	String a = SongDecoder("WUBWUBABCWUB");
	print(a); //should be ABC
	String b = SongDecoder("RWUBWUBWUBLWUB");
	print(b); //should be R L
}	
//https://www.codewars.com/kata/dubstep/train/java
public static String SongDecoder (String song)
  {
    String string = "";
    String[] arr = song.split("WUB");
	for(String a : arr){
		//test to see if character is empty
		if(a.getBytes().length > 0 ){
			string += a +" ";
			//append 'a ' to string
		}
	}
	//remove last space from string
	string = string.substring(0,string.length()-1);
	return string;
}
}
