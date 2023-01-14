import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Normalization {

    public float[][] inputs, normalized_inputs, denormalized_inputs;
    List<double[]> minMax = new ArrayList<>();

    public Normalization(float[][] inputs) {
        this.inputs = inputs;
        this.normalized_inputs = new float[inputs.length][inputs[0].length];
        this.denormalized_inputs = new float[inputs.length][inputs[0].length];
    }

    public float[][] normalize() {
        float[][] tmp = new Matrix(inputs).transpose();
        System.out.println("first: " + Arrays.deepToString(tmp));
        for (int i = 0; i < tmp.length; i++) {
            double[] minMaxArray = new double[2];
            float max_value = new Matrix(tmp[i]).find_max_in_array();
            float min_value = new Matrix(tmp[i]).find_min_in_array();
            minMaxArray[0] =  max_value; minMaxArray[1] = min_value;
            minMax.add(minMaxArray);
            for (int j = 0; j < tmp[i].length; j++)
                tmp[i][j] = (tmp[i][j] - min_value)/ (max_value - min_value);
        }
        System.out.println("second: " + Arrays.deepToString(tmp));
        return new Matrix(tmp).transpose();
    }

    public float[][] denormalize() {
        // TODO
        float[][] tmp = new Matrix(inputs).transpose();
        for (int i = 0; i < tmp.length; i++) {
            float max_value = (float) minMax.get(i)[0];
            float min_value = (float) minMax.get(i)[1];
            for (int j = 0; j < tmp[i].length; j++)
                tmp[i][j] = tmp[i][j] * (max_value-min_value) + min_value;
        }
        System.out.println("second: " + Arrays.deepToString(tmp));
        return new Matrix(tmp).transpose();
    }

}
