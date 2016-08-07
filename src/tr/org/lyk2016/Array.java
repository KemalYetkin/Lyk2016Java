package tr.org.lyk2016;

import java.util.Scanner;

public class Array {
// arraylar 0 dan indexlemeye başlar küçük kutucuklar şeklinde çalışır
	public static void main (String args[]){
//		int a = 1;
//		int b = 5;
//		int c = 6;
//		int total1 = a+b+c;
//		bu kodlar ile aşağıdakiler aynı göreve gelirler
//		int[] erey =new int[3];
//		erey[0]=a;
//		erey[1]=b;
//		erey[2]=c;
//		int total2 = erey[0] + erey[1]+erey[2];
//		System.out.println("total1:" + total1);
//		System.out.println("total2: " + total2 );
		int[]erey2= new int[] {1,5,6};
		int total3 = erey2[0] + erey2[1] + erey2[2];
		System.out.println("total3: " + total3);
		
		int total4 = 0;
		for(int i = 0; i < erey.length;i++){
			total4 = total4 + erey[i];
			
		
		}
		
		System.out.println("total4:" + total4);
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		int[] erey5 = new int[500];
		int counter = 0;
		while (inputNumber != -1){
			System.out.println("Bir değer giriniz");
			if(İnputNumber != -1){
			erey5[counter] = İnputNumber	
			}
			inputNumber = input.nextInt();
		
			
			erey5[counter] = inputNumber;
			counter++;
			
		}
		for(int i = 0; i< erey5.length; i++){
			System.out.println("Arrayin" + i + ", elemanı: " + erey5[i]);
		}
				
				
		
	}


}
