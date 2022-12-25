import java.util.Arrays;

public class Neuron {
    public float bias;
    public float[][] inputs, result;
    public float[] weights;

    public Neuron(float[][] inputs) {
        bias = (float) (Math.random() * 2 - 1);
        this.inputs = inputs;
        weights = new float[inputs.length];
        weights = make_weights();
    }

    public void feedforward() {
        Matrix multiply = new Matrix(inputs, weights);
        Matrix add = new Matrix(multiply.multiply_matrix_array(), bias);
        Activation activation = new Activation(add.add_matrix_digit());
        result = activation.sigmoid_matrices();
    }

    float[] make_weights() {
        for (int i = 0; i < inputs.length; i++)
            weights[i] = (float) (Math.random() * 2 - 1);
        System.out.println("weights: " + Arrays.toString(weights));
        System.out.println("bias: " + bias);
        return weights;
    }

    public float[][] getResult() {
        return result;
    }
}
