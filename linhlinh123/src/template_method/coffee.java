package template_method;

public class coffee extends caffeinebeverage{
    @Override
    void brew() {
        System.out.println("Cho bột coffee vào phin và thêm nước sôi");
    }

    @Override
    void addCondiments() {
        System.out.println("Cho thêm một ít sữa đặc vaò");
    }
    public void prepareRecipe(){
        super.prepareRecipe();
    }
}
