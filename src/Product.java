import java.util.Objects;

public class Product {
    private String key;
    private String name;
    private int price;
    public Product(String key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }
    public boolean equals(Object object){
        if(this == object) return  true;
        if(object == null || getClass() != object.getClass())return false;
        Product product = (Product) object;
        return Objects.equals(key,product.key);
    }
    public int hashCode() {
        return Objects.hash(key);
    }
    public String getProduct() {
        return "Product{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
