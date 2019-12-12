package Second;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Chair makes a trick");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
