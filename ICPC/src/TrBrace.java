import java.util.Scanner;
import java.util.Stack;

public class TrBrace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			boolean output = true;
			Stack<String> st = new Stack<String>();
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{') {
					st.push(s.charAt(j) + "");
				}
				if (s.charAt(j) == ')' || s.charAt(j) == ']' || s.charAt(j) == '}') {
					try {
						String match = s.charAt(j) + "";
						String front = st.pop();

						if (front.equals("(") && match.equals(")")) {

						} else if (front.equals("[") && match.equals("]")) {

						} else if (front.equals("{") && match.equals("}")) {

						} else {
							output = false;
						}
					} catch (Exception e) {
						output = false;
					}
				}

			}
			if (!st.isEmpty()) {
				output = false;
			}
			System.out.println(output ? "YES" : "NO");
		}

	}

}
