
public class Gen3 {
	
	public static void main(String[] args) {
		int lower_limit = Integer.parseInt(args[0]);
		int upper_limit = Integer.parseInt(args[1]);
		int min;
		int rand = (int)((Math.random() * (upper_limit - lower_limit)) + lower_limit);
		min = rand;
		System.out.println(rand);
		if (rand < min) min = rand;
		rand = (int)((Math.random() * (upper_limit - lower_limit)) + lower_limit);
		System.out.println(rand);
		if (rand < min) min = rand;
		rand = (int)((Math.random() * (upper_limit - lower_limit)) + lower_limit);
		System.out.println(rand);
		if (rand < min) min = rand;
		System.out.println("The minimal generated number was " + min);
	}	

}


