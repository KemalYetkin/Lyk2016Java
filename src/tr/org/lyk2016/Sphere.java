package tr.org.lyk2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere {
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kürenin yarıçapını giriniz; ");
		try {
			
//			try{} catch{} ifadesi beklenenin dışında birşey girildiğinde onu yakalayıp e olarak
//			isimlendirir ve bunu ekrana yansıtır.
		double yaricap = input.nextDouble();
		System.out.println("hacim: " + kureHacmi(yaricap));
		}
		catch(InputMismatchException e){
			System.out.println("Ekrana başka bir şey değil sayı girmelisin.");
		}
		
		
	}

		public static double kureHacmi (double yaricap){
			double hacim = (4.0 / 3.0) * Math.PI * Math.pow(yaricap, 3);
			
					return hacim;
		}

}
