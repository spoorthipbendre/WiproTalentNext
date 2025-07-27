import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 value:");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 value:");
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+" is largest.");
		}else if(n2>n1) {
			System.out.println(n1+"is lesser.");
		}else {
			System.out.print("Both are equal.");
		}
		sc.close();
	}

}
