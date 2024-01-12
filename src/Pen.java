public abstract class Pen {
    private String name;
    private int price;
    private PenType penType;
    private BodyType bodyType;

    public Pen(String name,int price,PenType penType,BodyType bodyType) {
        this.name = name;
        this.price = price;
        this.penType = penType;
        this.bodyType = bodyType;
    }

    abstract void write();
    abstract void open();
    abstract void close();


    public void setValues(String name,int price){
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("This is a " + penType + " pen");
        System.out.println("The is a " + name + " model " + penType + " pen");
        System.out.println("This model cost Rs "+ price);
        System.out.println(name + " " + penType + " pen is of " + bodyType + " style");
    }

}
