import java.util.Scanner;

public class EvenOddSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		int num;
		if(a%2==0) {
			num = 1;
		}else {
			num = 2;
		}
		switch(num) {
		case 1:
			System.out.print(a+"is Even");
			break;
		case 2:
			System.out.print(a+"is Odd");
			break;
		default:
			System.out.print("Invalid Input");
		}
		sc.close();
	}

}
