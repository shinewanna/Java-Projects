import java.io.*;
import java.util.*;
public class Encryption {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	

		String st;
		st=br.readLine();
	
		
		StringTokenizer stk=new StringTokenizer(st,":");
		
		int s1=Integer.parseInt(stk.nextToken());
		while(s1>=26)
		{
			s1-=26;
		}
		String s2=stk.nextToken();
	
		
		
		int ii=0;
		for(int i=0;i<s2.length();i++){
			char cc=s2.charAt(i);
			
			
		    if(cc>='A'&&cc<='Z'){
				 ii=(int)cc+s1;
				 if(ii>'Z'){
						ii=ii-26;
					}
					else if(ii<'A'){
							ii=ii+26;
					}
				
			}
		
			
		    else if(cc>='a'&&cc<='z'){
				 ii=(int)cc+s1;
				  if(ii>'z'){
						ii=ii-26;
					}
					else if(ii<'a'){
							ii=ii+26;
						}
			}
		
			
		    else if(cc>='0'&&cc<='9'){
		    	while(s1>10){
		    		s1-=10;
		    	}
				 ii=(int)cc+s1;
				 if(ii>'9'){
						ii=ii-10;
					}
					else if(ii<'0'){
							ii=ii+10;
						}
//				 System.out.println(s1+"!");
			}
			
			else if(cc==' '){
				ii=' ';
				}
		
					System.out.print((char)(ii));
					
					}
	}

}
