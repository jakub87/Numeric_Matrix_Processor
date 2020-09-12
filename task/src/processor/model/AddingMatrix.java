package processor.model;

import processor.repository.AddingRepository;

public class AddingMatrix extends Matrix implements AddingRepository {
    @Override
    public void addMatrices(double[][] array, double[][] array2) {
        if (array.length == array2.length && array[0].length == array2[0].length) {
            for (int i = 0; i < array.length ; i++) {
                for (int j = 0; j < array[0].length ; j++) {
                    System.out.print(array[i][j]+array2[i][j]+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
