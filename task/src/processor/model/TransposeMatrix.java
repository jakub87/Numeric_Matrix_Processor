package processor.model;

import processor.repository.TransposeDiagonalRepository;
import processor.repository.TransposeLineRepository;

public class TransposeMatrix extends Matrix implements TransposeDiagonalRepository, TransposeLineRepository {
    @Override
    public double[][] mainDiagonal(double[][] array) {
        double diagonalMatrix[][] = new double[array.length][array[0].length];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[0].length ; j++) {
               diagonalMatrix[i][j] = array[j][i];
            }
        }
    return diagonalMatrix;
    }

    @Override
    public void sideDiagonal(double[][] array) {
        System.out.println("The result is:");
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[array[0].length-1-j][(array.length-1)-i]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public void verticalLine(double[][] array) {
        System.out.println("The result is:");
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][array[0].length-1-j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public void horizontalLine(double[][] array) {
        System.out.println("The result is:");
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[array.length-1-i][j]+" ");
            }
            System.out.println();
        }
    }
}
