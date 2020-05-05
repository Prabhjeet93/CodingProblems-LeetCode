package arrayAndStrings;

public class FindDiagonalOrder {

	
	public int[] findDiagonalOrder(int[][] matrix) {
	       
        if (matrix.length == 0 || matrix[0].length == 0) {
           return new int[]{};
       }
        int dir = 0;
       int x = 0;
       int y = 0;
       int r = matrix.length;
       int c = matrix[0].length;
       int[] output = new int[matrix.length * matrix[0].length];
       
       for (int i = 0; i < r * c; i++) {
           output[i] = matrix[x][y];
           
           if ((x + y) % 2 == 0) {
               // If last column then go to next row
               if (y == c - 1) {
                   x++;
               }
               // If first row but not last column then go to next column
               else if (x == 0) {
                   y++;
               }
               // Go up
               else {
                   x--;
                   y++;
               }
           }
           else {
               // If last row then go to next column
               if (x == r - 1) {
                   y++;
               }
               // If first column but not last row then go to next row
               else if (y == 0) {
                   x++;
               }
               // Go down
               else {
                   x++;
                   y--;
               }
           }
       }
       
       return output;
       
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
