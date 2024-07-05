package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class File1 {

    //Write a program to display the names of all files and directories present in durga123 folder
        public static void main(String[] args) throws IOException {
            File f = new File("abc.txt");//this won't create any physical file
            System.out.println(f.exists());
            f.createNewFile();// it will create the physical file
            System.out.println(f.exists());

            File f1 = new File("durga123");
            f1.mkdir();
            File f2 = new File("durga123","demo.txt");//creating file demo.txt in directory durga123
            f2.createNewFile();
            File f3 = new File(f1,"demo1.txt");////creating file demo1.txt in directory durga123
            f3.createNewFile();

            System.out.println(f1.exists());
            File f4 = new File("C:\\Users\\chauh\\Durga\\durga123");
            String[] s = f4.list();//method returns the names of all files and sub directories present in specified directory
            int count =0;
            for (var element :s){
                count++;
                System.out.println(element);//it will print name of files and sub dir
            }
            System.out.println("total number of count is " + count);//count of files



        }
}
