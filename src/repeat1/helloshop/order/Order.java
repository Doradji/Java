package repeat1.helloshop.order;

import repeat1.helloshop.product.Product;
import repeat1.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
