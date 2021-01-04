package com.bizleap.intership.assignments;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TimerTask;


public class Assignment28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String A[][]=new String[3][3];
		//Adding Empty values to the Array
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				A[i][j]="  ";
			}
		}
		int c=0;String temp="";
		while(true)
		{
			if(c==0)System.out.println("Player 1 turn");
			
			String p=sc.nextLine();
			//if already chosen the place,request another one
			while(temp.contains(p))
			{
				System.out.println("Already choosen the place");
					p=sc.nextLine();
			}
			temp+=p;
			
			StringTokenizer t1=new StringTokenizer(p," ");
			int row=Integer.parseInt(t1.nextToken());
			int col=Integer.parseInt(t1.nextToken());
			
			if(c%2==0)
			{
			
			temp+=row+" "+col;
			
			A[row-1][col-1]="P1";
			//System.out.println("Player 2 turn");
			c++;
			}
			else 
			{ 
			A[row-1][col-1]="P2";
			//System.out.println("Player 1 turn");
			c++;
			}
			
			int C1=0,C2=0;
			for(int i=0;i<A.length;i++)
			{
				int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
				int dc=2;
				for(int j=0;j<A.length;j++)
				{
					if(j==A.length-1)System.out.print(A[i][j]);
					else System.out.print(A[i][j]+"|");
					//Add count++ if Row field was marked
					if(A[i][j].equals("P1"))c1++;
					else if(A[i][j].equals("P2"))c2++;
					
					//Add count++ if Column field was marked
					if(A[j][i].equals("P1"))c3++;
					else if(A[j][i].equals("P2"))c4++;
					
					//Add count++ if Diagonal field was marked
					if(A[j][j].equals("P1"))c5++;
					else if(A[j][j].equals("P2"))c6++;
					
					if(A[j][dc].equals("P1"))c7++;
					else if(A[j][dc].equals("P2"))c8++;
					dc--;
								
					//if Any count is 3,Someone is win...
					if(c1==3||c3==3||c5==3||c7==3)C1=3;
					else if(c2==3||c4==3||c6==3||c8==3)C2=3;
				}
				System.out.println();
				System.out.print("---------");
				System.out.println();
			}
			//Winning Output
			if(C1==3)
			{
				System.out.print("Player 1 Win!!!");
				break;
			}
			else if(C2==3){
				System.out.print("Player 2 Win!!!");
				break;
			}
			
			//if not,the next user
			if((c-1)%2==0)
				System.out.println("Player 2 turn");
			else 
				System.out.println("Player 1 turn");
		}
	}

}
