package tr.org.lyk2016;

public class Interest {
	public static void main (String [] args){
		
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		System.out.printf("%s %20s %n", "Yıl:","Faizli Para: ");
		for (int year = 1; year <= 10; ++year){
			amount = principal * Math.pow(1.0 + rate , year);
			System.out.printf("%4d%, 20.2f%n", year , amount);
			
//			%n boşluk bırakır println gibi çalışır
//			%4 basamak sayısı   ?
//			%s?
//			%20s    ?
//			%4d%   ?
//			%20.6f%n    ?  xx.sayıf virgülden sonraki basamak sayısı ,, %n ise boşluk bırak
		}
		
		
	}

}
