/*Name:Zainab Akhter
Home Work: Arrays concept*/


package javademo;

public class Array {

	public static void main(String[] args) {
		int[] Marks = { 60,65,70,78,80,86,90,92,95};
		System.out.println(Marks.length);
		System.out.println(Marks[2]);
		for(int eachMark:Marks) {
			System.out.println(eachMark);
		}
		
		//Home Work # 2
		
		String[]Employes = {" David","Smith","Erika","Priscila","Regina","Tammy","Paul","Garcia"};
		System.out.println(Employes[3]);
		System.out.println(Employes.length);
		
		for(String eachEmployes:Employes){
		System.out.println(eachEmployes);
		}
		
		
	}

}
