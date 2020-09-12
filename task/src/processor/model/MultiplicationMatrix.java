package processor.model;

import processor.repository.MultiplicationRepository;

public class MultiplicationMatrix extends Matrix implements MultiplicationRepository {
    @Override
    public double[][] multiplyMatrixByConstant(double[][] array, double number) {
        double matrixByConstant [][] = new double[array.length][array[0].length];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                matrixByConstant[i][j] = number * array[i][j];
             }
        }
        return matrixByConstant;
    }

    @Override
    public void multiplyMatrices(double[][] array, double[][] array2) {
        if (array[0].length == array2.length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array2[0].length; j++) {
                    double result = 0;
                    for (int k = 0; k < array[0].length ; k++) {
                        result += (array[i][k] * array2[k][j]);
                    }
                    System.out.print(result+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
