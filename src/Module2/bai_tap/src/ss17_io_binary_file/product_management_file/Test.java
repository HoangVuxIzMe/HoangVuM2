package ss17_io_binary_file.product_management_file;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("TV22","Tivi","Sony",200,"Black Color"));
        productList.add(new Product("DL16","Display","ASUS",50,"FHD/16 Inch"));
        productList.add(new Product("WM22","Wash Machine","Panasonic",100,"Vertical"));
        productList.add(new Product("LS22","Loudspeaker","JBL",50,"Water Resistance"));

        FileUtils.writeFileOptimize(productList,"ProductList.txt");
        FileUtils.readFile("ProductList.txt");
        productList.forEach(System.out::println);
    }
}
