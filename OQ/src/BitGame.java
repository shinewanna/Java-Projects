import java.math.BigInteger;
import java.util.Scanner;

public class BitGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < testCase; i++) {
			BigInteger bi = sc.nextBigInteger();
			String binary = bi.toString(2);
			char[] c = binary.toCharArray();
			int resultCount = 0;
			for (int j = 0; j < binary.length(); j++) {
				if (c[j] == '1') {
					for (int k = binary.length() - 1; k > j; k--) {
						if (c[k] == '0') {
							c[k] = '1';
							c[j] = '0';
							resultCount++;
							break;
						}
					}
				}
			}
			System.out.println(resultCount % 2 == 0 ? 2 : 1);
		}
		sc.close();
	}

}
