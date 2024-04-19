package A5_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuade;
    int sotrang;
    String tacgia;
    List<String> chuongs;
    public Book(Builder builder) {
        this.tuade = builder.tuade;
        this.sotrang = builder.sotrang;
        this.tacgia = builder.tacgia;
        this.chuongs = builder.chuongs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề").append("\t").append(tuade).append("\n")
                .append("Tác giả").append("\t").append(tacgia).append("\n")
                .append("Số trang").append("\t").append(sotrang).append("\n")
                .append("Các chương").append("\t").append("\n");
        int i = 1;
        for (String c: chuongs)
            builder.append(i++).append(", ").append(c).append("\n");
        return builder.toString();
    }

    public static class Builder{
        String tuade;
        int sotrang;
        String tacgia;
        List<String> chuongs = new ArrayList<>();

        public Builder() {
            this.chuongs = new ArrayList<>();
        }
        public Book build(){
            return new Book(this);
        }

        public Builder setTuade(String tuade) {
            this.tuade = tuade;
            return this;
        }

        public Builder setSotrang(int sotrang) {
            this.sotrang = sotrang;
            return this;
        }

        public Builder setTacgia(String tacgia) {
            this.tacgia = tacgia;
            return this;
        }

        public Builder setChuongs(List<String> chuongs) {
            this.chuongs = chuongs;
            return this;
        }
    }
}
