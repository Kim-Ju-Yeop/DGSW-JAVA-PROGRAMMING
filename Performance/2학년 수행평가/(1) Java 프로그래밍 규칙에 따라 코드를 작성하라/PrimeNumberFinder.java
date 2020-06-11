package class06_11;

import java.util.ArrayList;
import java.util.List;

// Java 프로그래밍 규칙을 따르지 않은 기존 코드
public class prime_Number_Finder
{
    public static final int sizeofrange = 120;

    public boolean PrimeNumber(int a) {
        for (int i=2;i<a;i++) {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public List<Integer> findprimenumber(int max_number){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=max_number;i ++) {
            if(PrimeNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }
    public int plus(int num1, int num2)
    {
        if(num1>sizeofrange||num2>sizeofrange||num1+num2>sizeofrange||num2<0||num1<0) {
            return -1;
        } else
            return num1+num2;
    }
    public void print()
    {
        int value1, value2=3;
        int value3 = (value1=value2*5);
        String Text = value3>5?"OK":"Ooops";

        System.out.println(Text);
    }
}

// Java 프로그래밍 규칙을 따라 작성한 새로운 코드
public class PrimeNumberFinder {

    public static final int SIZEOF_RANGE = 120;

    public boolean primeNumber(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findPrimeNumber(int maxNumber){
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= maxNumber; i++){
            if(primeNumber(i)){
                list.add(i);
            }
        }
        return list;
    }

    public int plus(int num1, int num2){
        if((num1 > SIZEOF_RANGE)
                || (num2 > SIZEOF_RANGE)
                || ((num1 + num2) > SIZEOF_RANGE)
                || (num2 < 0)
                || (num1 < 0)){

            return -1;
        } else{
            return num1 + num2;
        }
    }

    public void print(){
        int value1 = 3;
        int value2 = 3;
        int value3 = value1 = (value2 * 5);

        String text = value3 > 5 ? "OK" : "Ooops";
        System.out.println(text);
    }
}
