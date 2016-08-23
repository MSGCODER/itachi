package us.waw.itachi.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
}
