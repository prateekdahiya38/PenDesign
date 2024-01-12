public class Client {
    public static void main(String[] args) {
        Pen p = PenBuilder.build("SmoothMega",5,PenType.USEANDTHROW,BodyType.CLICK);
        p.display();
        p.open();
        p.write();
        p.close();
    }
}
