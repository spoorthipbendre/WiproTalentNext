import java.util.Arrays;

public class ArrayInsert {
	public static void main(String args[]) {
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int Index_position = 2;
		int newValue = 5;
		System.out.println("Original Array:"+Arrays.toString(array));
		for(int i=array.length-1; i>Index_position; i--) {
			array[i]=array[i-1];
		}
		array[Index_position]=newValue;
		System.out.println("New Array:"+Arrays.toString(array));

}
}
