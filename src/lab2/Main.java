package lab2;
import java.util.*;


public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        
    	Scanner scaleScanner = new Scanner(System.in);
    	System.out.println("Enter amount of rows: ");
    	int rows = scaleScanner.nextInt();
    	System.out.println("Enter amount of columns: ");
    	int cols = scaleScanner.nextInt();
    	

=======
        int rows = 4; 
        int cols = 3; 
>>>>>>> 1e931863ee666b61edc38124b4bca821233ecdea
        Random random = new Random();

        short[][] matrix = new short[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Generate a random short value
                short randomShort = (short) random.nextInt(Short.MAX_VALUE + 1);
                matrix[i][j] = randomShort;
            }
        }
        
        System.out.println("\nGenerated matrix:\n");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }
        
        // transposing matrix
        short[][] trans_matrix = new short[cols][rows]; 
        
        for (int i=0; i < rows; i++) {
        	for (int j=0; j <cols; j++) {
        		trans_matrix[j][i] = matrix[i][j];
        	}
        }
        
        System.out.println("\nTransposed maatrix:\n");
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans_matrix[i][j] + "\t");

            }
            System.out.println();
        }   
        
        
        // get sums
        int sumMax = 0;
        int sumMIn = 0;
        
        for (int i=0; i < rows; i++) {
        	if (i % 2 == 0) {
        		short maxElement = trans_matrix[0][i];
        		for (int j=1; j < cols; j++) {
        			if (trans_matrix[j][i] > maxElement) {
        				maxElement = trans_matrix[j][i];
        			}
        		}
        		sumMax += maxElement;
        	} else {
        		short minElement = trans_matrix[0][i];
                for (int j = 1; j < cols; j++) {
                    if (trans_matrix[j][i] < minElement) {
                        minElement = trans_matrix[j][i];
                    }
                }
                sumMIn += minElement;
        	}
        }
        
        System.out.println("\nSum of the maximum elements of the even columns of the matrix: " + sumMax);
        System.out.println("Sum of the minimum elements of the odd columns of the matrix: " + sumMIn);   
    }
}
