import java.util.Scanner;
	public class Kata1{

public static boolean isEven(int number) {
        return number % 2 == 0;  
    }

	public static boolean isPrime(int number) {

 if (number <= 1) return false;
        for (int prime = 2; prime <= Math.sqrt(number); prime++) {
            if (number % prime == 0) return false; 
        }
        return true;
    }


		public static int subtract(int number1, int number2) {
		return Math.abs(number1 - number2);
}


		public static float divide(float number1, float number2){
	
if (number1 == 0 || number2 == 0){
System.out.println("0");
        return Float.NaN;
}

	return number1 / number2;
}



	public static int factorOf(int number){
		int count = 0; 

        for (int integer = 1; integer <= number; integer++) {
            if (number % integer == 0) { 
                count++; 
            }
        }
        return count;
}



    public static boolean isSquareNumber(int number) {
        if (number < 0) {
            return false; 

        }

        int sqrt = (int) Math.sqrt(number); 
        return sqrt * sqrt == number; 
	
    }





	public static void main(String[] args) {
       
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter an integer to confirm if it is even");
	int entry1 = scanner.nextInt();

        System.out.println("is " + entry1 + " an even number? "  + isEven(entry1));
   
		System.out.println("Enter an integer to confirm if it is a prime number ");
	int entry2 = scanner.nextInt();

        System.out.println("is " + entry2 + " a prime number? "  + isPrime(entry2));


	System.out.println("Enter first integer for difference: ");
		int entry3 = scanner.nextInt();
		System.out.println("Enter second integer for difference: ");
		int entry4 = scanner.nextInt();

	int result1 = subtract(entry3, entry4);

		System.out.println("The difference of the two numbers is " + result1);



	System.out.println("Enter first integer for division: ");
		float entry5 = scanner.nextFloat();
		System.out.println("Enter second integer for division: ");
		float entry6 = scanner.nextFloat();
	

	float result2 = divide(entry5, entry6);


System.out.println(result2 + " is the quotient");


System.out.print("Enter an integer to check the factor: ");
        int entry7 = scanner.nextInt(); 
        
     
        if (entry7 <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factors = factorOf(entry7); 
            System.out.println("The number of factors of " + entry7 + " is: " + factors);
}



        System.out.print("Enter an integer to confirm if it is a square number: ");
        int number1 = scanner.nextInt();

        if (isSquareNumber(number1)) {
            System.out.println(number1 + " is a square number.");
        } else {
            System.out.println(number1 + " is not a square number."+ isSquareNumber(number1));
        }





    
    }
}
