package creationalPattern.builder.order_thucAn;

import creationalPattern.builder.order_thucAn.type.BreadType;
import creationalPattern.builder.order_thucAn.type.OrderType;
import creationalPattern.builder.order_thucAn.type.SauceType;
import creationalPattern.builder.order_thucAn.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
