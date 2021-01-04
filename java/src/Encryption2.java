import java.io.*;
import java.util.*;
public class Encryption2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
	

		String s2;
		s2=sc.nextLine();
	
		String nums=sc.nextLine();
		int A[]=new int[nums.length()];
		StringTokenizer tok=new StringTokenizer(nums," ");
		int a=0;
		while(tok.hasMoreTokens())
		{
			int j=Integer.parseInt(tok.nextToken());
			while(j>=26)
			{
				j-=26;
			}
			A[a]=j;
			a++;
		}
		
		
	
		
		
		int ii=0;
		int b=-1;
		for(int i=0;i<s2.length();i++){
			char cc=s2.charAt(i);
			
			if(cc!=' ')
			{
				b++;
			}
		    if(cc>='A'&&cc<='Z'){
				 ii=(int)cc+A[b];
				 if(ii>'Z'){
						ii=ii-26;
					}
					else if(ii<'A'){
							ii=ii+26;
					}
			}
		
			
		    else if(cc>='a'&&cc<='z'){
				 ii=(int)cc+A[b];
				  if(ii>'z'){
						ii=ii-26;
					}
					else if(ii<'a'){
							ii=ii+26;
						}
			}
		
			
		    else if(cc>='0'&&cc<='9'){
		    	while(A[b]>10){
		    		A[b]-=10;
		    	}
				 ii=(int)cc+A[b];
				 if(ii>'9'){
						ii=ii-10;
					}
					else if(ii<'0'){
							ii=ii+10;
						}
			}
			
			else if(cc==' '){
				ii=' ';
				}
		
					System.out.print((char)(ii));
					
					}
	}

}
