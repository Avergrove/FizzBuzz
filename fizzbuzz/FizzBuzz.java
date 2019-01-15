public class FizzBuzz{
	public static void main(String[] args){
		
		if(!validateArguments(args)){
			return;
		}
		
		int lowerLimit = Integer.parseInt(args[0]);
		int upperLimit = Integer.parseInt(args[1]);
		
		printFizzBuzz(lowerLimit, upperLimit);
	}
	
	private static boolean validateArguments(String[] args){
		if(args.length != 2){
			System.out.println("Usage: java FizzBuzz [lowerLimit] [upperLimit]");	
			return false;
		}
		
		if(!stringIsInteger(args[0]) || !stringIsInteger(args[1])){
			System.out.println("[lowerLimit] and [upperLimit] must be valid integers!");
			return false;
		}
		
		return true;
	}
	
	private static void printFizzBuzz(int lowerLimit, int upperLimit){
		for(int i = lowerLimit; i < upperLimit; i++){
			if(i % 15 == 0){
				System.out.println("fizzbuzz");
			}
			
			else if(i % 3 == 0){
				System.out.println("fizz");
			}
			
			else if(i % 5 == 0){
				System.out.println("buzz");
			}
			
			else{
				System.out.println(i);
			}
		}
	}
	
	private static boolean stringIsInteger(String s){
		try{
			int lowerLimit = Integer.parseInt(s);
		}
		
		catch(NumberFormatException ex){
			return false;
		}
		
		return true;
	}
}