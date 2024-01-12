public class PenBuilder {

    public static Pen build(String name,int price,PenType penType,BodyType bodyType){
        return switch (penType){
            case BALLPOINT -> new BallPoint(name,price,penType,bodyType);
            case GEL -> new Gel(name,price,penType,bodyType);
            case FOUNTAIN -> new Fountain(name,price,penType,bodyType);
            case USEANDTHROW -> new UseAndThrow(name,price,penType,bodyType);
        };
    }
}
