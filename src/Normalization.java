import java.util.Arrays;

public class Normalization {
    public float[][] inputs, normalized_inputs;

    public Normalization(float[][] inputs) {
        this.inputs = inputs;
        this.normalized_inputs = new float[inputs.length][inputs[0].length];
    }

    public float[][] normalize() {
        float[][] tmp = new Matrix(inputs).transpose();
        System.out.println("first: " + Arrays.deepToString(tmp));
        for (int i = 0; i < tmp.length; i++) {
            float max_value = new Matrix(tmp[i]).find_max_in_array();
            for (int j = 0; j < tmp[i].length; j++)
                tmp[i][j] /= max_value;
        }
        System.out.println("second: " + Arrays.deepToString(tmp));
        return new Matrix(tmp).transpose();
    }

    public float[][] denormalize() {
        // TODO
//        текущее * (максимальное - минимальное) + минимальное
        return inputs;
    }
}
