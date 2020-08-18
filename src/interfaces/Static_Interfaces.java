package interfaces;

interface karthik{
	static void programmer() {
		System.out.println("I am a new programmer");
	}
	void Abstractprogrammer();
}

public class Static_Interfaces {

	public static void main(String[] args) {
		
		Static_Interfaces obj = new Static_Interfaces();
		
		karthik.programmer();
		obj.AbstractProgrammer();

	}
	
	void AbstractProgrammer() {
		System.out.println("Implemented Abstract programmer");
	}

}
