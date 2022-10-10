package ss12_java_collection_frame_work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void editProduct(int index, Product newProduct) {
        this.products.set(index, newProduct);
    }

    public int checkID(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (id.equals(products.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public void removeProduct(int index) {
        for (int i = 0; i < products.size(); i++) {
            if (i == index) {
                products.remove(i);
            }
        }
    }

    public void searchProduct(String name) {
        for (Product product : products) {
            if (product.getProduct().contains(name)) {
                System.out.println(product);
            }
        }
    }

    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void sort() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPrice() > product2.getPrice()) {
                    return 1;
                }
                return -1;
            }
        });
    }
}
