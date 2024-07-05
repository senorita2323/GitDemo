package ExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class T {

    public static void main(String[] args) {

        try {
//            System.out.println(10/0);
            String s1 = null;
            System.out.println(s1.length());

        } catch (ArithmeticException|NullPointerException e) {
            System.out.println(e);

        }
    }
}
