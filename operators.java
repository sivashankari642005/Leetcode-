public class Main
{
	public static void main(String[] args) {
	    //Arithmetic operators
	    
	    int result=1+2;
	    System.out.println("add:"+result);
	    result=result-1;
	    System.out.println("sub:"+result);
	    result=result*2;
	    System.out.println("multiply:"+result);
	    
	    
	    //unary operators
	    
	    int a=+1;
	    System.out.println("positive:"+a);
	    a--;
	    System.out.println("decrement:"+a);
	    //post increment
	    a++;
	    System.out.println("increment:"+a);
	    int b=-a;
	    System.out.println("negative:"+b);
	    boolean c=false;
	    System.out.println(!c);
	    
	   // pre increment
	   int i=10;
	   i++;
	   // print 11
	   System.out.println(i);
	   ++i;
	   //print 12
        System.out.println(i);
        // print 13
        System.out.println(++i);
        // print 13
        System.out.println(i++);
        //print 14
        System.out.println(i);
        
        //relational operators
        int val1=5;
        int val2=10;
        if(val1>val2)
        {
            System.out.println(val1>val2);
        }
        if(val1<val2)
        {
            System.out.println(val1<val2);
        }
        if(val1>=val2)
        {
            System.out.println(val1>=val2);
        }
        if(val1!=val2)
        {
            System.out.println(val1!=val2);
        }
        if(val1==val2)
        {
            System.out.println(val1==val2);
        }
        //logical operators
        
        int value1=20;
        int value2=30;
        if(value1<value2 && value2!=value1)
        {
            System.out.println(value1<value2 && value2!=value1);
        }
        if(value1>value2 || value2==value1)
        {
            System.out.println(value1>value2 || value2==value1);
        }
        
	    
	    
	}
}