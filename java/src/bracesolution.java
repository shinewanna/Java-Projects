import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class bracesolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<10;j++){
		Stack<String> op=new Stack<String>();
		Stack<Double> val=new Stack<Double>();
		String s=sc.nextLine();
		boolean ans=true;
		double result=0.0;
		for(int i=0;i<s.length();i++)
		{
//			System.out.println(i+" i");
			if(s.charAt(i)=='(');
			else if(s.charAt(i)=='+')op.push(s.charAt(i)+"");
			else if(s.charAt(i)=='-')op.push(s.charAt(i)+"");
			else if(s.charAt(i)=='*')op.push(s.charAt(i)+"");
			else if(s.charAt(i)=='/')op.push(s.charAt(i)+"");
			//if u see ')'
			else if(s.charAt(i)==')')
			{
				//one operator pop and we need two value to add or sub or...
				String ops=op.pop();
				//so first,last value pop and
				double v=val.pop();
				//add if operator is '+' with another value.pop
				if(ops.equals("+"))v=val.pop()+v;
				else if(ops.equals("-"))v=val.pop()-v;
				else if(ops.equals("*"))v=val.pop()*v;
				else if(ops.equals("/"))v=val.pop()/v;
				val.push(v);
			}
			else 
			{
				String temp="";
				//variable add and push value
				for(int t=i;t<s.length();t++)
				{
					//variable 1 lone chin se fik ny loz poun pay tr
					//like 90,100,1000 aee lo 3 lone 4 lone 
					if(s.charAt(t)!='+'&&s.charAt(t)!='-'&&s.charAt(t)!='*'&&s.charAt(t)!='/'&&s.charAt(t)!='('&&s.charAt(t)!=')')
					{	
						temp+=s.charAt(t)+"";
					}
					else
					{
						double o=Double.parseDouble(temp);
						//d mar 't' toe p pyan sa tot 'i' ka ma toe ty tot pyan p 
						//d htae htet win lr tl arr kyout i=t-1;
						i=t-1;
						val.push(o);
						break;
					}
				}
			}
			}
		System.out.println(val.pop());
		}
	}
	}
