import java.util.Scanner;
import java.util.StringTokenizer;


public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.nextLine());
		for(int n=0;n<a;n++)
		{
			String s=sc.nextLine();
			StringTokenizer to=new StringTokenizer(s," ");
			Double val=Double.parseDouble(to.nextToken());
			int in=Integer.parseInt(to.nextToken());
			String v=sc.nextLine();
			StringTokenizer to1=new StringTokenizer(v," ");
			Double A[]=new Double[in];
			int count=0;
			for(int i=0;i<in;i++)
			{
				A[i]=Double.parseDouble(to1.nextToken());
			}
		
			int i=0;
			double temp=0;
			while(true)
			{
				if(i==in)
				{
					break;
				}
				if(A[i]%val==0)
				{
					
					i++;
					
				}else{
					
					temp=Math.round(A[i]/val);
					if(temp>Math.floor(A[i]/val) ||temp==0&&Math.floor(A[i]/val)==0)
					{
						
						A[i]++;
						count++;
					}else if(temp==Math.floor(A[i]/val) && A[i]>=val)
					{
						
						A[i]--;
						count++;
					}
					
				}
				
			}
			System.out.println(count);
			/*input
			2
			5 3
			4 5 6
			84 5
			7 8 6 4 6
			output
			2(two times to GCD)but care runtime error...
			389*/
		}

	}

}
