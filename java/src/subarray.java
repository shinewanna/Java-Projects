import java.util.Scanner;
import java.util.StringTokenizer;


public class subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.nextLine());
		double A[]=new double[a];
		String s=sc.nextLine();
		StringTokenizer to=new StringTokenizer(s," ");
		int count=0;
		int c1=0,c2=0;
		for(int i=0;i<a;i++)
		{
			A[i]=Double.parseDouble(to.nextToken());
		}
		
		for(int i=0;i<a-1;i++)
		{
		if(A[i]%2==0&&A[i+1]%2!=0)
		{
			count++;
			
		}else if(A[i]%2!=0&&A[i+1]%2==0)
		{
			count++;
			
		}
		}
		for(int i=0;i<a;i++)
		{
			if(a==2)
			{
				break;
			}
			if(A[i]%2==0)
			{
				c1++;
			}else{
				c2++;
			}
			
		}
		if(c1==c2 && c1!=0 &&c2!=0){
			count++;
		}
		System.out.println(count);
	}

}
