import java.util.Scanner;

public class logicaloperators {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Boolean value of a(True/False):");
		boolean a = sc.nextBoolean();
		System.out.print("Enter the Boolean value of b(True/False):");
		boolean b = sc.nextBoolean();
		System.out.println("AND Result:"+(a&&b));
		System.out.println("OR Result:"+(a||b));
		System.out.println("NOT Result:"+(!a));
		sc.close();
	}

}
