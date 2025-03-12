package basic.helloshop.order;

import basic.helloshop.product.Product;
import basic.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
