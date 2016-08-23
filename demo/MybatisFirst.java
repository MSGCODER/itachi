package us.waw.itachi.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by lenn on 16/8/10.
 */
public class MybatisFirst {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

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
