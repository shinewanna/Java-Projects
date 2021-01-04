import java.io.*;
import java.util.*;
public class PerfectSquareEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		String s2;
		s2=sc.nextLine();
	
	
		
		
		int a=0;
		int num=0;
		String primeNumbers="";
		//u can change the start number to confuse...
		int A[]=new int[s2.length()];
		int psStartNumber=1;
		int c=0;
		for(int i=psStartNumber;i<=1000000000;i++)
		{
			if(c==s2.length())break;
			int number=i;
			
			int sqrt=(int)Math.sqrt(number);
			if(sqrt*sqrt==number)
			{
			
				A[c]=number;
				c++;
				System.out.print(number+" ");
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
