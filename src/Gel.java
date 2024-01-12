public class Gel extends Pen implements Refillable{
    Refill refill;
    public Gel(String name,int price,PenType penType,BodyType bodyType) {
        super(name,price,penType,bodyType);
    }
    @Override
    void open() {
        System.out.println("Gel pen is open now");
    }
    @Override
    void write() {
        System.out.println("Gel pen is writing");
    }

    @Override
    void close() {
        System.out.println("Gel pen is close now");
    }

    @Override
    public void Refill() {
        System.out.println("This pen is refillable");
    }
}
