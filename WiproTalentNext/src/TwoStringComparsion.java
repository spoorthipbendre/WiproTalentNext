package String;

public class TwoStringComparsion {
	public static void main(String args[]) {
		String a = "Java is Programming Language";
		String b = "Java is Object-Oriented Language";
		String c = "Java is Programming Language";
		boolean equals1 = a.equals(b);
		boolean equals2 = a.equals(c);
		System.out.println("\""+a+"\" equals \""+b+"\""+equals1);
		System.out.println("\""+a+"\" equals \""+c+"\""+equals2);
		
	}
}
