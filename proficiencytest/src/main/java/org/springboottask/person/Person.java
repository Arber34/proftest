package org.springboottask.person;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person implements Comparable<Person>{

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String city;
    private String mac;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
    private Date timestamp;
    private String creditcard;

    public Person() {

    }
    public Person(String name, String email, String city, String mac, Date timestamp, String creditcard){
       //        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.mac = mac;
        this.timestamp = timestamp;
        this.creditcard = creditcard;

    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getMac(){
        return mac;
    }

    public void setMac(String mac){
        this.mac = mac;
    }
    public Date getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }
    public String getCreditcard(){
        return creditcard;
    }
    public void setCreditcard(String creditcard){
        this.creditcard = creditcard;
    }

    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }

    public String toString() {
        return "a";
    }
}

