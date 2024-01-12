public class UseAndThrow extends Pen{
    Ink ink;
    Nib nib;
    public UseAndThrow(String name,int price,PenType penType,BodyType bodyType) {
        super(name,price,penType,bodyType);
    }

    @Override
    void open() {
        System.out.println("Use and throw pen is open now");
    }
    @Override
    void write() {
        System.out.println("Use and throw pen is writing");
    }

    @Override
    void close() {
        System.out.println("Use and throw pen is close now");
    }
}
