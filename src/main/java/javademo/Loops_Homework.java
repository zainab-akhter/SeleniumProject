/*Name:Zainab Akhter
 * Home Work:Loop#2 */



package javademo;

public class Loops_Homework {

	public static void main(String[] args) {
		
	
		//5.Create an array of 10 students of Selenium QA class and print all students name on the console by for each loop.
		
		String[] students  = {"Mina","Rina","Jesmine","Sema","Shoshi","Rishi","Nira","Hira","Joba","Trisha"};
		
		for(String eachStudent:students) {
			System.out.println(eachStudent);
			System.out.println(students.length);
		}
			
//6.Write an array of 20 employees ID numbers of an organization and print all the id of employees on the console by using for each loop.
		
			int[] nums = { 101,102,203,204,105,106,107,208,209,210,301,302,304,305,306,307,308,309,310,311};
			for(int eachNum:nums) {
				System.out.println(eachNum);
				System.out.println(nums.length);
				
			}
		

	}

}
