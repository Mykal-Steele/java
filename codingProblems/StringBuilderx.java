// Java Code to illustrate StringBuilder

import java.util.Scanner;

public class StringBuilderx {
	public static void main(String[] argv) throws Exception
	{
		int[][] matrix = {
			{1,2,3},{2,4,2},{2,64,2342}
		};
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(matrix[2][1]);
	}
}
