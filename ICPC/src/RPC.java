import java.util.Scanner;

public class RPC {

	public static void main(String[] args) {
		String[][] RPC = {{"T","B","A"},
						 {"A","T","B"},
						 {"B","A","T"}};
		
		int aWinCount = 0;
		int bWinCount = 0;
		
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		
		for(int i =0;i<A.length();i++) {
			int a = Integer.parseInt(A.charAt(i)+"");
			int b = Integer.parseInt(B.charAt(i)+"");
			if(RPC[a][b].equals("A")) aWinCount++;
			if(RPC[a][b].equals("B")) bWinCount++;
		}
		
		System.out.println(aWinCount==bWinCount? "Tie" :aWinCount>bWinCount? "A":"B");
	}
}