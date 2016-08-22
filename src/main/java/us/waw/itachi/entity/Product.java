package us.waw.itachi.entity;

import java.util.Date;

/**
 * Created by lenn on 16/8/22.
 * 商品
 */
public class Product {
    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Category category;

    private Boolean isOffShelf;

    private Date createDateTime;

    public Product() {
    }

    public Product(Integer id, String name, String description, Double price,
                   Category category, Boolean isOffShelf, Date createDateTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isOffShelf = isOffShelf;
        this.createDateTime = createDateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getIsOffShelf() {
        return isOffShelf;
    }

    public void setIsOffShelf(Boolean isOffShelf) {
        this.isOffShelf = isOffShelf;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }
}
