package FileInputOutput;

import java.io.File;
import java.io.IOException;

//To display only file names>

public class File2 {
    public static void main(String[] args) throws IOException {

        File f = new File("Auto");
        f.mkdir();
        System.out.println(f.exists());
        File f1 = new File("Auto","Tigor.txt");
        f1.createNewFile();
        File f2 = new File("Auto","Nexon.txt");
        f2.createNewFile();

        File fi = new File("C:\\Users\\chauh\\Durga\\Auto");
        String[] s = fi.list();
        int count =0;
        for (String element : s){//for loop for printing files only
            File f3 = new File(fi,element);
            if (f3.isFile()){
                count++;
                System.out.println(element);
            }
        }
        System.out.println(count);

    }
}
