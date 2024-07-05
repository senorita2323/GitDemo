package ExceptionHandling;

public class NestedTryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("outer try block");
            try {
                System.out.println("inner try block");
                System.out.println(10/0);
            }
            catch (NullPointerException e){//when inner catch unable to handle inner try
                System.out.println("Inner catch block");
            }
            System.out.println("After inner try catch");
        }
        catch (Exception e){
            System.out.println("outer catch block");//directly jump to outside catch
        }
        finally {
            System.out.println("outer finally block");
        }
    }
}
