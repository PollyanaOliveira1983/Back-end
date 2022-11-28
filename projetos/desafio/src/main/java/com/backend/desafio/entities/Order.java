package com.backend.desafio.entities;

public class Order {

    private Number code;
    private Double basic;
    private Double discount;

    public Order() {

    }

    public Order(Number code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Number getCode() {
        return code;
    }

    public void setCode(Number code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double withDiscount (Order order){
        return getBasic() * getDiscount() / 100;
    }

}
