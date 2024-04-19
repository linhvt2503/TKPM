package A2_Buider;

public class MainA2 {
    public static void main(String[] args) {
        MyStringBuilder b = new MyStringBuilder.Builder()
                .addString("linh")
                .addFloat(20)
                .addBool(true)
                .builder();
        System.out.println(b.toString());
    }
}
