package interfaces;
import java.util.*;

class School{
	int RollNo;
	String Name;
	String Address;
	public School(int RollNo,String Name,String Address) {
		this.RollNo = RollNo;
		this.Name = Name;
		this.Address = Address;
	}

	public String toString() {
		return "School [RollNo=" + RollNo + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
}

class SortRollNo implements Comparator<School>{
	public int compare(School a, School b) {
		return a.RollNo-b.RollNo;
	}
	
}
class SortName implements Comparator<School>{
	public int compare(School a,School b) {
		return a.Name.compareTo(b.Name);
	}
}

public class Comparator_Interface1 {

	public static void main(String[] args) {
		
		ArrayList<School> ar = new ArrayList<School>();
		ar.add(new School(4,"Vaishnav","Vellore"));
		ar.add(new School(1,"Karthik","Chennai"));
		ar.add(new School(2,"Anuram","Hyderadad"));
		ar.add(new School(3,"Palaniappan","Karaikudi"));
		System.out.println("Unsorted");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("\nSorted by RollNo");
		Collections.sort(ar,new SortRollNo() );
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("\nSorted by Name");
		Collections.sort(ar,new SortName());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	

	}

}
