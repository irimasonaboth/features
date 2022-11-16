package assthree;
import java.util.*;
public class Form extends studentdetails {
	
	void fillform() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first name?");
		this.name=scan.next();
		System.out.println("What is your course name?");
		this.Course =scan.next();
		System.out.println(this.name+" Thank you for filling this form");
		
	}
	
	
	
}
