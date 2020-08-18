package inheritance;
import java.util.*;

class Library{
	String B1="Analytical Book";
	String B2="Engineering Mathematics";
	void requird() {
		System.out.println("Staff(to Library Incharge) : If Teachers requird books then bring what we have..");
	}
}

public class Teacher {

	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		
		lib.requird();
		
		System.out.println("(Teacher Approching) Library Incharge: Hellow Teacher, Do you required any books from our library?"+
		"\n\nHere are some I have, Please look into it.\n");
		
		System.out.println("1."+lib.B1);
		System.out.println("2."+lib.B2);
		
		System.out.print("\n\nPlease enter your choice :");
		int input = sc.nextInt();
		if(input==1)
			System.out.println("Thankyou for choosing Analytical Book");
		else if(input==2)
			System.out.println("Thank you for choosing Engneering Mathematics");
			}

}
