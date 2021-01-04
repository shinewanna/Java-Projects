import java.util.Scanner;


public class FindCommonSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++)
			
		{
			int c=0,count=0;
			String one=sc.nextLine();
			String two=sc.nextLine();
			int res=0;
			int l=1;
			int real=0;
			
			for(int i=0;i<one.length();i++)
			{
			
				char cc=one.charAt(i);
				for(int j=c;j<two.length();j++)
				{
					char jj=two.charAt(j);
					if(cc==jj)
					{
						
						count++;
						c=j;
						
						res=count;
					//	System.out.println(cc+" "+res);
						if(real<res)
						{
							
							real=res;
						//	System.out.println(real);
						}
						break;
					}
					
				}
				if(i==one.length()-1)
				{
					i=l;
					l++;
					c=0;
					count=0;
					//System.out.println("a");
				}
				
				
			}
			System.out.println(real);
		}
	}

}
