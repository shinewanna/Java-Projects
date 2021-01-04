import java.io.*;
import java.util.*;
public class PrimeEncryption {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		String s2;
		s2=sc.nextLine();
	
	
		
		
		int a=0;
		int num=0;
		String primeNumbers="";
		System.out.print("Enter Start Number:");
		int StartNumber=Integer.parseInt(sc.nextLine());//u can change the start number to confuse...
		int A[]=new int[s2.length()];
		for(int i=StartNumber;i<=1000000000;i++)
		{
			if(a==s2.length())break;
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter++;
				}
			}
	
			if(counter ==2)
			{
				primeNumbers=primeNumbers+i+" ";
				int j=i;
				while(j>=26)
				{
					j-=26;	
				}
				A[a]=j;
				a++;
			}
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
