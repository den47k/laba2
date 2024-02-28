package lab2;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int rows = 4; // You can change the number of rows
        int cols = 3; // You can change the number of columns
        Random random = new Random();

        short[][] matrix = new short[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Generate a random short value
                short randomShort = (short) random.nextInt(Short.MAX_VALUE + 1);
                matrix[i][j] = randomShort;
            }
        }
        
        System.out.println("Generated matrix:\n");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        
        // transposing matrix
        short temp;
        short[][] trans_matrix = new short[cols][rows]; 
        
        for (int i=0; i < rows; i++) {
        	for (int j=0; j <cols; j++) {
        		trans_matrix[j][i] = matrix[i][j];
        	}
        }
        
        System.out.println("\nTransposed maatrix:\n");
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans_matrix[i][j] + " ");

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
        
        System.out.println(sumMax);
        System.out.println(sumMIn);
        
    }
}