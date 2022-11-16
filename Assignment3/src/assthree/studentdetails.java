package assthree;
import java.util.*;

public class studentdetails {
	protected String name;
	protected String Course;
	
	void promotion() {
		System.out.println(" insert marks");
		Scanner scan = new Scanner(System.in);
		int marks=scan.nextInt();
		if(marks >=49) {
			System.out.println(this.name+" You have a Normal progress");}
		else{
			System.out.println(this.name+" You have got a retake");}
	}
	
	
	
}
