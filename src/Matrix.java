import java.util.Arrays;

public class Matrix {
    public float[][] matrix1, matrix2, result_matrix;
    public float[] array1, array2, result_array;
    float value;
    public Matrix(float[][] matrix1, float[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result_matrix = new float[matrix1.length][matrix2[0].length];
    }

    public Matrix(float[][] matrix1, float[] array1) {
        this.matrix1 = matrix1;
        this.array1 = array1;
        this.result_matrix = new float[matrix1.length][matrix1[0].length];
    }

    public Matrix(float[][] matrix1, float value) {
        this.matrix1 = matrix1;
        this.value = value;
        this.result_matrix = new float[matrix1.length][matrix1[0].length];
    }

    public Matrix(float[][] matrix1) {
        this.matrix1 = matrix1;
    }
    public Matrix(float[] array1) {
        this.array1 = array1;
    }

    public Matrix(float[] array1, float[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public float[][] multiply_matrices() {
        if (matrix1[0].length != matrix2.length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < result_matrix.length; i++)
            for (int j = 0; j < result_matrix[i].length; j++)
                for (int k = 0; k < matrix2.length; k++)
                    result_matrix[i][j] += matrix1[i][k] * matrix2[k][j];
        return result_matrix;
    }

    public float[][] multiply_matrix_array() {
        if (matrix1.length != array1.length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] * array1[i];
        System.out.println("result_matrix: " + Arrays.deepToString(result_matrix));
        return result_matrix;
    }
    public float[][] add_matrix_digit() {
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] + value;
        return result_matrix;
    }

    public float[][] add_matrices() {
        if (matrix1.length != matrix2.length & matrix1[0].length != matrix2[0].length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
        return result_matrix;
    }

    public float[][] minus_matrices() {
        if (matrix1.length != matrix2.length & matrix1[0].length != matrix2[0].length)
            throw new ArrayIndexOutOfBoundsException();

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix1[i].length; j++)
                result_matrix[i][j] = matrix1[i][j] - matrix2[i][j];
        return result_matrix;
    }

    public float find_max_in_array() {
        float max_value = -1000000;
        for (float value : array1)
            if (value > max_value)
                max_value = value;
        return max_value;
    }

    public float[][] transpose() {
        result_matrix = new float[matrix1[0].length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result_matrix[j][i] = matrix1[i][j];
            }
        }
        return result_matrix;
    }

    public float[] subtract_array_array() {
        result_array = new float[array1.length];
        for (int i = 0; i < array1.length; i++)
            result_array[i] = array1[i] - array2[i];
        return result_array;
    }
}
