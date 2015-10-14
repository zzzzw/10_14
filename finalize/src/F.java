/*
public class finalize1 {
    public static void main(String[] args) {
	new finalize1();
	int a[]=new int[3];
	finalize1 f=new finalize1();
	System.gc();
	
	
	
    }
    public void finalize() throws Throwable{
	super.finalize();
	System.out.println("hello world");
	
    }
    
    

}
*/

public class F {
   public static void main(String args[]) {
      new F();  
      int a[] = new int[3];  
      F f= new F();  
      System.gc();
    }
    public void finalize() throws Throwable{           
        super.finalize();  
        System.out.println("finalize method was called!");
    }
}