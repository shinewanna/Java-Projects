import java.util.Scanner;

public class Shortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{0,10000,10000,10000,10000,399,3075},
				   {10000,0,10000,2601,10000,10000,3363},
				   {10000,10000,0,10000,5473,10000,291},
				   {10000,10000,10000,0,8525,4477,10000},
				   {10000,10000,5473,852,0,10000,10000},
				   {399,10000,10000,4477,10000,0,6114},
				   {3075,3363,291,10000,10000,6114,0}};
		
		int b[][]=a;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				for(int k=0;k<a.length;k++){
					if(a[j][k]>a[j][i]+a[i][k]){
						b[j][k]=a[j][i]+a[i][k];
					}
				
				}
			}
			a=b;
			}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
