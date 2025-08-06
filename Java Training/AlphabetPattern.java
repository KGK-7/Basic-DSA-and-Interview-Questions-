import java.io.*;

class AlphabetPattern{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter value for rows to generate");
		int rows = Integer.parseInt(br.readLine());
		System.out.println("Enter the character you want to start from");
		//String word = br.readLine();
		//char ch = word.charAt(0);
		char ch = (char) br.read();
		boolean upper = true;
		
		for( int i =1; i<= rows ; i++){
			for ( int j =1 ; j<=i; j++){ 
			if( upper ){
				System.out.print(Character.toUpperCase(ch) + " ");
			}
			else{
				System.out.print(Character.toLowerCase(ch) + " ");
			}
			ch++ ;
			upper = !upper;
			}
			System.out.println();
		}
}
}
		