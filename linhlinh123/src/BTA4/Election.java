package BTA4;

public class Election {
    //khai báo biến instance
    private static Election instance;
    int trump = 0, joe_biden= 0;
    //phương thức khởi tạo
    private Election(){}
    //phương tức getInsstance ( để trả về biến instance)

    public static Election getInstance() {
        if(instance == null)
            instance = new Election();
        return instance;
    }
    public void vote(Candidate c){
        if(c == Candidate.BIDEN)
            joe_biden++;
        else if (c == Candidate.TRUMP)
            trump++;
    }
    public void inKetqua(){
        System.out.println("Trump"+ trump+"\n");
        System.out.println("Biden"+ joe_biden+"\n");
    }
}
