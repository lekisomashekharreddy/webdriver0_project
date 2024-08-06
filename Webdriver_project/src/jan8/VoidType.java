package jan8;

import jan6.Static;

public class VoidType {
	public static String verify_strings(String str1 ,String str2)
	{
		String res="";
		if (str1.equalsIgnoreCase(str2)) {

			res="strings are equal";

		}
		else 



		{
			res="strings are not equal";

		}
		return res;
	}
	public static boolean compare_values(int a1,int b)
	{
		if(a1==b)
		{
			return true;
		}
			
		else {
			return false;
		}


	}

	public static void main(String[] args) {
		String res=VoidType.verify_strings("somu", "somu");
		System.out.println(res);
		boolean w=VoidType.compare_values(566, 990);
		System.out.println(w);
		


	}

}
