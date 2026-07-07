public class Matrix {

    private double[][] array;

    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new double[rows][cols];
    }

    public Matrix(double[][] values) {
        this.rows = values.length;
        this.cols = values[0].length;
        this.array = values;
    }


    public void setValue(int i, int j, double value) {
        array[i][j] = value;
    }


    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.array[i][j] = this.array[i][j] + other.array[i][j];
            }
        }
        return result;
    }


    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.array[i][j] = this.array[i][j] * scalar;
            }
        }
        return result;
    }


    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.array[i][k] * other.array[k][j];
                }
                result.array[i][j] = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Matrix a = new Matrix(new double[][]{
                {1, 2},
                {3, 4}
        });

        Matrix b = new Matrix(new double[][]{
                {5, 6},
                {7, 8}
        });

        a.setValue(0, 0, 10);

        System.out.println("Матрица A:");
        a.print();

        System.out.println("Матрица B:");
        b.print();

        System.out.println("A + B:");
        a.add(b).print();

        System.out.println("A * 2:");
        a.multiply(2).print();

        System.out.println("A * B:");
        a.multiply(b).print();
    }
}