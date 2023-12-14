package java_class_work;

public class Average_of_array {

	

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 5, 4, 18, 15, 10};
	        int sum = 0;
	       // for (int number : numbers)    - this is for-each loop
	        for(int i=0; i<numbers.length; i++){
	            sum += numbers[i];
	        }
	        double average = (double) sum / numbers.length;
	        System.out.println("Average: " + average);
	    }
	}


