package String;

public class GetCharacter {
	public static void main(String args[]) {
		String str = "Hello World!";
		System.out.println("Original String ="+str);
		int index1 = str.charAt(0);
		int index2 = str.charAt(6);
		System.out.println("The Character at position 0 is:"+(char)index1);
		System.out.println("The Character at position 6 is:"+(char)index2);
	}
}
