import java.util.Scanner;


public class Ez {

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
			String str="";
			String temp="";
			int res=0;
			for(int i=0;i<s.length()-1;i++)
			{
			     str+=s.charAt(i)+"";
				if(str.contains(":)"))
				{
					temp=str+s.charAt(i+1);
					if(temp.contains(":))"))
					{
						str=str.replace(":))", "abc");
						res+=4;
						i++;
					}else{
					str=str.replace(":)", "ab");
					res+=2;
					}
				}
				else if(str.contains(":("))
				{
					temp=str+s.charAt(i+1);
					if(temp.contains(":(("))
					{
						str=str.replace(":((", "abc");
						res-=5;
						i++;
					}else{
					str=str.replace(":(", "ab");
					res-=1;
					}
				}
				
			}
			System.out.println(res);
		}
	}

}
