package tr.org.lyk2016;

public class MinNumber {
	public static void main (String args[]){
		
		int a = 8;
		int b = 10;
		int c = minFunction(a,b);
		
	}
	
	public static int minFunction(int num1, int num2){
//		metot içinde tanımlanan değişkenler sınıf bazında kullanılan değişkenlerle aynı olacak
		int min ;
		if  ( num1 > num2)
			min = num2;
		else min = num1;
		
		return min;
	}


}
