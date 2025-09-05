import java.util.*;
class UnitMatEx{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of the square matrix");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("Enter matrix elements");
		for(int i= 0 ; i<n; i++){
			for(int j=0 ; j<n ; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix Elements are: ");
		for(int i= 0 ; i<n; i++){
			for(int j=0 ; j<n ; j++){
				System.out.println(arr[i][j] + " ");
			}
		}
		boolean unit_mat = true;
		for(int i= 0 ; i<n; i++){
			for(int j=0 ; j<n ; j++){
				if( i==j && arr[i][j] != 1){
					unit_mat = false;

				}
				else if( i != j && arr[i][j] != 0){
					unit_mat = false;
				}
			}
		}
		if(unit_mat){
			System.out.println("The given matrix is an unit matrix ");
		}
		else{
			System.out.println("The given matrix is not an unit matrix ");
		}
		sc.close();
}
}


		
				