import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    
		List<Integer> arr=new ArrayList<>(5);
		
		for(int i=0;i<=5;i++)
		{
		    arr.add(i);
		}
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		for(int i=0;i<arr.size();i++)
		{
		    System.out.println(arr.get(i));
		}
		
	}
}