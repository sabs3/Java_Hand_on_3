import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		
		Overriding obj = new Overriding();
		
		Scanner user_input = new Scanner(System.in);
				
		System.out.println("Choose 1 for multiplying numbers, 2 for multiplying floats");
		
			
		try {
			int choice = user_input.nextInt();
			if (choice==1) {
				System.out.println("Enter the number 1 : ");
				int number1 = user_input.nextInt();
			
				System.out.println("Enter the number 2 : ");
				int number2 = user_input.nextInt();
				
				obj.multiply(number1,number2);
				}
			
			if(choice==2) {
				
				System.out.println("Enter the float number 1 : ");
				float number1 = user_input.nextFloat();
				
				System.out.println("Enter the float number 2 : ");
				float number2 = user_input.nextFloat();
				
				obj.multiply(number1,number2);
				
				}	
			}
		catch (Exception e) {
				System.out.println("Error: " + e);
		}
		finally {
			System.out.println("Thank you!");
		}
		}
}
	
	

 