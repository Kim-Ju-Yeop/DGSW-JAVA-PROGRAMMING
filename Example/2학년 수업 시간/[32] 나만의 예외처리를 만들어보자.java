package class05_19;

public class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

class AdvancedExceptionStudy {
    public static void main(String[] args) {
        try{
            Exception e = new MyException("내가 만든 예외처리");
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
