package ss12_java_collection_frame_work;

import java.util.Objects;


public class Product {
    public String id;
    public double price;
    public String product;

    public Product() {
    }

    public Product(String id, double price, String product) {
        this.id = id;
        this.price = price;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(product1.price, price) == 0 && id.equals(product1.id) && product.equals(product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, product);
    }
}
