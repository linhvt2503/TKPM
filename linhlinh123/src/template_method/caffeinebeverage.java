package template_method;

public abstract class caffeinebeverage {
    abstract void brew();
    abstract void addCondiments();
    private void boilWater(){
        System.out.println("Đun sôi nước đến 100 độ");
    }
    private void pourIncup(){
        System.out.println("Rót nước ra cốc");
    }
    public void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addCondiments();
    }
}
