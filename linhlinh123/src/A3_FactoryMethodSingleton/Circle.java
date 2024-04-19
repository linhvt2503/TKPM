package A3_FactoryMethodSingleton;

public class Circle extends Shape{
    private static Circle instance;

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Circle getInstance(){
        if (instance == null)
            instance = new Circle("bút chì ", "A3", " gỗ");
        return instance;
    }

    @Override
    String Draw() {
        return "vẽ hình tròn "+brush+"trên khổ "+paper+"trên khung "+frame;
    }
}
