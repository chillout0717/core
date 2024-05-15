package hello.core.Order;

public interface OrderSerivce {

    Order createOrder(Long member, String itemName, int itemPrice);

}
