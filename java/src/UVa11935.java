import java.util.Scanner;
import java.util.StringTokenizer;


public class UVa11935 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String a=sc.nextLine();
			if(a.equals("0 F 0"))
			{
				break;
			}
			StringTokenizer to=new StringTokenizer(a," ");
			double fOne=Double.parseDouble(to.nextToken());
			String type=to.nextToken();
			double fTh=Double.parseDouble(to.nextToken());
			double l=0.0,g=0.0,m=0.0,goal=0.0,fc1=0.0,fc2=0.0,lcount=0.0,count=0.0,lastv=0.0,count1=0.0;
			double minusgas=0.0,res=0.0,temp1=0.0,temp2=0.0,v1=0.0,lg=0.0,gcount=0.0;
			double ff=0;
			while(true){
				String val=sc.nextLine();
				StringTokenizer to1=new StringTokenizer(val," ");
				double v=Double.parseDouble(to1.nextToken());
				String t=to1.nextToken();
				if(t.equals("Leak"))
				{
					if(v>temp2&&temp2!=0)
					{
						lg+=v;
						gcount++;
					}else{
					l+=v;
				
					lcount++;
					}
					
				}else if(t.equals("F"))
				{
					ff=Double.parseDouble(to1.nextToken());
					
					
						res=(fTh*v)/100;
						//System.out.print(v+" "+ff+" "+res+" "+fTh);
					
						
						lastv=v;
						
					count++;
				
				}
				else if(t.equals("Gas"))
				{
					l=v;
					if(count==0){
					 minusgas=(v*fTh)/100;
					//System.out.print(minusgas+" a");
					}else{
						minusgas=(v*ff)/100;
					//	System.out.print(minusgas);
					}
					
				}else if(t.equals("Me"))
				{
					temp2=v;
					
					count1++;
				}else if(t.equals("Goal"))
				{
					temp1=v;
					//int val1=v-lastv;
				//	System.out.println(minusgas);
					
					if(count==0)
						
					res=Math.abs(100/100*fTh)+(v-(l*lcount))-minusgas-(v-temp2);
					else{
						v1=v-lastv;
						
						
						if(count1==0){
						res+=Math.abs((ff*v1)/100)+(v*lcount)-l-minusgas;
						}
						if(count1>0){
							System.out.println(temp2);
							System.out.println(l);
							System.out.println(temp2*lcount-l);
							System.out.print((v*gcount)-lg);
							res+=Math.abs((ff*v1)/100)-((temp2*lcount)-l)-minusgas+(v*gcount)-lg;
						}
					}
					
					break;
				}
				
			}
			System.out.println(res);
			}

	}

}
