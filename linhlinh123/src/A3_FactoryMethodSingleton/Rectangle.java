package A3_FactoryMethodSingleton;

public class Rectangle extends Shape{
    private static Rectangle instance;

    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Rectangle getInstance(){
        if (instance ==null)
            instance = new Rectangle("bút mực","A6","khung giấy");
        return instance;
    }

    @Override
    String Draw() {
        return "vẽ hình chữ nhật baằng "+brush+"trên khổ "+paper+"trên "+frame;
    }
}
