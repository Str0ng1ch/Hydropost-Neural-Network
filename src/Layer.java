abstract class Layer {
    public float[][] inputs;
    public Neuron[] layer;
    public int neurons, batch_size;

    public Layer(float[][] inputs, int neurons, int batch_size) {
        this.inputs = inputs;
        this.neurons = neurons;
        this.batch_size = batch_size;
        layer = new Neuron[neurons];
    }
}
