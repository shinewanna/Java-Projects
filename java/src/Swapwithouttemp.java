
public class Swapwithouttemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=5;
		a=b+(b=a)*0;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
