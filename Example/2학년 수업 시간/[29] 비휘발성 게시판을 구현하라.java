package class05_12.ex3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleFileBulletin implements Bulletin {

    private static final String PATH = "/Users/jueyop/Desktop/board";

    private File directory = new File(PATH);
    private File file = new File(directory, "data.txt");

    private int pool = 0;

    public SimpleFileBulletin() {
        try { if (!file.exists()) file.createNewFile(); }
        catch (Exception e){ e.printStackTrace(); }
    }

    @Override
    public void write(Writing writing) {
        writing.setIndex(++pool);

        try {
            PrintWriter out = new PrintWriter(new FileWriter(this.file, true));
            out.write(writing.getIndex() + "-" + writing.getWriter() + "-" + writing.getTitle() + "-" + writing.getContent() + "-");
            out.println();
            out.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public Writing read(int index) {
        for(Writing writing : list()){
            if(writing.getIndex() == index) return writing;
        } return null;
    }

    @Override
    public List<Writing> list() {
        String line;
        List<Writing> result = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(this.file));

            while ((line = in.readLine()) != null) {
                Writing writing = new Writing();

                int count = 0;
                int start = 0;

                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == '-'){
                        switch(count){
                            case 0:{
                                writing.setIndex(Integer.parseInt(line.substring(start, i)));
                                break;
                            }
                            case 1:{
                                writing.setWriter(line.substring(start, i));
                                break;
                            }
                            case 2:{
                                writing.setTitle(line.substring(start, i));
                                break;
                            }
                            case 3: writing.setContent(line.substring(start, i));
                        }
                        start = i+1;
                        count++;
                    }
                }result.add(writing);
            }in.close();
        } catch (Exception e) { e.printStackTrace(); }
        return result;
    }
}
