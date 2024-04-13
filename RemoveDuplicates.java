import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String...ar) {        
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of the array: ");
	int n = sc.nextInt();
        int arr[] = new int[n];
	System.out.println("Enter array elements: ");
	for(int i=0; i<n; i++){
	    arr[i] = sc.nextInt();
	}

        System.out.println("Original array: " + Arrays.toString(arr));
        
        int[] uniqueArray = new int[arr.length];
        
        int k = 0;
        boolean duplicate;
        
        // Check each element in the array
        for (int i = 0; i < arr.length; i++) {
            duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
            	uniqueArray[k++] = arr[i];
            }
        }        
        uniqueArray = Arrays.copyOf(uniqueArray, k);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
