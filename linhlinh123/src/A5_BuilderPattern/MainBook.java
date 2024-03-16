package A5_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        List<String> chapter = new ArrayList<>();
        chapter.add("Chapter 1: Con Cò");
        chapter.add("Chapter 2: Con heo");
        chapter.add("Chapter 3: Con mèo");

        Book book = new Book.Builder()
                .setTuade("Con mèo xinh xinh")
                .setSotrang(20)
                .setTacgia("mmmm")
                .setChuongs(chapter)
                .build();
        System.out.println(book);
    }
}
