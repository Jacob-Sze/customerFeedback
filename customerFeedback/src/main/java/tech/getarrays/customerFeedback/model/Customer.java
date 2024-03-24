package tech.getarrays.customerFeedback.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Customer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private @Getter Long id;
    private @Getter @Setter String date;
    private @Getter @Setter String rating;
    private @Getter @Setter String description;
    private @Getter @Setter boolean contact;   
    private @Getter @Setter String phone;
    public Customer(){
        
    }
    public Customer(String date, String rating, String description, boolean contact, String phone){
        this.date = date;
        this.rating = rating;
        this.description = description;
        this.contact = contact;
        this.phone = phone;
    }
}
