package constructors;

class Copy_Constructor{
	int No;
	String Name;
	Copy_Constructor(int No, String Name){
		this.No=No;
		this.Name=Name;
	}
	Copy_Constructor(Copy_Constructor c){
		No=c.No;
		Name=c.Name;
	}
	public String toString() {
		return "["+No+","+Name+"]";
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		
		Copy_Constructor obj = new Copy_Constructor(1,"Karthik");
		Copy_Constructor obj1 = new Copy_Constructor(obj);
		
		System.out.println(obj1);

	}

}
