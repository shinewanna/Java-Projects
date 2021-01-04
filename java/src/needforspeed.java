import java.util.*;

public class needforspeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		double mn = -1e9, mx = 1e9;
		double[] d = new double[n];
		double[] s = new double[n];
		
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextDouble();
			s[i] = sc.nextDouble();
			//System.out.println(-s[0]+" "+-s[1]+" "+-s[2]);
			mn = Math.max(mn, -s[i]);
			//System.out.println(mn);
		}
		
		//System.out.println(mn);
		System.out.println(Arrays.binarySearch(d,10));
		
		while (mx - mn > 1e-9) {
			double c = (mx + mn) / 2, time = 0.0;
			
			for (int i = 0; i < n; i++){
				time += d[i] / (s[i] + c);
			//	System.out.println(time);
			}
			if (time > t)
				mn = c;
			else
				mx = c;
		}
		System.out.printf("%.2f\n", (mx + mn) / 2);
		sc.close();
	}
}