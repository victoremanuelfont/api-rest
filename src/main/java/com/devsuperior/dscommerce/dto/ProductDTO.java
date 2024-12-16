package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

public class ProductDTO {


    private Long id;

    @Size(min = 3, max = 80, message = "Nome deve ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Size(min = 10, message = "Descrição deve ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;

    @Positive(message = "O preço deve ser positivo")
    private Double price;
    private String imgUrl;



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
