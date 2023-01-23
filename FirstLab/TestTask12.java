package FirstLab;
import java.io.FileNotFoundException;

import java.io.File;
import java.util.*;
public class TestTask12 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "/home/ilya/IdeaProjects/Labs/src/FirstLab/file.txt";

        File file = new File(path);

        int sum = 0;

        var scan = new Scanner(file);

       while (scan.hasNext()){
           sum += scan.nextInt();
       }

        System.out.println("sum = " + sum);
       scan.close();
}
}
