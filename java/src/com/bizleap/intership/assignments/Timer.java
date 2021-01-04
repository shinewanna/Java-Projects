package com.bizleap.intership.assignments;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;


public class Timer {

	/**
	 * @param args
	 */
	static TimerTask t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StartTimer();
		if(sc.hasNext()){
			String s=sc.nextLine();
			System.out.print(s);
			CancelTimer();
		}
	}

	private static void CancelTimer() {
		// TODO Auto-generated method stub
	t.cancel();
	
	}

	private static void StartTimer() {
		// TODO Auto-generated method stub
		t=new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Random r=new Random();
				int a=r.nextInt(3)+1;
				int b=r.nextInt(3)+1;
				System.out.println(a+" "+b);
			}
		};
		new java.util.Timer().schedule(t,1000*5);
		
	}

}
