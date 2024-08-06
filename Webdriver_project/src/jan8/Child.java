package jan8;

public class Child  extends Parent{
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Parent.addition(2333, 334);
		Parent.division(233.44, 333.2222);
		Child.division(334, 677);

	}

}
