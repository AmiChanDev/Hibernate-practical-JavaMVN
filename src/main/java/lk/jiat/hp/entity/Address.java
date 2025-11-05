package lk.jiat.hp.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable {
    public Address(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String lineOne;
    @Column
    private String lineTwo;

    @ManyToOne
    @JoinColumn
    private City city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
