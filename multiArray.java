package InputJava;

import java.util.Arrays;

public class multiArray {
    public static void main(String[] args) {
        int[][] matrix=new int[3][4];
        matrix[0][1]=4;
        matrix[2][3]=9;
        System.out.println(Arrays.deepToString(matrix));
        //Or
        int[][] matrix1={
            {1,5,4},
            {4,5,6}
        };
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(matrix1[1][1]);
    }
}
