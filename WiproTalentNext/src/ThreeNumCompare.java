import java.util.Scanner;

public class ThreeNumCompare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		System.out.print("Enter c value:");
		int c = sc.nextInt();
		if((a>b)&(a>c)) {
			System.out.println(a+" is the greatest Number.");
		}else if((b>a)&(b>c)) {
			System.out.println(b+" is the greatest Number.");
		}else {
			System.out.println(c+" is the greatest Number.");
		}
		sc.close();
	}

}
