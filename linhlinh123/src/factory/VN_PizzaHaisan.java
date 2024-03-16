package factory;

public class VN_PizzaHaisan extends Pizza{
    @Override
    void prepare() {
        builder.append("\n")
                .append("Chuẩn bị bột gạo và 4 con cá cơm");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng trên lò than 30 phút");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Gói lá chuối");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Cắt thẳng 4 miếng")
                .append("Chúc ngon miệng! Hẹn gặp lại!");
    }
}
