import java.util.Scanner;


public class mike {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String s=sc.nextLine();
		int res=0,tot=0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)>res)
			{
			res=s.charAt(i);
			tot=i;
			}
		}
		System.out.println(s.substring(tot));

	}

}
