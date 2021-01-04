import java.util.Stack;

public class TraingRoomforAsia {
	public static void main(String[] args) {
		String input = "({[]}";
		Stack<String> bracket = new Stack<String>();
		boolean result = true;
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
				bracket.push(input.charAt(i)+"");
			}
			if(input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}') {
				if(bracket.isEmpty())
				{
					result = false;
					break;
				}
				
				String check = bracket.pop();
				if(check.equals("(") && input.charAt(i) == ')');
				else if(check.equals("[") && input.charAt(i) == ']');
				else if(check.equals("{") && input.charAt(i) == '}');
				else {
					result = false;
					break;
				}
			}
		}
		
		if(result && bracket.isEmpty())
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}