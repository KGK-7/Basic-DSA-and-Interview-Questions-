import java.util.*;

class DequeEx{
	public static void main(String[] args){
		ArrayDeque<Integer> myset = new ArrayDeque<>();
		myset.add(1);
		myset.addFirst(100);
		myset.add(10);
		myset.addLast(200);
		myset.add(3);
		myset.add(4);
		myset.add(5);
		myset.add(300);

		System.out.println(myset);
		myset.poll();
		System.out.println(myset);
		myset.poll();
		System.out.println(myset);


}
}
