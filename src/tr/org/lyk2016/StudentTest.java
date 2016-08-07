package tr.org.lyk2016;


public class StudentTest {

	public static void main (String args[]){
	Student student1 = new Student ("Ali Veli", 93);
	Student student2 = new Student ("Binary Thunderbolt",77);
	
	System.out.println (student1.getName() +  "'nin harf notu: " +student1.getLetterGrade());
	System.out.println (student2.getName() +  "'nin harf notu: " +student2.getLetterGrade());
	
	student1.setName("Hasan KARA");
	student1.setAverage(33.0);
	
	System.out.println(student1.getName() + "'nin harf notu:" + student1.getLetterGrade());
	
	
	student2.setAverage(99.0);
	System.out.print(student2.getLetterGrade());
	}
	
	
	
	}