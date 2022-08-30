package creationalPattern.builder.order_thucAn;

import creationalPattern.builder.order_thucAn.type.BreadType;
import creationalPattern.builder.order_thucAn.type.OrderType;
import creationalPattern.builder.order_thucAn.type.SauceType;
import creationalPattern.builder.order_thucAn.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();

}
