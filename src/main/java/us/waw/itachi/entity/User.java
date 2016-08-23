package us.waw.itachi.entity;

/**
 * Created by lenn on 16/8/22.
 * 用户实体类
 */
public class User {
    private Integer id;

    private String username;

    private String nickname;

    private Integer sex;

    public User() {
    }

    public User(Integer id, String username, String nickname, Integer sex) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
