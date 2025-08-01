
public class ArrayDuplicate {
	public static void main(String args[]) {
		int[] array = {1, 2, 5, 5, 6, 6, 9, 2};
		for(int i=0; i<array.length;  i++) {
			for(int j=0; j<array.length; j++) {
				if((array[i]==array[j]) && (i!=j)) {
					System.out.println("Duplicate Elements:"+array[j]);
				}
			}
		}
	}
}
