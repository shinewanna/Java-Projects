import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class longestrepeatedGATTACA {

	public longestrepeatedGATTACA() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++)
		{
			String str=sc.nextLine();
			String A[]=new String[str.length()];
			
			for(int i=0;i<str.length();i++)
			{
				
				String ap=str.substring(i);
				A[i]=ap;
			//	System.out.println(ap);
			}
		Arrays.sort(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		int max=0;
		for(int i=0;i<A.length;i++)
		{
			if(i==0)
			{
				System.out.println(i+"   "+A[i]+"    -");
			}
			else{
				int minlen=Math.min(A[i].length(), A[i-1].length());
				
				for(int j=0;j<minlen;j++)
				{
					if(A[i].charAt(j)!=A[i-1].charAt(j))
					{
						
						if(max<j)
						{
							max=j;
							System.out.println(i+"     "+A[i]+"     "+max);
			
						}
						
					}
					else{
						
						if(max<minlen)
						{
							max=minlen;
							System.out.println(minlen+"     "+A[i]+"     "+max);
						}
					}
				}
				
			}
			
		}
		System.out.println(max);
		
		}

	}

}
