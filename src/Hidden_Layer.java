public class Hidden_Layer extends Layer {
    public Hidden_Layer(float[][] inputs, int neurons, int batch_size) {
        super(inputs, neurons, batch_size);
    }

    public void feedforward() {
        for (int i = 0; i < neurons; i++) {
            Neuron neuron = new Neuron(inputs);
            neuron.feedforward();
            layer[i] = neuron;
        }
    }

    public Neuron[] getLayer() {
        return layer;
    }
}
