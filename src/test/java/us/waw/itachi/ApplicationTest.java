package us.waw.itachi;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by lenn on 16/8/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml"})
public class ApplicationTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void test(){
        try(SqlSession session = sqlSessionFactory.openSession()) {
            List<Map<String, Object>> result = session.selectList("us.waw.itachi.selectUser");
            result.forEach(row -> {
                System.out.println("---------------");
                row.forEach((columnName, value) -> {
                    System.out.printf("columnName=%s, value=%s%n", columnName, value);
                });
            });
        }
    }
}
