import java.util.Scanner;


public class Geek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++)
		{
			Boolean found=false;
			String ss=sc.nextLine();
			int count=Integer.parseInt(ss);
			//count=count+1;
			while(true){
			int count1=0;
			
			count=count+1;
			String s=count+"";
		//	System.out.println(s.length()+" "+count);
			for(int i=0;i<s.length();i++)
			{	char cc=s.charAt(i);
				for(int j=0;j<s.length();j++)
				{
					char c1=s.charAt(j);
					if(cc==c1 && i==j){
						
					}
					
					else if(cc==c1)
					{
						count1++;
					}
					//System.out.print(count1);
				}
			}
			if(count1==0){
				System.out.println(count);
				break;
			}
			}
			
			
		}
	}

}
