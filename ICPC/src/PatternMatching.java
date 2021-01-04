public class PatternMatching {

	public static void main(String[] args) {
		String pattern = "bbc";//bcbcb
		String match = "b";
		String testContain = "";
		int count = 0;
		for(int i=0;i<pattern.length();i++)
		{
			testContain+=pattern.charAt(i);
			if(testContain.contains(match)) {
				testContain=testContain.substring(testContain.length()-(match.length()-1));
				count++;
			}	
		}
		System.out.println(count);
	}
}
