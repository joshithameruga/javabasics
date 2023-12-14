package java_class_work;
	import java.util.Scanner;
	public class Takinginput {
	    
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int int1 = input.nextInt();

		input.nextLine();
		String string1 = input.nextLine();
		

		String line1 = input.nextLine();
		
		System.out.println("integer = "+ int1  );
		System.out.println("string = "+ string1  );
		System.out.println("line = "+ line1  );
		
	}
	} 


	/*import java.util.Scanner;

	public class Takinginput {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter an Integer: ");
	        int intValue = scanner.nextInt();

	        scanner.nextLine();

	       
	        System.out.print("Enter a String: ");
	        String stringValue = scanner.nextLine();

	        System.out.print("Enter a line of text: ");
	        String lineValue = scanner.nextLine();

	        System.out.println("Integer: " + intValue);
	        System.out.println("String: " + stringValue);
	        System.out.println("Line of text: " + lineValue);

	        scanner.close();
	    }
	}*/

