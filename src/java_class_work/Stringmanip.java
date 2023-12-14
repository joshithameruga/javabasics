package java_class_work;

public class Stringmanip {

	
	    public static void main(String[] args) {
	        
	        String str1 = "Employee";
	        String str2 = "Company";

	       
	        if (str1.equals(str2)) {
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }

	       
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Length of str2: " + str2.length());

	        
	        System.out.println("Substring of str1 from index 4: " + str1.substring(4));
	        System.out.println("Substring of str2 from index 4: " + str2.substring(4));
	        
	        String newstring = str1.concat(str2);
	        System.out.println("Concatenated string: " + newstring);

	        //lowercare and  uppercase
	        System.out.println("str1 in lowercase: " + str1.toLowerCase());
	        System.out.println("str2 in uppercase: " + str2.toUpperCase());

	        // Find the index of "lo" in str1
	        int indexOfSubstring = str1.indexOf("lo");
	        System.out.println("Index of 'lo' in str1: " + indexOfSubstring);
	    }
	}


