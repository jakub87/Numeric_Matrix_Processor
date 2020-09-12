package processor.model;

import java.util.Scanner;

public abstract class Matrix {
    private Scanner scanner;

    public Matrix() {
        scanner = new Scanner(System.in);
    }

    public void printMatrix(double array[][]) {
        System.out.println("The result is: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public double [][] populateMatrix(int numberMatrix) {
        String sizeMatrix = numberMatrix == 1 ? "Enter size of first matrix: " : "Enter size of second matrix: ";
        String elementsMatrix = numberMatrix == 1 ? "Enter first matrix: " : "Enter second matrix: ";

        System.out.println(sizeMatrix);
        String firstMatrixSize = scanner.nextLine();
        System.out.println(elementsMatrix);
        int rows = Integer.parseInt(firstMatrixSize.split(" ")[0]);
        int cols = Integer.parseInt(firstMatrixSize.split(" ")[1]);
        double tab[][] = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            String outputRow = scanner.nextLine();
            for (int j = 0; j < outputRow.split(" ").length; j++) {
                tab[i][j] = Double.parseDouble(outputRow.split(" ")[j]);
            }
        }
        return tab;
    }
}
