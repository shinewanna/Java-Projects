import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class LastOne {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = Integer.parseInt(sc.nextLine());
	 HashSet<String> set = new HashSet<String>();
	 List<String> list = new ArrayList<String>();
	 for(int i=0;i<n;i++) {
		 String s = sc.nextLine();
		 StringTokenizer tok = new StringTokenizer(s, " ");
		 String u = tok.nextToken();

		 if(set.add(u)) {
			 list.add(s);
		 }
	 }
	 for(int j=0;j<list.size();j++) {
		 System.out.println(list.get(j));
	 }
	}
}
