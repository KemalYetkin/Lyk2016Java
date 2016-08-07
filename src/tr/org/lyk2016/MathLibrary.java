package tr.org.lyk2016;

//public class MathLibrary {
//	
//	public static void main (String [] args){
//		
//		int i = 7;
//		int j = -9;
//		double x = 7.3;
//		double y = 0.34;
//		
//		System.out.println("j nin mutlak değeri : " + Math.abs(i));
//		System.out.println("x in yuvarlanmıs hali : " + Math.round(x));
//		System.out.println("x ve y den hangisi küçük? " + Math.min(x,y));
//		System.out.println("i ve j den hangisi büyük? " + Math.max(i,j));
//		
//		System.out.println("Pi: " + Math.PI);
//		System.out.println("E: " + Math.E);
//		
////		double angle = 45.0 * 2.0 *Math.PI/300.0;
////		System.out.println("cos (" + angle +") =" + Math.)
//		
//		
//		
//	}
public class MathLibrary {

    public static void main(String[] args) {

        int i = 7;
        int j = -9;
        double x = 72.3;
        double y = 0.34;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /* Mutlak değer*/
        System.out.println("|" + i + "| = " + Math.abs(i));
        System.out.println("|" + j + "| = " + Math.abs(j));
        System.out.println("|" + x + "| = " + Math.abs(x));
        System.out.println("|" + y + "| = " + Math.abs(y));

        System.out.println(x + " ~ = " + Math.round(x));
        System.out.println(y + " ~ " + Math.round(y));

        System.out.println("min(" + i + "," + j + ") = " + Math.min(i,j));
        System.out.println("min(" + x + "," + y + ") = " + Math.min(x,y));
        System.out.println("min(" + i + "," + x + ") = " + Math.min(i,x));
        System.out.println("min(" + y + "," + j + ") = " + Math.min(y,j));

        System.out.println("max(" + i + "," + j + ") = " + Math.max(i,j));
        System.out.println("max(" + x + "," + y + ") = " + Math.max(x,y));
        System.out.println("max(" + i + "," + x + ") = " + Math.max(i,x));
        System.out.println("max(" + y + "," + j + ") = " + Math.max(y,j));

        System.out.println("Pi = " + Math.PI);
        System.out.println("e = " + Math.E);

        /*Trigonometri*/
        double angle = 45.0 * 2.0 * Math.PI/360.0;
        System.out.println("cos(" + angle + ") = " + Math.cos(angle));
        System.out.println("sin(" + angle + ") = " + Math.sin(angle));

        double value = 0.707;


        System.out.println("acos(" + value + ") = " + Math.acos(value));
        System.out.println("asin(" + value + ") = " + Math.asin(value));
        System.out.println("atan(" + value + ") = " + Math.atan(value));

        /* Üstel fonksiyon*/
        System.out.println("exp(1.0) is "  + Math.exp(1.0));
        System.out.println("exp(10.0) is " + Math.exp(10.0));
        System.out.println("exp(0.0) is "  +  Math.exp(0.0));

        /* logaritma */
        System.out.println("log(1.0) is "    + Math.log(1.0));
        System.out.println("log(10.0) is "   + Math.log(10.0));
        System.out.println("log(Math.E) is " + Math.log(Math.E));

        /* Üslü sayılar */
        System.out.println("pow(2.0, 2.0) is "  + Math.pow(2.0,2.0));
        System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0,3.5));
        System.out.println("pow(8, -1) is "     + Math.pow(8,-1));

        /* Kök */
        for (i=0; i < 10; i++) {
            System.out.println(
                      i + " 'nin kökü = " + Math.sqrt(i));
        }

        System.out.println("Rastgele bir sayı: " + Math.random());
        System.out.println("Rastgele başka bir sayı: " + Math.random());

    }

}

