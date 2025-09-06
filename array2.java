public class Main
{
	public static void main(String[] args) {
		int[] arr1;
		
		//memory allocation
		arr1=new int[5];
		//initializing
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
	    System.out.println(arr1[3]);
	    System.out.println(arr1[0]);
	    System.out.println(arr1[5]);//error or Exception index out of bound
	    
	}
}