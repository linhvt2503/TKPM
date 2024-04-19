package A3_FactoryMethodSingleton;

import java.awt.*;

public class ShapeFactory {
    public static Shape creatShape(ShapeType shapeType){
        switch (shapeType){
            case Circle -> {
                return Circle.getInstance();
            }
            case Triangle -> {
                return Triangle.getInstance();
            }
            case Rectangle -> {
                return Rectangle.getInstance();
            }
            default -> {
                throw new IllegalComponentStateException("Không có hình nào");
            }
        }

    }
}
