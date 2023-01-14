public class Train {
    public float[][] inputs;
    public float[] answers, output_error;

    public Train(float[][] inputs, float[] answers) {
        this.inputs = inputs;
        this.answers = answers;
    }

    public float[] FindErrors() {
//        TODO
        output_error = new Matrix(new Matrix(inputs).transpose()[0], answers).subtract_array_array();
        return output_error;

//        прогнозируем все данные
    }
}
