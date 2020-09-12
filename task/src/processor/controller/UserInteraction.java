package processor.controller;

import processor.model.*;

import java.util.Scanner;

public class UserInteraction {
    private Scanner scanner;
    private double array[][];
    private double array2[][];
    private int number;
    private TransposeMatrix transposeMatrix;
    private AddingMatrix addingMatrix;
    private MultiplicationMatrix multiplicationMatrix;
    private DeterminantMatrix determinantMatrix;
    private ComplementMatrix complementMatrix;

    public UserInteraction() {
        scanner = new Scanner(System.in);
        number = 1;
        transposeMatrix = new TransposeMatrix();
        addingMatrix = new AddingMatrix();
        multiplicationMatrix = new MultiplicationMatrix();
        determinantMatrix = new DeterminantMatrix();
        complementMatrix = new ComplementMatrix();
    }

    private void mainMenu() {
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix to a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
        System.out.println("Your choice: ");
    }

    private void transposeMenu() {
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        System.out.println("Your choice: ");
    }

    public void run() {
            int choice;
            do {
                mainMenu();
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    array = addingMatrix.populateMatrix(1);
                    array2 = addingMatrix.populateMatrix(2);
                    addingMatrix.addMatrices(array, array2);
                } else if (choice == 2) {
                    array = multiplicationMatrix.populateMatrix(1);
                    System.out.println("Provide a constant");
                    number = Integer.parseInt(scanner.nextLine());
                    multiplicationMatrix.printMatrix(multiplicationMatrix.multiplyMatrixByConstant(array,number));
                } else if (choice == 3) {
                    array = multiplicationMatrix.populateMatrix(1);
                    array2 = multiplicationMatrix.populateMatrix(2);
                    multiplicationMatrix.multiplyMatrices(array, array2);
                } else if (choice == 4) {
                    transposeMenu();
                    int transposeChoice = Integer.parseInt(scanner.nextLine());
                    if (transposeChoice == 1) {
                        array = transposeMatrix.populateMatrix(1);
                        transposeMatrix.printMatrix(transposeMatrix.mainDiagonal(array));
                    } else if (transposeChoice == 2) {
                        array = transposeMatrix.populateMatrix(1);
                        transposeMatrix.sideDiagonal(array);
                    } else if (transposeChoice == 3) {
                        array = transposeMatrix.populateMatrix(1);
                        transposeMatrix.verticalLine(array);
                    } else if (transposeChoice == 4) {
                        array = transposeMatrix.populateMatrix(1);
                        transposeMatrix.horizontalLine(array);
                    }
                } else if (choice == 5) {
                    array = determinantMatrix.populateMatrix(1);
                    System.out.println(determinantMatrix.determinant(array));
                } else if (choice == 6) {
                    array = complementMatrix.populateMatrix(1);
                    double determinantMain = determinantMatrix.determinant(array);
                    determinantMain = 1/determinantMain;
                    complementMatrix.printMatrix(multiplicationMatrix.multiplyMatrixByConstant(transposeMatrix.mainDiagonal(complementMatrix.complement(array)),determinantMain));
                }
            } while (choice!=0);
    }
}
