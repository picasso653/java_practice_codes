public class JavaMidsem {
    public static void main(String[] args){
        int[][] F = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int[][] S = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] T = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] FH = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] FT = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        int sumF = calculateSum(F);
        int sumS = calculateSum(S);
        int sumT = calculateSum(T);
        int sumFT = calculateSum(FT);
        int sumFH = calculateSum(FH);
        int totalElements = getTotalElements(F, FH, FT, S, T);
        double average = (double) (sumF + sumS + sumT + sumFH + sumFT) / totalElements;

        int totalSum = sumF + sumS + sumT + sumFT + sumFH;
        System.out.println("Sum of elements in array F:  " + sumF);
        System.out.println("Sum of elements in array S:  " + sumS);
        System.out.println("Sum of elements in array T:  " + sumT);
        System.out.println("Sum of elements in array FT:  " + sumFT);
        System.out.println("Sum of elements in array FH:  " + sumFH);

        System.out.println("Total sum of all arrays: " + totalSum);
        System.out.println("The average of all arrays: " + average);
       
    }
    
    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
    public static int getTotalElements(int[][]... arrays ) {
        int totalElements = 0;
        for (int[][] array : arrays) {
            totalElements += array.length * array[0].length;
        }
        return totalElements;
    }
    
}
