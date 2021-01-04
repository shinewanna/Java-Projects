import java.util.Scanner;
import java.util.StringTokenizer;


public class lexico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=Integer.parseInt(sc.nextLine());
			int A[]=new int[n];
			int B[]=new int[n];
			for(int i=0;i<n;i++)
			{
			String a=sc.nextLine();
			StringTokenizer tok=new StringTokenizer(a," ");
			A[i]=Integer.parseInt(tok.nextToken());
			B[i]=Integer.parseInt(tok.nextToken());
			}
			String b=sc.nextLine();
			StringTokenizer tok1=new StringTokenizer(b," ");
			int q=Integer.parseInt(tok1.nextToken());
			int w=Integer.parseInt(tok1.nextToken());
			int sum=0;int count=0;
			for(int i=0;i<n;i++)
			{
				if(w>q){
					break;
				}
				if(A[i]+sum<w)
				{
					sum+=A[i];				
				}else{
					count++;
					w+=B[i];
				}
			}
			System.out.print(count);
	}
/*4
3 15
6 4
8 5
15 6
20 17*/
}

