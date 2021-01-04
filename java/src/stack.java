import java.util.Scanner;
import java.util.Stack;


public class stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<String> ops=new Stack<String>();
			Stack<Double> val=new Stack<Double>();
			Scanner sc=new Scanner(System.in);
			for(int j=0;j<8;j++){
			String s=sc.nextLine();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(')
				{
					//System.out.print(i);
				}
				else if(s.charAt(i)=='+')
				{
					ops.push(s.charAt(i)+"");
				}
				else if(s.charAt(i)=='-')
				{
					ops.push(s.charAt(i)+"");
				}
				else if(s.charAt(i)=='*')
				{
					ops.push(s.charAt(i)+"");
				}
				else if(s.charAt(i)=='/')
				{
					ops.push(s.charAt(i)+"");
				}
//				else if(s.charAt(i)=='sqrt')
//				{
//					ops.push(s.charAt(i)+"");
//				}
				else if(s.charAt(i)==')')
				{
					String op=ops.pop();
					double v=val.pop();
					if(op.equals("+")) v=val.pop()+v;
					else if(op.equals("-")) v=val.pop()-v;
					else if(op.equals("*")) v=val.pop()*v;
					else if(op.equals("*")) v=val.pop()/v;
//					else if(op.equals("*")) v=Math.sqrt(v);
					val.push(v);
					
				}
				else val.push(Double.parseDouble(s.charAt(i)+""));
				
			}
			System.out.println(val.pop());
	}
	}
	

}
