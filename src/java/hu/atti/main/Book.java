/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.atti.main;

/**
 *
 * @author eandgya
 */
class Book {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    private String title;
    private Float price;
    private String description;
    private String number;

    public Book(String title, Float price, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
    }
    
    public String toString() {
        return this.title;
    }
    
}
