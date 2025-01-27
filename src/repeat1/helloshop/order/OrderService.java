package repeat1.helloshop.order;

import repeat1.helloshop.product.Product;
import repeat1.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
