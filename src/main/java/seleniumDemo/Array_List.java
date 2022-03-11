//Name:Zainab Akhter
//HomeWork:Array List of 10 Employees names

package seleniumDemo;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List of 10 employees by using ArrayList
		List<String>names = new ArrayList<String>();
		names.add("Lena");
		names.add("Mena");
		names.add("sneha");
		names.add("Trina");
		names.add("Zeena");
		names.add("Rahim");
		names.add("karim");
		names.add("Edward");
		names.add("Hasan");
		names.add("Shafik");
		//get all employees name
		System.out.println(names);
		//get the count of List
		System.out.println(names.size());
		//add new name in the list
		names.add("Harim");
		System.out.println(names.size());
		//delete particular name from the list
		names.remove(4);
		//again get the count of list after deleting the name
		System.out.println(names.size());
		//verify particular item in the list-true/false
		System.out.println(names.contains("Zeena"));
		//varify the list is empty
		names.clear();
		System.out.println(names.isEmpty());
		
		//create a list of Id of 10 Employees
		
		List<Integer>idli = new ArrayList<Integer>();
				
			idli.add(25);
			idli.add(35);
			idli.add(45);
			idli.add(55);
			idli.add(65);
			idli.add(75);
			idli.add(85);
			idli.add(95);
			idli.add(105);
			idli.add(110);
			//printout the employee idlist
			System.out.println(idli);
			//get the particular item from the list
			System.out.println(idli.get(2));
			//remove one item from list
			System.out.println(idli.remove(5));
			//get the list after remove
			System.out.println(idli);
			//verify particular item true/false
			System.out.println(idli.contains(5));
			//clear the list
			idli.clear();
			//verify the List is Empty
			System.out.println(idli.isEmpty());
		
			
			
			
			
			System.out.println(idli);
			System.out.println(idli.size());
			
			
		
		

	}

}
