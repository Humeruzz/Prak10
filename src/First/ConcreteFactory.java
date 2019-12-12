package First;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex CreateComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int re, int im) {
        return new Complex(re, im);
    }
}
