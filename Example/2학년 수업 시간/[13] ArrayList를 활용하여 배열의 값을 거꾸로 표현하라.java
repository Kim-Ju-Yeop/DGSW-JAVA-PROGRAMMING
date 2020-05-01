package class04_29;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList extends ArrayList<String> {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add("김주엽");
        list.add("오하형");
        list.add("김혜선");
        list.add("전도권");

        list.reverse();
        list.print();

        list.reverse2();
        list.print();
    }

    public String getLast(){
        if(super.size() == 0) return null;
        else return super.get(size()-1);
    }

    // 첫 번째 방법
    public void reverse(){
        int end = size()-1;

        for(int i = 0; i < size() / 2; i++){
            String temp = get(i);
            set(i, get(end));
            set(end, temp);
            end--;
        }
    }

    // 두 번째 방법
    public void reverse2(){
        Collections.reverse(this);
    }

    public void print(){
        for(String i : this){
            System.out.println(i);
        }
    }
}
