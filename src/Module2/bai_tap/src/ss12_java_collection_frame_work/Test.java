package ss12_java_collection_frame_work;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productList = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("------ Menu: ------");
            System.out.println(
                            "1. Thêm sản phẩm \n" +
                            "2. Sửa thông tin sản phẩm theo id\n" +
                            "3. Xoá sản phẩm theo id \n" +
                            "4. Hiển thị danh sách sản phẩm\n" +
                            "5. Tìm kiếm sản phẩm theo tên\n" +
                            "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                            "0. Thoát"
            );
            System.out.print("Vui lòng chọn chực năng: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nhập mã sẩn phẩm: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên sản phẩm : ");
                    String product = sc.nextLine();

                    System.out.print("Nhập giá sản phẩm: ");
                    double price = sc.nextDouble();

                    Product products = new Product(id, price, product);
                    productList.addProduct(products);
                    break;
                case 2:
                    System.out.print("Nhập mã ID cần sửa: ");
                    String newId = sc.nextLine();
                    if (productList.checkID(newId) != -1) {
                        System.out.print("Nhập tên sản phẩm mới: ");
                        String newNameProduct = sc.nextLine();

                        System.out.print("Nhập giá sản phẩm mới: ");
                        double newPrice = sc.nextDouble();

                        Product newProduct = new Product(newId, newPrice, newNameProduct);
                        productList.editProduct(productList.checkID(newId), newProduct);
                    } else {
                        System.out.print("Không tồn tại ID trên");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã ID cần xóa: ");
                    String removeId = sc.nextLine();
                    int index = productList.checkID(removeId);
                    if (index != -1) {
                        productList.removeProduct(index);
                    } else {
                        System.out.print("Mã ID không tồn tại");
                    }
                case 4:
                    productList.display();
                    break;
                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm : ");
                    String name = sc.nextLine();

                    productList.searchProduct(name);
                    break;
                case 6:
                    productList.sort();
                    productList.display();
                    break;
            }
        } while (option != 0);
    }
}
