package class06_11;

import java.util.List;

// Java 프로그래밍 규칙이 적용되지 않은 기존 코드
public class executor {

    public static void main(String[] args) {
        try{
            prime_Number_Finder pnf = new prime_Number_Finder();
            List<Integer> PrimeNumberList = pnf.findprimenumber(100);

            for (Integer item:PrimeNumberList)
                System.out.println(item);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}

// Java 프로그래밍 규칙이 적용된 새로운 코드
public class Executor {

    public static void main(String[] args) {
        try{
            PrimeNumberFinder pnf = new PrimeNumberFinder();
            List<Integer> primeNumberList = pnf.findPrimeNumber(100);

            for(Integer item : primeNumberList){
                System.out.println(item);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
