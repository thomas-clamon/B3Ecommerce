package com.example.b3ecommerce.dto.outpout;

import java.time.LocalDateTime;

public class  OPClientProfileDto {

    private String display_name;
    private Integer age;
    private Integer nbOrders;
    private LocalDateTime lastOrderDate;
    private Float ca;

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNbOrders() {
        return nbOrders;
    }

    public void setNbOrders(Integer nbOrders) {
        this.nbOrders = nbOrders;
    }

    public LocalDateTime getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(LocalDateTime lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public Float getCa() {
        return ca;
    }

    public void setCa(Float ca) {
        this.ca = ca;
    }
}
