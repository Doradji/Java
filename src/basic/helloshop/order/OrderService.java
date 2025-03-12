package basic.helloshop.order;

import basic.helloshop.product.Product;
import basic.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
