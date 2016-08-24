package us.waw.itachi.dao;

import org.springframework.transaction.annotation.Transactional;
import us.waw.itachi.entity.User;

import java.util.List;

/**
 * Created by lenn on 16/8/23.
 */
@Transactional
public interface UserDao {
    User getUserById(int id);

    List<User> getUsers();

    int saveUser(User user);

    int deleteUserByUsername(String username);
}
