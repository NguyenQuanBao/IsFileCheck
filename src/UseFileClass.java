import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UseFileClass {
    public static void main(String[] args) {

//        try {
//            File file = new File("File.txt");
//            file.createNewFile();
//                System.out.println("File tồn tại");
//                System.out.println(file.getPath());
//                System.out.println(file.isFile());
//            if  (!file.exists())
//                throw new FileNotFoundException("File không tồn tại");
//        } catch (IOException e) {
//            e.getMessage();
//        }
        File file = new File("File.txt");
        if (file.exists()){
            System.out.println("File tồn tại");
            System.out.println(file.isDirectory());
            System.out.println(file.getPath());
        }else{
            System.out.println("File không tồn tại" );
        }

    }
}
