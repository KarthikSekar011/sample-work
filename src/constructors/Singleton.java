package constructors;

class singletonExample{
	private static singletonExample singleton_instance = null;
	
	public String name;
	
	private singletonExample() {
		name = "Hi this is Singleton Program";
	}
	
	public static singletonExample getInstance() {
		if(singleton_instance==null) {
			return singleton_instance = new singletonExample();
		}
		else {
			return singleton_instance;
		}
	}
}

public class Singleton {
	
	public static void main(String[] args) {
		
		singletonExample obj = singletonExample.getInstance();
		
		singletonExample obj1 = singletonExample.getInstance();	
		
		System.out.println(obj.name);
			
		//Note obj1 also points to obj reference only.
		System.out.println(obj1.name);
		
	}

}
