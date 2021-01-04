import java.util.Scanner;


public class ZooStory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int a=0;a<n;a++)
		{
			int s=Integer.parseInt(sc.nextLine());
			int res=0;
			for(int i=1;i<s;i++){
			
			res=i*i;
			if(res>s){
				break;
			}
			System.out.println("Cagenum "+res);
		
			}
		}

	}

}
