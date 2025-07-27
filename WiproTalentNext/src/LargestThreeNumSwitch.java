import java.util.Scanner;

public class LargestThreeNumSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		System.out.print("Enter c value:");
		int c = sc.nextInt();
		int greatest;
		if(a>b && a>c) {
			greatest = 1;
		}else if(b>a && b>c) {
			greatest = 2;
		}else {
			greatest = 3;
		}
		switch(greatest) {
		case 1:
			System.out.print("The largest number is:"+a);
			break;
		case 2:
			System.out.print("The largest number is:"+b);
			break;
		case 3:
			System.out.print("The largest number is:"+c);
			break;
		default:
			System.out.print("Invalid input");
		}
		sc.close();
	}

}
