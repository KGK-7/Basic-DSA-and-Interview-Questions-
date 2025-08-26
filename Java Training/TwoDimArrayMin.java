import java.util.*;
class TwoDimArrayMin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows and Columns");
		int rows = sc.nextInt();
		int cols = sc.nextInt(); 
		System.out.println("Enter matrix elements");
		int arr[][] = new int[rows][cols];
		for(int i = 0 ;i<rows ; i++){
			for(int j=0 ; j<cols; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i =0; i<rows ; i++){
			for(int j=0 ; j<cols ; j++){
				if(arr[i][j] < min){
					min = arr[i][j];
				}
			}
		}
		System.out.println("\n Min element in the matrix is : " + min);
}
}