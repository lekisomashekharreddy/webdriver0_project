package jan8;
public class Demo {
	public static String verify_strings(String str1,String str2)
	{
		String res="";
		if(str1.equalsIgnoreCase(str2))
		{
			res="strings are equal";
			
		}
		else
		{
			res="strings are not equal";
		}
		return res;
	}
	public static boolean compare_values(int a,int b)
	{
		if(a==b)
		{
			return true;
		}
		else
		{
		return false;	
		}
	}
		
 public static void main(String[] args) {
		String res=Demo.verify_strings("hello", "reddy");
		System.out.println(res);
		boolean w=compare_values(2333,2333);
		System.out.println(w);

	}

}
