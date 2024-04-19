package A3_FactoryMethodSingleton;

public class main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.creatShape(ShapeType.Circle);
        System.out.println(shape.Draw());
    }
}
