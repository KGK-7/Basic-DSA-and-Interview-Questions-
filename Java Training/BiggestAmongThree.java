import java.util.*;
public class BiggestAmongThree {
    public static void main(String[] args) {
      int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter value for a , b , c: ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
      int biggest;
        if(a>b){
                if(a>c){
                    biggest = a;
                } else {
                    biggest = c;
                }
        }
        else{
                if(b>c){
                    biggest = b;
                } else {
                    biggest = c;
                }
        }

     System.out.println("The biggest number is: " + biggest);
    }
}
