package org.example.backend.model;

import java.util.List;


public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private City city;
    private List<Article> articles;

    public Customer(String firstName, String lastName, City city, List<Article> articles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.articles = articles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city=" + city +
                ", articles=" + articles +
                '}';
    }
}