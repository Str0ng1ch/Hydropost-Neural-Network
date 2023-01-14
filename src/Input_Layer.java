public class Input_Layer extends Layer {
    public Input_Layer(float[][] inputs, int neurons, int batch_size) {
        super(inputs, neurons, batch_size);
    }

    public void feedforward() {
        float[][] normalizedInput = new Normalization(inputs).normalize();
        for (int i = 0; i < neurons; i++) {
            Neuron neuron = new Neuron(normalizedInput);
            neuron.feedforward();
            layer[i] = neuron;
        }
    }

    public Neuron[] getLayer() {
        return layer;
    }
}
