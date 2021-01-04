import java.util.Scanner;


public class stringDistanceandTransformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				String txt1=sc.nextLine();
				if(txt1.equals("")){
					break;
				}
				String txt2=sc.nextLine();
				//System.out.println(editD(txt1,txt2,txt1.length(),txt2.length()));
				int dp[][]=new int[txt1.length()+1][txt2.length()+1];
				String name="";
				int count=1;
				for(int i=0;i<=txt1.length();i++)
				{
					for(int j=0;j<=txt2.length();j++)
					{	//name="";
						int min1=0;
						
				if(i==0)
				dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				else if(txt1.charAt(i-1)==txt2.charAt(j-1))
					{
					dp[i][j]=dp[i-1][j-1];
					
				}
				else
					
				{	dp[i][j]=1+min(dp[i][j-1],//Insert
							dp[i-1][j],//Delete
							dp[i-1][j-1]);//Replace
		
			/*	name+=min2(dp[i][j-1],//Insert
						dp[i-1][j],//Delete
						dp[i-1][j-1]);//Replace*/
				if((i)==(j))
				{
					name+=min2(dp[i][j-1],//Insert
							dp[i-1][j],//Delete
							dp[i-1][j-1]);//Replace
					
				}
		
				}
				
				
					}
				}
				
				System.out.print(name);
				System.out.println(dp[txt1.length()][txt2.length()]);
				//return dp[length][length2];
			}
			}
	

	
	private static int min(int x, int y, int z) {
		// TODO Auto-generated method stub
		
		if(x<=y&&x<=z)return x;
		if(y<=x&&y<=z)return y;
		else return z;
	}
	private static String min2(int x, int y, int z) {
		// TODO Auto-generated method stub
		
		if(x<=y&&x<=z)return "Insert";
		if(y<=x&&y<=z)return "Delete";
		else return "Replace";
	}

}
