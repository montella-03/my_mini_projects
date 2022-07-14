import java.io.File;
import java.util.Scanner;

public class Directory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a directory ");
        String directory = scanner.nextLine();

        System.out.println(getSize(new File(directory)));
        
    }

    private static long getSize(File file) {
        long size = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]);
            }
        } else {
            size += file.length();
        }
        return size;
    }
    
    
}
