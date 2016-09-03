package us.waw.itachi.dao;

import us.waw.itachi.entity.Order;

/**
 * Created by lenn on 16/8/25.
 */
public interface OrderDao {
    Order getOrderById(int id);
}
