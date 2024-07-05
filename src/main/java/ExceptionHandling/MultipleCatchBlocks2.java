package ExceptionHandling;

public class MultipleCatchBlocks2 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("AE");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
