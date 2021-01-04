import java.util.Collections;
import java.util.Scanner;


public class UVa12467 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++)
		{
			String s=sc.nextLine();
			
			String str=s.charAt(0)+"";
			String o="";
			for(int i=1;i<s.length();i++)
			{
				str+=s.charAt(i);
				
				 o="";
				for(int j=str.length()-1;j>=0;j--)
				{
					o+=str.charAt(j);
					
				}
				
				if(!s.contains(o))
				{
					if(s.length()!=o.length()){
						o=o.substring(1);
					}
					break;
				}
				
				
			}
			System.out.println(o);
		}

	}

}
