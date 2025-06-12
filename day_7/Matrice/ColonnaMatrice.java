package day_7.Matrice;

public class ColonnaMatrice {

	public static void main(String[] args) {
		int[][] matrix = { { 9, 8, 7, 2 }, // [0]
				{ 5, 3, 2 }, // [1]
				{ 6, 6, 7, 1, 4 } // [2] (Max length is 5)
		};

		// --- Part 1: Printing Row by Row (Your original and correct code) ---
		System.out.println("--- Printing Row by Row ---");
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix[j].length; i++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}

		// --- Part 2: Attempting to print Column by Column ---
		System.out.println("-----");
		System.out.println("--- Attempting to print Column by Column ---");

		// First, find the maximum number of columns in any row
		int maxColumns = 0;
		for (int[] row : matrix) {
			if (row.length > maxColumns) {
				maxColumns = row.length;
			}
		}
		System.out.println("Max columns found: " + maxColumns);

		// Outer loop iterates through potential columns
		for (int col = 0; col < maxColumns; col++) {
			// Inner loop iterates through each row

	}
}
}