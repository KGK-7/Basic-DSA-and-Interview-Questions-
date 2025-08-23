import java.util.*;
class ArrayMethods{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range for array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " Elements");
		int[] arr = new int[n];
		for( int i =0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int e = sc.nextInt();
		boolean found = false;
		for(int i =0; i<arr.length; i++){
			if( e == arr[i]){
				System.out.println("Element " + e + " found at index : " + i);
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("Element not found");
		}
		int max_num = findMax(arr);
		System.out.println("Maximum num in array: "+ max_num);
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}

		