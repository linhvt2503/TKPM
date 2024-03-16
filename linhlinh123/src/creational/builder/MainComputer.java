package creational.builder;
import java.util.Arrays;
public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("Intel 149000k")
                .addRAM("128G DELL")
                .addStorage("SĐ 8TB")
                .addscreen("42inch 360HZ")
                .build();
        System.out.println(computer.toString());
    }
}
