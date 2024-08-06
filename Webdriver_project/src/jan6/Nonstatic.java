package jan6;

public class Nonstatic {
	int a,b,c;
	public void addition()
	{
		a=344;
		b=7474;
		c=a=+b;
		System.out.println(c);
		
	}
public void division()
{
a=234;
b=77777;
c=a/b;
System.out.println(c);
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Nonstatic obj=new Nonstatic();
		//*obj.addition();
		obj.division();

	}

}
