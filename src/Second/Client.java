package Second;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("You sit on " + chair);
    }

    public void setChair(Chair chair){
        this.chair = chair;
    }
}
