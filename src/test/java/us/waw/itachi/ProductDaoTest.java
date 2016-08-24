package us.waw.itachi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import us.waw.itachi.dao.ProductDao;
import us.waw.itachi.entity.Category;
import us.waw.itachi.entity.Product;

import java.util.Date;

/**
 * Created by lenn on 16/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml"})
public class ProductDaoTest {
    @Autowired
    private ProductDao productDao;

    @Test
    public void saveProduct(){
//        public Product(String name, String description, Double price,
//                Category category, Boolean isOffShelf, Date createDateTime) {
        Product product = new Product("女士白色裙子", "灰常好看", 1999.0, new Category(1, "衣服"), false, new Date());

        productDao.saveProduct(product);
        System.out.println(product);
    }
}
