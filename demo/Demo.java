package demo;

import java.util.HashMap;

public class Demo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> tree = new HashMap<Integer, Integer>();
		
		tree.put(1, 11);
		tree.put(2, 22);
		tree.put(3, 33);
		tree.put(4, 44);
		
		System.out.println(tree);
		System.out.println(tree.get(3));
	}
		
}
