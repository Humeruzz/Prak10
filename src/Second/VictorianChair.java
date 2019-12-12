package Second;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair() {
        this.age = 0;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        if (this.age > 0) {
            return "VictorianChair and " +
                    "age: " + age;
        }else{
            return "VictorianChair";
        }
    }
}
