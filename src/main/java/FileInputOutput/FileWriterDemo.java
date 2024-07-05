package FileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt",true);
        fw.write(100);//adding single character i.e. d bcz 100 is unicode of d
        fw.write("urga\nJava Class");
        fw.write("\n");
        char[] ch1 = {'a','b','c'};
        fw.write(ch1);
        fw.flush();
        fw.close();

    }
}
