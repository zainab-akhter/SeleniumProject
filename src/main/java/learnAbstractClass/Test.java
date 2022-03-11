package learnAbstractClass;

public class Test {

	public static void main(String[] args) {
		// MobileUser mu = new MobileUser();
		//Syntax:ClassName(SuperClass)reference Variable;
		
		MobileUser mu;//reference variable of Super Class
		
		mu= new Karim();
		mu.sendMessage();
		mu.call();
		
		mu=new Rahim();
		mu.sendMessage();
		mu.call();
	}

}
