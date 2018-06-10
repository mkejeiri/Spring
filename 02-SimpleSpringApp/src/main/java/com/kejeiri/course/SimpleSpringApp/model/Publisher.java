package com.kejeiri.course.SimpleSpringApp.model;

import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String Address;

    public Publisher(String name, String address) {
        this.name = name;
        Address = address;
    }

    public Publisher() {
    }

    public Long getId() {

        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


}
