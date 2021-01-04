import java.math.BigInteger;
import java.util.Scanner;


public class bigIntToBinary {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a Number: ");
	    String n = in.next();
	    BigInteger nn = new BigInteger(n);
	    if(nn.compareTo(BigInteger.ZERO)<0){
	        System.out.println("Number cannot be less than 0");
	    
	    }else{
	        System.out.println("Convert to binary is:");
	        print2Binaryform(nn);
	        System.out.println("");
	    }
	}
	private static void print2Binaryform(BigInteger number) {
	    BigInteger reminder2;
	    if(number.compareTo(BigInteger.ONE)<=0){
	        System.out.print(number);
	        return;
	    }
	    reminder2 = number.mod(new BigInteger(""+2));
	    print2Binaryform(new BigInteger(""+number.divide(new BigInteger("2"))));
	    System.out.print(reminder2);
	}
}
