package A3_FactoryMethodSingleton;

public class Triangle extends Shape{
    private static Triangle instance;

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Triangle getInstance(){
        if(instance == null)
            instance = new Triangle("bút dạ", "A4", "nhựa");
        return instance;
    }

    @Override
    String Draw() {
        return "Vẽ hình tam giác bằng"+brush+"trên khổ "+paper+"trên "+frame;
    }
}
