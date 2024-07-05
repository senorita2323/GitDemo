package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (NullPointerException e){//exception not handled bcz,taking null pointer exception instead of AE
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
