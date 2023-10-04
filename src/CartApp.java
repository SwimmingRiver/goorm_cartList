import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        //상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        Product product1 = new Product("1","item1",100);
        Product product2 = new Product("2","item2",200);

        productSet.add(product1);
        productSet.add(product2);

        System.out.println("고유란 상품 목록:");
        for(Product product:productSet){
            System.out.println(product.getName()+":"+product.getPrice());
        }
        Cart myCart = new Cart();

        myCart.addProduct(product1, 2);
        myCart.addProduct(product2, 3);

        System.out.println("장바구니 내역:");
        myCart.showItems();

        myCart.removeProduct(product1, 1);

        System.out.println("장바구니 내역 (상품 1 개수 감소):");
        myCart.showItems();

    }
}
