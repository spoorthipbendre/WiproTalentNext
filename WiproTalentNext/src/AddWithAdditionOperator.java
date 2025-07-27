import java.util.Scanner;

public class AddWithAdditionOperator {
	public static int add(int a, int b) {
		while(b!=0) {
			int carry = a&b;
			a = a^b;
			b = carry<<1;
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		System.out.println("Addition result is:"+add(a,b));
		sc.close();
		
	}

}
