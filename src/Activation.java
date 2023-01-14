import java.util.Arrays;

public class Activation {
    public float value;
    public float[][] matrix, result_matrix;

    public Activation(float value) {
        this.value = value;
    }
    public Activation(float[][] matrix) {
        this.matrix = matrix;
        result_matrix = new float[matrix.length][matrix[0].length];
    }

    float sigmoid_value() {
        return (float) (1 + (1 / Math.exp(-value)));
    }
    float[][] sigmoid_matrices() {
        for (int i = 0; i < result_matrix.length; i++)
            for (int j = 0; j < result_matrix[i].length; j++)
                result_matrix[i][j] = (float) (1 / (1 + Math.exp(-matrix[i][j])));
        System.out.println("Activation: " + Arrays.deepToString(result_matrix));
        return result_matrix;
    }
//    f(x) = cx - linear
//    f(x) = ln(x) - linear
//    c - вручную
}
