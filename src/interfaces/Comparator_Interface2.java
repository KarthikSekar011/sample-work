package interfaces;
import java.util.*;
//Comparator interface is used to compare more then one fields.

class College{
	int RollNo;
	String Name;
	int Age;
	public College(int RollNo,String Name,int Age) {
		this.RollNo=RollNo;
		this.Name=Name;
		this.Age=Age;
		
	}
	public void SetName(String Name) {
		this.Name=Name;
	}
	public void SetAge(int Age) {
		this.Age=Age;
	}
	public String getName() {
		return Name;
	}
	public Integer getAge() {
		return Age;
	}
	@Override
	public String toString() {
		return "College [RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + "]";
	}
	
}

class SortNameAge implements Comparator<College>{
	
	public int compare(College a, College b) {
		
		int NameCompare = a.getName().compareTo(b.getName());
		int AgeCompare = a.getAge().compareTo(b.getAge());
		
		if(NameCompare==0) {
			return (AgeCompare==0)? NameCompare : AgeCompare;
		}
		else {
			return NameCompare;
		}
		
	}
}

public class Comparator_Interface2 {

	public static void main(String[] args) {
		
		ArrayList<College> obj = new ArrayList<College>();
		obj.add(new College(1,"Karthik",25));
		obj.add(new College(2,"Anuram",26));
		obj.add(new College(3,"Aparna",24));
		obj.add(new College(4,"Kalyan",28));
		
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		Collections.sort(obj, new SortNameAge());
		System.out.println("\nAfter Sorting");
		for(College obj1 : obj) {
			System.out.println(obj1);
		}

	}

}
