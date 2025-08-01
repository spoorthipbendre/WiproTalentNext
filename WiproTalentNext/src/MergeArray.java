import java.util.Arrays;

public class MergeArray {
	public static void main(String args[]) {
		int[] array1 = {3,2,1,4};
		int[] array2 = {5,7,6,8};
		int[] merge = new int [array1.length + array2.length]; 
		System.arraycopy(array1, 0, merge, 0, array1.length);
		System.arraycopy(array2, 0, merge, array1.length, array2.length);
		System.out.println("merged array:"+Arrays.toString(merge));
		for(int i=0;i<merge.length;i++) {
			for(int j=i+1;j<merge.length;j++) {
				if(merge[i]> merge[j]) {
					int temp = merge[i];
					merge[i] = merge[j];
					merge[j] = temp;
				}
			}
		}
		System.out.println("Ascending order of array"+Arrays.toString(merge));
//		Arrays.sort(merge);
//		System.out.println("Ascending order of array"+Arrays.toString(merge));
//		Arrays.sort(merge, Collections.reverseOrder());
//		System.out.println("Descending order of array:"+Arrays.toString(merge));
		for(int i=0;i<merge.length;i++) {
			for(int j=i+1;j<merge.length;j++) {
				if(merge[i]<merge[j]) {
					int temp = merge[i];
					merge[i] = merge[j];
					merge[j] = temp;
				}
			}
		}
		System.out.println("Desending order of array:"+Arrays.toString(merge));
	}

}
