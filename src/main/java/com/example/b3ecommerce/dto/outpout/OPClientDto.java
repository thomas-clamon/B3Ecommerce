package com.example.b3ecommerce.dto.outpout;

public class OPClientDto {

    private String client; // concatenation nom prenom en majuscule;
    private Integer age;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
