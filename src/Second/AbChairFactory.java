package Second;

public interface AbChairFactory {
    public VictorianChair createVictorianChair();
    public VictorianChair createVictorianChair(int age);
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}
