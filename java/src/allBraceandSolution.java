import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class allBraceandSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int o=0;o<10;o++)
		{
			Stack<String> ops=new Stack<String>();
			Stack<Double> val=new Stack<Double>();
			Stack<String> test=new Stack<String>();
			
			String s=sc.nextLine();
			boolean ans=true;
			
			
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(')test.push(s.charAt(i)+"");
				else if(s.charAt(i)=='[')test.push(s.charAt(i)+"");
				else if(s.charAt(i)=='{')test.push(s.charAt(i)+"");
				
				else if(s.charAt(i)=='+')ops.push(s.charAt(i)+"");
				else if(s.charAt(i)=='-')ops.push(s.charAt(i)+"");
				else if(s.charAt(i)=='*')ops.push(s.charAt(i)+"");
				else if(s.charAt(i)=='/')ops.push(s.charAt(i)+"");
				else if(s.charAt(i)==')')
				{
					if(test.empty()){
						ans=false;
						break;
					}
					else if(!test.pop().equals("("))
					{
						ans=false;
						break;
					}
					String op=ops.pop();
					double v=val.pop();
					if(op.equals("+"))v=val.pop()+v;
					else if(op.equals("-"))v=val.pop()-v;
					else if(op.equals("*"))v=val.pop()*v;
					else if(op.equals("/"))v=val.pop()/v;
					val.push(v);
				}
				else if(s.charAt(i)==']')
				{
					if(test.empty()){
						ans=false;
						break;
					}
					else if(!test.pop().equals("["))
					{
						ans=false;
						break;
					}
					String op=ops.pop();
					double v=val.pop();
					if(op.equals("+"))v=val.pop()+v;
					else if(op.equals("-"))v=val.pop()-v;
					else if(op.equals("*"))v=val.pop()*v;
					else if(op.equals("/"))v=val.pop()/v;
					val.push(v);
				}
				else if(s.charAt(i)=='}')
				{
					if(test.empty()){
						ans=false;
						break;
					}
					else if(!test.pop().equals("{"))
					{
						ans=false;
						break;
					}
					String op=ops.pop();
					double v=val.pop();
					if(op.equals("+"))v=val.pop()+v;
					else if(op.equals("-"))v=val.pop()-v;
					else if(op.equals("*"))v=val.pop()*v;
					else if(op.equals("/"))v=val.pop()/v;
					val.push(v);
				}
				else{
					String valtemp="";
					for(int j=i;j<s.length();j++)
					{
						if(s.charAt(j)=='+'||s.charAt(j)=='-'||s.charAt(j)=='*'||s.charAt(j)=='/'||s.charAt(j)=='('||s.charAt(j)==')'||s.charAt(j)==']'||s.charAt(j)=='}')
						{
							i=j-1;
							val.push(Double.parseDouble(valtemp));
							break;
						}else
						{
						valtemp+=s.charAt(j);
						}
					}
				}

			}
			if(ans==true&&test.empty())
			System.out.println(val.pop()+"  Yes");
			else System.out.println("No");
		}
	}
}
