import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegernReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int a=sc.nextInt();
			BigInteger bn=BigInteger.valueOf(n);
			BigInteger ba=BigInteger.valueOf(a);
			String nn=new StringBuffer(bn.toString()).reverse().toString();
			String aa=new StringBuffer(ba.toString()).reverse().toString();
			
			int l=Integer.parseInt(nn);
			int o=Integer.parseInt(aa);
			
			int s=l+o;
			BigInteger bb=BigInteger.valueOf(s);
			String S=new StringBuffer(bb.toString()).reverse().toString();
			System.out.print(new BigInteger(S));
		}
		/*
		 get two input and reverse it
		 and use Bigint
	  	 and sum the two and
		 reverse the answer.
		 */
	}

}
