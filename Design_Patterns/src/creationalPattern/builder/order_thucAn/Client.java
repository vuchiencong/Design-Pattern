package creationalPattern.builder.order_thucAn;

import creationalPattern.builder.order_thucAn.type.BreadType;
import creationalPattern.builder.order_thucAn.type.OrderType;
import creationalPattern.builder.order_thucAn.type.SauceType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
