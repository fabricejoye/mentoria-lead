package com.lead.pizzaria.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String tel;
    private String street;
    private int streetNumber;
    private String city;
    private String zipcode;
    private String district;
    // description: beside the supermarket
    @Column(length = 2000)
    private String hint;
    @OneToMany
    @JoinColumn(name = "order_ID")
    private List<Order> order;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Client(String firstname, String lastname, String email, String tel, String street, int streetNumber, String city, String zipcode, String district, String hint) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.tel = tel;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipcode = zipcode;
        this.district = district;
        this.hint = hint;
    }

    public Client() {
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
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

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
