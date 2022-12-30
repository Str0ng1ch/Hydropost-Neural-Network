public class Normalization {
    public float[][] inputs, normalized_inputs;

    public Normalization(float[][] inputs) {
        this.inputs = inputs;
        this.normalized_inputs = new float[inputs.length][inputs[0].length];
    }

    public float[][] normalize() {
        float max_value = new Matrix(inputs).find_max();
        for (int i = 0; i < inputs.length; i++)
            for (int j = 0; j < inputs[i].length; j++)
                normalized_inputs[i][j] = inputs[i][j] / max_value;
        return normalized_inputs;
    }
}
