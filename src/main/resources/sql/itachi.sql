CREATE TABLE user(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username VARCHAR(20) NOT NUll,
  nickname VARCHAR(20),
  sex INT DEFAULT '1'
);

CREATE TABLE category(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL
);

CREATE TABLE product(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NUll,
  description TEXT,
  price DOUBLE,
  category_id INT,
  is_off_shelf BIT,
  create_date_time DATETIME,
  CONSTRAINT fk_pro_cat FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE orders(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  order_no VARCHAR(50) NOT NULL,
  user_id INT NOT NULL,
  product_id INT NOT NULL,
  CONSTRAINT fk_order_uid FOREIGN KEY (user_id) REFERENCES user(id),
  CONSTRAINT fk_order_pid FOREIGN KEY (product_id) REFERENCES product(id)
);