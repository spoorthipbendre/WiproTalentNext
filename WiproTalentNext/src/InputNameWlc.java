package ComandLineCode;
import java.util.Scanner;
public class InputNameWlc {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	String a = args[0];
	System.out.println(a+" "+name);
	sc.close();
	}
}
	
