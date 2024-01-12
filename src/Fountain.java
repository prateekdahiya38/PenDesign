public class Fountain extends Pen implements Refillable{
    Ink ink;
    Nib nib;
    public Fountain(String name,int price,PenType penType,BodyType bodyType) {
        super(name,price,penType,bodyType);
    }

    @Override
    void open() {
        System.out.println("Fountain pen is open now");
    }
    @Override
    void write() {
        System.out.println("Fountain pen is writing");
    }

    @Override
    void close() {
        System.out.println("Fountain pen is close now");
    }

    @Override
    public void Refill() {
        System.out.println("This is refillable");
    }
}
