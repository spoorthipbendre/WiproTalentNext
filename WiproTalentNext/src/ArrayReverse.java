import java.util.Arrays;

public class ArrayReverse {
	public static void main(String args[]) {
		int[] array = {5, 2, 7, 9, 6};
		System.out.println("Original Array:"+Arrays.toString(array));
		for(int i=0; i<array.length/2; i++) {
			int temp = array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		System.out.println("Reverse Array:"+Arrays.toString(array));
	}
}
