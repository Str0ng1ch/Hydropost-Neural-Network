import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float[][] inputs = new float[][] {{0.2f, 0.1f, 0.3f, 0.4f}, {0.2f, 0.1f, 0.3f, 0.4f}, {0.2f, 0.1f, 0.3f, 0.4f}};
        int input_neurons = 10, batch_size = 2;

        Input_Layer input_layer = new Input_Layer(inputs, input_neurons, batch_size);
        input_layer.feedforward();
        System.out.println(Arrays.toString(input_layer.getLayer()));
    }
}
