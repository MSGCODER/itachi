# itachi

该Project使用SSM框架（Spring + Spring MVC + MyBatis），初期目标为搭建Java Web的DEMO，旨在对着三个框架的学习和探究。
如果能帮助到大家，再好不过了。（笔者目前用的是SSH（Spring + Spring MVC + Hibernate））。

## 为什么弃用Hibernate呢?
* 如果hibernate做ORM映射,开发效率很高;基本上不用写SQL,或者说只需要写一些简单的SQL就OK了.但是如果涉及到联表查询,或者说涉及到复杂一些的逻辑,hibernate就显得没有那么灵活了.因此打算使用mybatis试试看.

## 一些说明
* 笔者使用IntelliJ作为IDE开发工具,与eclipse孰优孰略咱就不做讨论了,百度一大堆
* 笔者使用gradle作为包(依赖库等)管理工具
* 笔者不会在markdown里添加图片,抱歉
* 笔者有时可能比较啰嗦,抱歉
* 笔者不喜欢写页面,该Project返回的可能只有JSON
* 表结构参见src/main/java/resource/sql/itachi.sql

## 开发的步骤(由于笔者时间有限,只是大致步骤)
* 使用IntelliJ创建一个gradle工程(点选java web选项).当然,你可以直接使用git下载笔者的Project,然后使用IntelliJ打开即可.
* 在build.gradle文件中添加该Project所依赖的jar包,参见笔者的build.gradle文件;然后使用gradle下载更新依赖的jar包.(以后每次更改build.gradle文件都要使用gradle更新依赖的jar包)


## 搭建数据库环境(mysql)
### 安装mysql,然后启动mysql
### 使用root用户登录(刚安装完mysql,root没有密码)
  $:mysql -uroot
### 创建数据库并使用UTF-8编码
  mysql> CREATE DATABASE itachi DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
### 创建用户
  mysql> CREATE USER 'itachi'@'localhost' IDENTIFIED BY 'youshenbubai';  
  mysql> CREATE USER 'itachi'@'%' IDENTIFIED BY 'youshenbubai';   (如果mysql不在你本机执行该语句)
### 给用户授权(此处将数据库itachi的所有表的全部权限都给了itachi这个用户)
  mysql> GRANT all ON itachi.* TO 'itachi'@'localhost';  
  mysql> GRANT all ON itachi.* TO 'itachi'@'%';

### 创建相应的表

## 编写测试代码

### 添加mybatis-spring的jar包(在build.gradle里面)
### 在applicationContext.xml中整合spring和mybatis
### 编写映射器接口UserDao.java以及测试代码UserDaoTest.java

**使用注解的方式编写sql语句,方便是挺方便,有些事情感觉做不了啊.还是转换成xml映射的方式来做吧**
