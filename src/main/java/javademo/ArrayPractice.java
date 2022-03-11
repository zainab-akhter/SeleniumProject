package javademo;

public class ArrayPractice {

	public static void main(String[] args) {
		
String[] names = {"Tito","Maria","Minu","Nilu"};
int[] Ph  = {601554, 480667, 323445, 506778,4,3,2};
char[]ch1 = {'a','b','c','d'};
short[]id = {1,2,3,4};

System.out.println(names.length);
System.out.println(names[0]);
System.out.println(Ph[5]);
System.out.println(ch1[1]);
System.out.println(id[2]);
System.out.println(names.length);

//second way
//ClassName obj =new ClassName();
String[] obj = new String[4];
obj[0]="Minu";
obj[1]="Rita";
obj[2]="Risa";
obj[3]="Tito";
//obj[3]="Ashraf";

System.out.println(obj.length);
System.out.println(obj[2]);
System.out.println(obj[3]);
	
	}
}
