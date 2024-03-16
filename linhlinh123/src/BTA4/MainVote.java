package BTA4;

public class MainVote {
    public static void main(String[] args) {
        User linh = new User( "Linh");
        User hoa = new User( "Hoa");
        User mai = new User( "Mai");
        User dao = new User( "Dao");
        linh.vote(Candidate.TRUMP);
        hoa.vote(Candidate.BIDEN);
        mai.vote(Candidate.TRUMP);
        dao.vote(Candidate.TRUMP);
        Election.getInstance().inKetqua();
    }
}
