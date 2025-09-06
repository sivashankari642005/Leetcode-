import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		HashSet<String> hash=new HashSet<String>();
		
		hash.add("A");
		boolean r1=hash.add("B");
		System.out.println(r1);
		boolean r12=hash.add("B");
		System.out.println(r12);
		System.out.println(hash.size());
		System.out.println(hash);
		System.out.println(hash.contains("B"));
		hash.remove("B");
		System.out.println(hash);
	}
}