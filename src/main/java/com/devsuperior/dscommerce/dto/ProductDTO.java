package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

public class ProductDTO {


    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, Double price, String description, String name, String imgUrl) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
       id = entity.getId();
        price = entity.getPrice();
        description = entity.getDescription();
        name = entity.getName();
        imgUrl = entity.getImgUrl();
    }


    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
