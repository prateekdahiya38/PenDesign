import java.sql.Ref;

public class BallPoint extends Pen implements Refillable{
    Refill refill;

    public BallPoint(String name,int price,PenType penType,BodyType bodyType) {
        super(name,price,penType,bodyType);
    }

    @Override
    void open() {
        System.out.println(" pen is open now");
    }
    @Override
    void write() {
        System.out.println("Ball pen is writing");
    }

    @Override
    void close() {
        System.out.println("Ball pen is close now");
    }

    @Override
    public void Refill() {
        System.out.println("This pen is refillable");
    }
}
