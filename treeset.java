import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		TreeSet<String> tree=new TreeSet<String>();
		TreeSet<Integer> tree1=new TreeSet<Integer>();
		tree.add("B");
		tree.add("C");
		tree.add("C");
		tree.add("A");
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		System.out.println(tree1);
		System.out.println(tree);
		
	}
}