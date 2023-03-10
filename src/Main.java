import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO map
        float[][] inputs = new float[][] {{10f, 0.1f, 2f, 0.4f}, {0.2f, 1f, 0.3f, 0.4f}, {0.2f, 3f, 0.3f, 0.4f}};
        int input_neurons = 2, batch_size = 2;

        float[] answers = {1, 2, 3};
        System.out.println(Arrays.deepToString(new Normalization(inputs).normalize()));

        Input_Layer input_layer = new Input_Layer(inputs, input_neurons, batch_size);
        input_layer.feedforward();
        System.out.println(Arrays.toString(input_layer.getLayer()));
    }
}
