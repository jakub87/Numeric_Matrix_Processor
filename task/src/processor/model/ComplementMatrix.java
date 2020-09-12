package processor.model;

import processor.repository.ComplementRepository;

public class ComplementMatrix extends DeterminantMatrix implements ComplementRepository {
    @Override
    public double[][] complement(double[][] array) {
        double complementMatrix[][] = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                complementMatrix[i][j] = Math.pow(-1, 2+i+j) * determinant(createSubMatrix(array,i,j));
            }
        }
        return complementMatrix;
    }

    @Override
    public void printMatrix(double[][] array) {
        System.out.println("The result is: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.format("%8.2f ", array[i][j]);
            }
            System.out.println();
        }
    }
}
