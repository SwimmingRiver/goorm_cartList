import  java.io.*;
import java.util.*;
public class CSVReader {
    public static void main(String[] args) {

        Set<Product> productSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("ex01.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length == 3) {
                    String key = values[0];
                    String name = values[1];
                    int price = Integer.parseInt(values[2]);

                    Product product = new Product(key, name, price);
                    productSet.add(product);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("상품 목록:");
        for (Product product : productSet) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }

}
