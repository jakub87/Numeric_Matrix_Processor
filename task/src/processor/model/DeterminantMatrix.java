package processor.model;

import processor.repository.DeterminantRepository;

public class DeterminantMatrix extends Matrix implements DeterminantRepository {

    public double calculateDeterminant2x2(double array[][]) {
        return (array[0][0] * array[1][1]) - (array[1][0] * array[0][1]);
    }

    public double [][] createSubMatrix(double array[][], int row, int column) {
        double temp [][] = new double[array.length-1][array.length-1];
        int newRow = 0;
        int newColumn = 0;

        for (int i = 0; i < array.length ; i++) {
            if (i == row) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (j == column) {
                    continue;
                }
                temp[newRow][newColumn++] = array[i][j];
            }
            newRow++;
            newColumn = 0;
        }
        return temp;
    }

    @Override
    public double determinant(double[][] array) {
        double result = 0;
        int factor = 1;
        if (array.length == 1) {
            return array[0][0];
        } else if (array.length == 2) {
            return calculateDeterminant2x2(array);
        } else {
            for (int i = 0; i < array.length ; i++) {
                result = result + array[0][i] * factor * determinant(createSubMatrix(array,0,i));
                factor = -factor;
            }
            return  result;
        }
    }
}
