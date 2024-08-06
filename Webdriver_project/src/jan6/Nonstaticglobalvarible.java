package jan6;

public class Nonstaticglobalvarible {
	int a,b,c;
	public void addition()
	{
		a=345;
		b=453;
		c=a+b;
		System.out.println(c);
	}
   public void divison() {
	   a=3444;
	   b=344;
	   c=a/b;
	   System.out.println(c);
	   
   }
   
       
       
   
	

	   
 
         
	

	public static void main(String[] args) {
		Nonstaticglobalvarible obj = new Nonstaticglobalvarible();
		  obj.addition();
		  obj.divison();
		
	       	
		

	}

}
