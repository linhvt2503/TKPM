package creational;

public class Mysingleton {
    private static Mysingleton instance;
    private Mysingleton(){
    }
    public static Mysingleton getInstance()
    {
        if( instance == null )
            instance = new Mysingleton();
        return instance;
    }
    int count = 0;
    public void inCount(){
        System.out.println(++count);
    }
    public Mysingleton(int count){
        this.count = count;
    }
}
