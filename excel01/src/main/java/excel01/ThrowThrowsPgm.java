package excel01;

public class ThrowThrowsPgm {
	
	public void print01() throws ArithmeticException {
		print02();
	}
	public void print02() throws ArithmeticException {
		print03();
	}
	public void print03() throws ArithmeticException {
		
			int v=100/0;
			System.out.println(v);
			throw new ArithmeticException();
			
		
		
		

	}
	
	
	
	public static void main(String[] args) {
		ThrowThrowsPgm c=new ThrowThrowsPgm();
		try
		{
		c.print01();
		}
		catch (Exception e)
		{
			System.out.println("Exception handled");
		}

	}

}
