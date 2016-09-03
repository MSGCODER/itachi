package us.waw.itachi.entity;

import java.util.List;

/**
 * Created by lenn on 16/8/22.
 * 订单
 */
public class Order {
    private Integer id;

    private String orderNo;

    private User user;

    private Product product;

    public Order() {
    }

    public Order(String orderNo, User user, Product product) {
        this.orderNo = orderNo;
        this.user = user;
        this.product = product;
    }

    public Order(Integer id, String orderNo, User user, Product product) {
        this.id = id;
        this.orderNo = orderNo;
        this.user = user;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
