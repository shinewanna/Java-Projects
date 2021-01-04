import java.util.Scanner;


public class UVa10940 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int n=Integer.parseInt(sc.nextLine());
			if(n==0)
			{
				break;
			}
			int A[]=new int[n];
			for(int i=0;i<n;i++)
			{
				A[i]=i+1;
			}
			
			while(true){
				if(n==1){
					break;
				}
				int temp=0;
			for(int i=0;i<n-1;i++)
			{
				if(i==n-2)
				{
					A[n-2]=temp;
					break;
				}
				if(i==0){
				temp=A[i+1];
				}
				A[i]=A[i+2];
				
			}
			n--;
			}
		System.out.println(A[1]);
			
		
		
	}

	}}
