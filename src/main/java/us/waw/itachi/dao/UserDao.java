package us.waw.itachi.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Transactional;
import us.waw.itachi.entity.User;

import java.util.List;

/**
 * Created by lenn on 16/8/23.
 */
@Transactional
public interface UserDao {
    @Select("SELECT * FROM user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Select("SELECT * FROM user")
    List<User> getUsers();

    // @SelectKey(resultType = Integer.class, before = false, keyProperty = "id", statement = "SELECT LAST_INSERT_ID() as id")
    // 此处返回的是影响的行数,非id
    @Insert("INSERT INTO user(username, nickname, sex) VALUES(#{username}, #{nickname}, #{sex})")
    int saveUser(User user);

    @Delete("DELETE FROM user WHERE username=#{username}")
    int deleteUserByUsername(String username);
}
