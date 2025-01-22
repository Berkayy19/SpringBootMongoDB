package org.example.backend.model;
public class Article {
    private String id;
    private String type;
    private double price;

    // Standardkonstruktor
    public Article() {}

    // Konstruktor
    public Article(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Getter und Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
