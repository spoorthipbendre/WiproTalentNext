package ConditionalStatement;

import java.util.Scanner;

public class GenderInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		System.out.print("Enter gender(Female/Male):");
		String gender = sc.next();
		int age = Integer.parseInt(args[0]);
		if(gender.equalsIgnoreCase("Female")) {
			if(age>=1 && age<=58) {
				System.out.println("Interest is 8.2%");
		    }else if(age>58 || age<=100) {
		    	System.out.println("Interest is 9.2%");
		    }else {
		    	System.out.println("Invalid Age");
		    }
		}else if(gender.equalsIgnoreCase("Male")){
			if(age>=1 && age<=58) {
				System.out.println("Interest is 8.4%");
		    }else if(age>58 || age<=100) {
		    	System.out.println("Interest is 10.5%");
		    }else {
		    	System.out.println("Invalid Age");
		    }
		}else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
