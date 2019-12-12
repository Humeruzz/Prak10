import First.ConcreteFactory;
import Second.ChairFactory;
import Second.Client;

public class Main {

    public static void main(String[] args) {
	/*ConcreteFactory temp = new ConcreteFactory();
	System.out.println(temp.CreateComplex(10,15));*/

        ChairFactory temp = new ChairFactory();
        Client client = new Client();
        client.setChair(temp.createMagicChair());
        client.sit();
        client.setChair(temp.createFunctionalChair());
        client.sit();
        client.setChair(temp.createVictorianChair());
        client.sit();
        client.setChair(temp.createVictorianChair(15));
        client.sit();
        System.out.println(temp.createFunctionalChair().sum(10,5));
        temp.createMagicChair().doMagic();
    }
}
