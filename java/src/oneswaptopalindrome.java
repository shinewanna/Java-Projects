import java.util.Scanner;


public class oneswaptopalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			int mismatch=0;
			String s=sc.nextLine();
			int l=s.length()-1;
			for(int j=0;j<Math.abs(s.length()/2);j++)
			{
					if(s.charAt(j)!=s.charAt(l))
					{
						System.out.println(s.charAt(j)+" "+s.charAt(l));
						mismatch++;
						
					}
					l--;
				
			}
			if(mismatch==0)System.out.println("YES"+mismatch);
			else if(mismatch==2)System.out.println("YES"+mismatch);
			else System.out.println("No"+mismatch);
		}
	}

}
