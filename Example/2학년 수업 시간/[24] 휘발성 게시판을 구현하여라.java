package class05_12.ex3;

import java.util.ArrayList;
import java.util.List;

interface Bulletin {

    void write(Writing writing);

    Writing read(int index);

    List<Writing> list();
}

class Writing {

    private String title;
    private String content;
    private String writer;
    private int index;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}


class SimplestBulletin implements Bulletin {

    private List<Writing> list = new ArrayList<>();
    private int pool = 0;

    @Override
    public void write(Writing writing) {
        pool++;
        writing.setIndex(pool);

        list.add(writing);
    }

    @Override
    public Writing read(int index) {
        for(Writing writing : list){
            if(writing.getIndex() == index)return writing;
            else return null;
        } return null;
    }

    @Override
    public List<Writing> list() {
        return list;
    }
}

public class Executor {
    public static void main(String[] args) {
        Bulletin bulletin = new SimplestBulletin();

        Writing writing = null;

        writing = new Writing();
        writing.setTitle("개학은 언제죠?");
        writing.setContent("5월 27일일이에요.");
        writing.setWriter("이찬민");
        bulletin.write(writing);

        writing = new Writing();
        writing.setTitle("대소고 만세");
        writing.setContent("빨리 학교 가고 싶어.");
        writing.setWriter("이영은");
        bulletin.write(writing);

        writing = new Writing();
        writing.setTitle("코로나 싫어");
        writing.setContent("백신이 필요해.");
        writing.setWriter("여동민");
        bulletin.write(writing);

        Writing second = bulletin.read(1);
        System.out.println(second.getTitle() + " " + second.getContent());

        List<Writing> list = bulletin.list();
        for(Writing item : list){
            System.out.println(item.getTitle() + " - " + item.getWriter());
        }
    }
}
