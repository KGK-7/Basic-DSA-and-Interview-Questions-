import java.util.*;
class InvalidAgeException extends Exception{
	public void displayError(){
		System.out.println("Enter valid age");
	}
}

class CustExcep{
	public static void main(String[] args){
		int age;
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age");
			age=sc.nextInt();
					
			if(age < 18){
				throw new InvalidAgeException();
			}
			else{
				System.out.println("You're eligible to vote");
			}
		}
		catch(InvalidAgeException e){
			e.displayError();
		}
}
}