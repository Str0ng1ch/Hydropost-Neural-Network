import java.util.Arrays;

public class Matrix {
    public float[][] matrix1, matrix2, result_matrix;
    public float[] matrix3;
    float value;
    public Matrix(float[][] matrix1, float[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result_matrix = new float[matrix1.length][matrix2[0].length];
    }

    public Matrix(float[][] matrix1, float[] matrix3) {
        this.matrix1 = matrix1;
        this.matrix3 = matrix3;
        this.result_matrix = new float[matrix1.length][matrix1[0].length];
    }

    public Matrix(float[][] matrix1, float value) {
        this.matrix1 = matrix1;
        this.value = value;
        this.result_matrix = new float[matrix1.length][matrix1[0].length];
    }

    float[][] multiply_matrices() {
        if (matrix1[0].length != matrix2.length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < result_matrix.length; i++)
            for (int j = 0; j < result_matrix[i].length; j++)
                for (int k = 0; k < matrix2.length; k++)
                    result_matrix[i][j] += matrix1[i][k] * matrix2[k][j];
        return result_matrix;
    }

    float[][] multiply_matrix_array() {
        if (matrix1.length != matrix3.length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] * matrix3[i];
        System.out.println("result_matrix: " + Arrays.deepToString(result_matrix));
        return result_matrix;
    }
    float[][] add_matrix_digit() {
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] + value;
        return result_matrix;
    }

    float[][] add_matrices() {
        if (matrix1.length != matrix2.length & matrix1[0].length != matrix2[0].length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
        return result_matrix;
    }

    float[][] minus_matrices() {
        if (matrix1.length != matrix2.length & matrix1[0].length != matrix2[0].length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] - matrix2[i][j];
        return result_matrix;
    }
}
