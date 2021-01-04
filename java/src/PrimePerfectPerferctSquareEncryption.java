import java.io.*;
import java.util.*;
public class PrimePerfectPerferctSquareEncryption {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		//52 htet kyaw twr yin 52 minus lote pay tot 1,7,9.. aedar ty pyan ya tot htet twr tr
		//but it's look very nice,confuse...
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	

		String s2;
		s2=br.readLine();
	
	
		
		
		int a=0;
		int num=0;
		String primeNumbers="";
		int StartNumber=0;//u can change the start number to confuse...
		int A[]=new int[s2.length()+s2.length()+4];
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
		//for perfect square
		int psStartNumber=1;
		int c=s2.length();
		for(int i=psStartNumber;i<=1000000000;i++)
		{
			if(c==s2.length()*2)break;
			int number=i;
			
			int sqrt=(int)Math.sqrt(number);
			if(sqrt*sqrt==number)
			{
			
				A[c]=number;
				c++;
			}
		}
		
	//for perfect number
		A[s2.length()+s2.length()]=6;
		A[s2.length()+s2.length()+1]=28;
		A[s2.length()+s2.length()+2]=496;
		A[s2.length()+s2.length()+3]=8128;	
	Arrays.sort(A);
	
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
