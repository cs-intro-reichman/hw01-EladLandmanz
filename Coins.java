public class Coins {
	
	public static void main(String args[]) {
		int quarter = 25;
		int num_quarters = (Integer.parseInt(args[0]) / quarter);
		int cents = (Integer.parseInt(args[0]) % quarter);
		System.out.println("Use " + num_quarters + " quarters and " + cents + " cents" );

	}	

}