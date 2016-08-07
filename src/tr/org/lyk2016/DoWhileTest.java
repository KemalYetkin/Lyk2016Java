package tr.org.lyk2016;

public class DoWhileTest {
	public static void main (String args[]){
		int counter = 100;
//		int counter = 1;
		do{
			System.out.println(counter);
			++counter;
			
		}
		while(counter <= 10);
		
	}
//	do ile mutlaka işleme girer daha sonra while döngüsüne bakar gerek olmazsa while a girmez

}
