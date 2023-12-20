public class Triangle {
	
	public static void main(String args[]) {
		boolean isTriangle = false;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b)))
			isTriangle = true;
		System.out.println(isTriangle);

	}	

}