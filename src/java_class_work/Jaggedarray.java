package java_class_work;

public class Jaggedarray {

	
	    public static void main(String[] args) {
	        
	        int[][] jaggedArray = {
	                {1, 2, 3, 4, 5},
	                {7, 5 , 10},
	                {6, 7, 9, 8},
	                {11, 13, 15}
	        };

	        for (int i = 0; i < jaggedArray.length; i++) {
	            for (int j = 0; j < jaggedArray[i].length; j++) {
	                System.out.print(jaggedArray[i][j]);
	                if (j < jaggedArray[i].length - 1) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println(" and  Length = " + jaggedArray[i].length);
	        }
	    }
	}


