package First;

public class Complex {
    private int re, im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return "First.Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
