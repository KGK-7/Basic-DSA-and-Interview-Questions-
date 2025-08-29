import java.util.*;
import java.io.*;
class SumOfEvens{
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int range = sc.nextInt();
	int sum =0;
	for(int i =0; i< range; i++){
		if(i % 2 == 0){
			sum += i;

		}
}
System.out.println(sum);
}		
		
}