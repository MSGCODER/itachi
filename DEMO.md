### 创建一个测试的表,并插入两条数据
  mysql> create table user(  
          	id int(11) not null auto_increment,  
          	name varchar(20) not null,  
          	age int(11) not null,  
          	primary key(id)  
       );  
  msyql> insert into user(name, age) values('tom', 10);  
  msyql> insert into user(name, age) values('jim', 11);  

## 编写mybatis配置文件mybatis-config.xml以及映射文件XXX.xml(笔者的叫UserMapper.xml)
  mybatis-config.xml: 笔者写的有点多,请无视.简单的demo只需要配置数据库链接就行:即environments  
  UserMapper.xml: 里面实现了一个最简单的例子

## 编写java代码
  参见src/demo/MybatisFirst.java
  
  运行输出:  
  ---------------  
  columnName=name, value=tom  
  columnName=id, value=1  
  columnName=age, value=10  
  ---------------  
  columnName=name, value=jim  
  columnName=id, value=2  
  columnName=age, value=11  