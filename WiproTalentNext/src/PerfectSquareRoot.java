import java.util.Scanner;

public class PerfectSquareRoot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		int sqrt = (int) Math.sqrt(a);
		if(sqrt*sqrt == a) {
			System.out.print(a+"is perfect square.");
		}else {
			System.out.print(a+"is not perfect square.");
		}
		sc.close();
	}

}
