import java.io.ObjectInputStream.GetField;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class BlockChain {

	static String[] data;
	static String[]	hash;
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		
	    generateHash("Do you protect your data?");
	    generateHash("Security is very important.");
	
	}
	
	private static String generateHash(String txt) throws NoSuchAlgorithmException {
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(txt.getBytes());
		byte[] digest = m.digest();
		BigInteger bi = new BigInteger(1,digest);
		String hashText = bi.toString(16);
		System.out.println(hashText);
		return hashText;
	}

}
