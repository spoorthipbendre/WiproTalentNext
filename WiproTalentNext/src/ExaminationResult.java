import java.util.Scanner;

public class ExaminationResult {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks:");
		int marks = sc.nextInt();
		int result;
		if(marks>=80) {
			result = 1;
		}else if(marks<80 && marks>=35) {
			result = 2;
		}else {
			result = 3;
		}
		switch(result) {
		case 1:
			System.out.print("Distinction");
			break;
		case 2:
			System.out.print("Pass");
			break;
		case 3:
			System.out.print("Fail");
			break;
		default:
			System.out.print("Invalid Input");
		}
		sc.close();
	}

}
