package Second;

public class ChairFactory implements AbChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
