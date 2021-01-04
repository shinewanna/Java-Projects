import java.util.Scanner;


public class Problem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		
		String a=sc.nextLine();
		String b=sc.nextLine();
		int count=0;
		for(int i=0;i<n;i++)
		{
			
			char cc=a.charAt(i);
			char c=b.charAt(i);
			if(cc==c)
			{
				
			}else{		
				int res=cc-c;
				
				if(res<0){
				while(true)
				{
					if(res==0)
					{
						break;
						
					}
					
					if(res+13>0)
					{
						res+=1;
						count++;
						
					}else{
						res+=13;
						count++;
					}
					
				}	
				}else{
					res=26-res;
					while(true)
					{
						if(res==0)
						{
							break;
							
						}
						if(res-13<0)
						{
							res-=1;
							count++;
							
						}else{
							res-=13;
							count++;
						}
						
					}	
				}
				
				
			}
			
			
		}
		System.out.println(count);
		

	}

}
