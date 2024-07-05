package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        char[] ch = new char[(int) f.length()];
        fr.read(ch);
        for (char element :ch){
            System.out.print(element);
        }

        System.out.println("*******************");
        FileReader fr1 = new FileReader(f);
        int i= fr1.read();
        while (i!=-1){
            System.out.print((char)i);
            i = fr1.read();
        }
    }

}
