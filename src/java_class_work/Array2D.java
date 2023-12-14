package java_class_work;

public class Array2D {

	public static void main(String[] args) {
        int[][] arr2D = {{2, 4, 6, 8}, {1, 3, 6, 9}, {2, 8, 12, 16}, {1, 1, 1, 1}};
        
        int sum = 0;

        System.out.println("Values of the diagonal:");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i == j) {
                    System.out.print(arr2D[i][j] + " ");
                 
                    sum += arr2D[i][j];
                    
                }
            }
        }
        System.out.println();
	   System.out.println("sum of daigonal :" + sum);
	}
 }