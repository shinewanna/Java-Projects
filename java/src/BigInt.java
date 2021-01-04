import java.math.BigInteger;
import java.util.Scanner;


public class BigInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			BigInteger n=sc.nextBigInteger();
			if(n.mod(BigInteger.valueOf(17)).equals(BigInteger.ZERO)){
				BigInteger[] a=n.divideAndRemainder(BigInteger.TEN);
				n=a[0].subtract(a[1].multiply(BigInteger.valueOf(5)));
				if(n.mod(BigInteger.valueOf(17)).equals(BigInteger.ZERO))
				System.out.println("1");
				else
					System.out.println("0");
				
			}else if(n.equals(BigInteger.ZERO))break;
			else
				System.out.println("0");
		}

	}

}
