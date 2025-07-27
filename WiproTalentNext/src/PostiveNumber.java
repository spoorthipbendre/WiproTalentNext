import java.util.Scanner;

public class PostiveNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		if(a > 0) {
			System.out.print(a+ " is Positive Number");
		}else if(a < 0){
			System.out.print(a+ " is Negative Number");
		}else {
			System.out.print(a+ " is zero");
		}
		sc.close();
	}

}
