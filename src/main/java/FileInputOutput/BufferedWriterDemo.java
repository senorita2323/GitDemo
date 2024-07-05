package FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);//write d as 100 is unicode of d
        bw.newLine();//it will add new line
        char[] ch1 = {'a','b','c','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("Gaur");
        bw.newLine();
        bw.write("City");
        bw.flush();
        bw.close();
    }
}
