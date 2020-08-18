package interfaces;

interface PhisicsLibrary{
	
	String P1 = "Chemistry Book";
	String P2 = "Basic Science Book";
}
interface MathsLibrary{
	String M1 = "Geomentry Book";
	String M2 = "Analytical Book";
}
interface SocialLibrary{
	String S1 = "Wings of Fire";
    //abstract Method
	abstract void show();
}

public class Student implements PhisicsLibrary,MathsLibrary,SocialLibrary {
	//Interface abstract Method implemented
	public void show() {
		System.out.println("'WINGS OF FIRE' book written by Arun Tiwari");
	}

	public static void main(String[] args) {

		Student obj = new Student();
		
		System.out.println("which is Abdul Khalam autobiography book?");
		System.out.println(obj.S1);
		System.out.println();
		obj.show();
 		
	}

}
