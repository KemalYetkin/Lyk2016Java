package tr.org.lyk2016;

import java.util.Scanner;

public class Analysis {
	
	public static void main (String args[]){
	
		Scanner input = new Scanner (System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while (studentCounter <= 10){
			System.out.println("sonucu giriniz (1=gecti 2=kaldı)");
			
			int result = input.nextInt();
			
			if (result == 1){
				passes = passes + 1;
				studentCounter = studentCounter + 1;
				
			}
				
			else if (result == 2){
				failures = failures + 1;
				studentCounter = studentCounter + 1;
				
			}
				
			else System.out.println("lütfen '1' ya da '2' olarak giriniz");
			
	
		}
		
		System.out.println("Geçen: " + passes + "Kalan : " + failures);
		if (passes > 8)
			System.out.println("bravo sınıfa!!");
		
		
	}

}
