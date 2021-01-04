import java.util.Scanner;
import java.util.StringTokenizer;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;


public class ShortestDistanceBetweenTowns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int A[][]=new int[6][6];
				for(int i=0;i<A.length;i++){
		for(int j=0;j<A.length;j++)
		{
			A[i][j]=10000;
			A[i][i]=0;
		
		}
	}
		int B[][]=A;
		for(int a=0;a<n;a++)
		{
			int one=0,two=0;
			String s=sc.nextLine();
			StringTokenizer tok=new StringTokenizer(s," ");
			///System.out.print(s.charAt(0)+" "+s.charAt(1)+" "+s.charAt(3));
			
			

			
			//row
			if(s.charAt(0)=='A')
			{
				one=0;
			}
			if(s.charAt(0)=='B')
			{
				one=1;
			}
			if(s.charAt(0)=='C')
			{
				one=2;
			}
			if(s.charAt(0)=='D')
			{
				one=3;
			}
			if(s.charAt(0)=='E')
			{
				one=4;
			}
			if(s.charAt(0)=='F')
			{
				one=5;
			}
			//coloum
			if(s.charAt(1)=='A')
			{
				two=0;
			}
			if(s.charAt(1)=='B')
			{
				two=1;
			}
			if(s.charAt(1)=='C')
			{
				two=2;
			}
			if(s.charAt(1)=='D')
			{
				two=3;
			}
			if(s.charAt(1)=='E')
			{
				two=4;
			}
			if(s.charAt(1)=='F')
			{
				two=5;
			}
			String o=tok.nextToken();
			int val=Integer.parseInt(tok.nextToken());
			A[one][two]=val;
			A[two][one]=val;
		//	System.out.println(one+" "+two+" "+s.charAt(3));
		
			
		}
		String  s=sc.nextLine();
		int one=0,two=0;
		if(s.charAt(0)=='A')
		{
			one=0;
		}
		if(s.charAt(0)=='B')
		{
			one=1;
		}
		if(s.charAt(0)=='C')
		{
			one=2;
		}
		if(s.charAt(0)=='D')
		{
			one=3;
		}
		if(s.charAt(0)=='E')
		{
			one=4;
		}
		if(s.charAt(0)=='F')
		{
			one=5;
		}
		//coloum
		if(s.charAt(1)=='A')
		{
			two=0;
		}
		if(s.charAt(1)=='B')
		{
			two=1;
		}
		if(s.charAt(1)=='C')
		{
			two=2;
		}
		if(s.charAt(1)=='D')
		{
			two=3;
		}
		if(s.charAt(1)=='E')
		{
			two=4;
		}
		if(s.charAt(1)=='F')
		{
			two=5;
		}
		
	//	String str="";
		String First="",Second="";
	
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				for(int k=0;k<A.length;k++){
					if(A[j][k]>A[j][i]+A[i][k]){
						
						A[j][k]=A[j][i]+A[i][k];
						
						if(j==0){
							First="A";
						}
						if(j==1){
							First="B";
						}
						if(j==2){
							First="C";
						}
						if(j==3){
							First="D";
						}
						if(j==4){
							First="E";
						}
						if(j==5){
							First="F";
						}
						if(i==0){
							First+="A";
						}
						if(i==1){
							First+="B";
						}
						if(i==2){
							First+="C";
						}
						if(i==3){
							First+="D";
						}
						if(i==4){
							First+="E";
						}
						if(i==5){
							First+="F";
						}
						
						if(k==0){
							Second="A";
						}
						if(k==1){
							Second="B";
						}
						if(k==2){
							Second="C";
						}
						if(k==3){
							Second="D";
						}
						if(k==4){
							Second="E";
						}
						if(k==5){
							Second="F";
						}
						if(j==one && k==two){
							System.out.println(First+""+Second+","+A[j][k]);
						}
					}
					
				
				}
			}
			A=B;
			}
			
		
	
	
	
	}

}
