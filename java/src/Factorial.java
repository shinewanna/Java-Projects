public class Factorial {

	private int method1(int n) {
		int f=1;
		for (int i=1;i<=n;i++) 
		{
			f=f*i;
		}
	return f;
	}

	private int method2(int n)
	{
		if (n<=0)
			return 1;
	return n*method2(n-1);
	}

	public static void main(String[] args) {
		int n = 5;
		Factorial factorial = new Factorial();
		System.out.println(factorial.method1(n));
		System.out.println(factorial.method2(n));
	}
}
