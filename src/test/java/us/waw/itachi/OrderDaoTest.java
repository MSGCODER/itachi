package us.waw.itachi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import us.waw.itachi.dao.OrderDao;
import us.waw.itachi.entity.Order;

/**
 * Created by lenn on 16/8/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml"})
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    @Test
    public void getOrderById(){
        Order order = orderDao.getOrderById(1);

        System.out.println(order);
    }

}
