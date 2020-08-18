package Methodoverloading_MethodOveriding;

class Parent{
	//Method OverLoading
	void display() {
		System.out.println("Method Overloading");
	}
	void display(String value) {
		System.out.println("Method OverLoading by passing String argument");
	}
	void display(int value) {
		System.out.println("Method Overloading by passing integer argument");
	}
	void display(double value) {
		System.out.println("Method Overloading by passing double argument");
	}
	void show() {
		System.out.println("Parent Class");
	}
		
}

public class Son extends Parent {

   //Method Overriding
	void show() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
	
		Son obj = new Son();
		obj.display();
		obj.display(1);
		obj.display(1.1);
		//Method Overriding
		obj.show();
		
		//Type 1 (Using Parent class reference)
		Parent obj1 = new Parent();
		obj1.show();
		//Type 2 (UpCasting)
		Parent obj2 = new Son();
		obj2.show();
		//Type 3 (using child class reference)
		Son obj3 = new Son();
		obj3.show();
		
	}

}
