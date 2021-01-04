import java.io.IOException;
import java.util.*;

public class Test
{
	static List<String> pList = new ArrayList<String>();
	void sieveOfEratosthenes(int n) 
	{ 
		boolean prime[] = new boolean[n+1]; 
		for(int i=0;i<n;i++) 
			prime[i] = true; 

		for(int p = 2; p*p <=n; p++) 
		{ 
			if(prime[p] == true) 
			{ 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 

		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == true) {
				pList.add(i+"");
				System.out.print(i + " "); 
			}

		} 
	} 

	public static void main(String[] args) {
		String[] p = {"2","3","5","7","9"};
		Test t = new Test();
		t.sieveOfEratosthenes(9999);

		String a = "1033";
		String b = "8179";
		
		String temp = "";
		for(int i=0;i<a.length();i++) {
			for(int j =0;j<p.length;j++) {

			}
			
		}
	}
}
