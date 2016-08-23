package us.waw.itachi;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import us.waw.itachi.dao.UserDao;
import us.waw.itachi.entity.User;

import java.util.List;

/**
 * Created by lenn on 16/8/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserById(){
        User user = userDao.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void getUsers(){
        List<User> users = userDao.getUsers();
        for (User user : users){
           System.out.println(user);
        }
    }
}
