package processor.repository;

public interface MultiplicationRepository {
    public double[][] multiplyMatrixByConstant(double array[][], double number);
    public void multiplyMatrices(double array[][], double array2[][]);
}
