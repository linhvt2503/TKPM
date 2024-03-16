package creational.builder;

public class Computer {
    //lớp thành phần cần xây dựng, vệc xây dựng các thành phần này là phức tạp

    String CPU, RAM, storage, screen;
    //Hàm khởi tạo, khởi tạo đối tượng câ xây ựng từ đối tượng builder,
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }
    //lớp Builder có nhiệm vụ xây dựng các thành phần cho đối tượng cần khởi tạo (Computer)
    public static class Builder{
        String CPU, RAM, storage, screen;
        //phương thức xây dựng một thành phần của Computer
        public Builder addCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder addRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder addStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder addscreen(String screen){
            this.screen = screen;
            return this;
        }
        //phương thức bắt buộc phai có của lớp Builder dùng để
        public Computer build(){
            return new Computer(this);
        }
    }
}
