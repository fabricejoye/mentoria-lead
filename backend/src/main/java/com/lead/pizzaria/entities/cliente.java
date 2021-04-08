package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class cliente {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String tel;
    private String street;
    private String number;
    private String city;
    private String zipcode;
    private String district;
    // descrição do tipo lado do pão de açucar
    private String hint;

    public void new_order() {}

    public void order_again_last_order(int id_order) {}

    public void cancel_order(int id_order) {}

    // if (state = andamento && (date_today - date_created) <24h)
    public void continue_last_order(int id_order) {}

    public void finalize_order(int id_order) {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
