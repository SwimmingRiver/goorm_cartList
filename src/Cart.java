import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items;
    public Cart(){
        items = new HashMap<>();
    }
    public void addProduct(Product product,int quantity){
        if(items.containsKey(product)){
            int nowQuantity = items.get(product);
            items.put(product,nowQuantity+quantity);
        }else{
            items.put(product,quantity);
        }
    }

    public void removeProduct(Product product,int quantity){
        if(items.containsKey(product)){
            int nowQuantity = items.get(product);
            if(quantity >= nowQuantity){
                items.remove(product);
            }else{
                items.put(product,nowQuantity-quantity);
            }
        }
    }
    public void showItems() {
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.getName() + " - " + quantity);
        }
    }
}

