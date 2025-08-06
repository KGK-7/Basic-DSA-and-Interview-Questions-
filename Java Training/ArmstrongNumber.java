import java.util.*;

class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int n = num;
		int product = 0;

		if(n < 100 || n > 999){
				System.out.println("Enter only 3 digit number");
				return; }
		
		while(n > 0){
			 
		int first = n % 10;
		product += first * first * first;
		n /= 10;
		}
		if( num == product){
			System.out.println("The num "+ num + " is Armstrong number");
		}
		else {
		System.out.println("The num " + num + " is not an Armstrong number");
		}
}
} 