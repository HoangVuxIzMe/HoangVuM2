package ss17_io_binary_file.product_management_file;

import java.io.*;
import java.util.List;

public class FileUtils {
    public static void writeFileOptimize(List<Product> products, String fileName){
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))){
            stream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readFile(String fileName){
        List<Product> products = null;
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))){
            return(List<Product>) stream.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
