package excel01;

public class Addition {

	public static void main(String[] args) {
		try
		{int v=100/0;
		System.out.println(v);
		}
		catch (Exception e)
		{
			System.out.println("Exception"+e);
		}

finally
{
	int a=15,b=10;
	int c=a+b;
	System.out.println(c);
}
	}

}
