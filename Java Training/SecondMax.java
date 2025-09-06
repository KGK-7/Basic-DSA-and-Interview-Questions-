import java.util.*;
class SecondMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n = sc.nextInt();
		if (n < 2){
			System.out.println("Cannot find second max for size : " + n);
		}

		int arr[] = new int[n];
		
		for(int i =0; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int second_max = Integer.MIN_VALUE;
		
		for(int i=0 ; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		for(int i=0 ; i<arr.length; i++){
			if(arr[i] < max && arr[i] > second_max){
				second_max = arr[i];
			}
		}
		
		if(second_max == Integer.MIN_VALUE){
			System.out.println("No second max found in the array");
		}
		else{
			System.out.println("Second max found in the array : "+second_max);
		}	
}
}	