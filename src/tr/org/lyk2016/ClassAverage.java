package tr.org.lyk2016;

import java.util.Scanner;

public class ClassAverage {
	
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
	//10 tane not girdirecek hepsini grade olarak isimlendirecek	
		int total = 0;
		int gradeCounter = 1;
		System.out.println("10 adetnotu giriniz." );
		while (gradeCounter <= 10){
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
		}
		
		int average = total / 10;
		System.out.println("10 notun toplamı :" + total);
		System.out.println("Sınıf Ortalaması : " + average);
		
		
	}

}
