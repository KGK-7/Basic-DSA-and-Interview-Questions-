import java.util.*;

class TreeSetEx{
	public static void main(String[] args){
		TreeSet<Integer> myset = new TreeSet<>();
		myset.add(1);
		myset.add(1);

		myset.add(2);
		myset.add(2);

		myset.add(3);
		myset.add(4);
		myset.add(5);
		myset.add(2);

		System.out.println(myset);
}
}
