import java.util.Scanner;
import java.util.StringTokenizer;

public class PermuationInversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < c; i++) {
			String line = sc.nextLine();
			StringTokenizer tok = new StringTokenizer(line, " ");
			int n = Integer.parseInt(tok.nextToken());
			int k = Integer.parseInt(tok.nextToken());
			System.out.println(perInv(n, k));
		}
	}

	private static int perInv(int n, int k) {
		if (n == 0)
			return 0;
		if (k == 0)
			return 1;

		int sum = 0;
		for (int i = 0; i <= k; i++) {

			if (i <= n - 1) {
				sum += perInv(n - 1, k - i);
			}	
		}
		return sum;

	}

}
