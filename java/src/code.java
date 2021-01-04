import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class code {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++)
		{
			String s=sc.nextLine();
			StringTokenizer t=new StringTokenizer(s," ");
			int c=Integer.parseInt(t.nextToken());
			int d=Integer.parseInt(t.nextToken());
			
			String b=sc.nextLine();
			StringTokenizer t1=new StringTokenizer(b," ");
			String A[]=new String[c];
			String B[]=new String[c];
			String ll="";
			for(int i=0;i<c;i++)
			{
				String aa=t1.nextToken();
				B[i]=aa;
				A[i]=aa;
			}
			Arrays.sort(B);
			for(int i=c-1;i>=0;i--){
				ll+=B[i];
			}
			int l=Integer.parseInt(ll);
			int count=0;
			int sa=0,sb=0;
			int v1=0,v2=0;
			while(true){
				int min=0;
				String pp="";
				for(int i=0;i<c;i++)
				{
					pp+=A[i];
				}
				int p=Integer.parseInt(pp);
				if(l==p)
				{
					break;
				}
				if(count==d)
				{
					break;
				}
			for(int i=0;i<c;i++){
				if(i==c-1)
				{	
					A[v1]=sb+"";
					A[v2]=sa+"";
					count++;
					break;	
				}
				if(A[i].compareTo(A[i+1])<min)
				{
					min=A[i].compareTo(A[i+1]);
					sa=Integer.parseInt(A[i]);
					sb=Integer.parseInt(A[i+1]);
					v1=i;
					v2=i+1;
				}
				
				
			}
			
			}		
			for(int i=0;i<c;i++)
			System.out.print(A[i]);
			System.out.println();
		}

	}

}
