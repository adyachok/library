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
public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = bookService.createBook("H@G@", 12.5f, "Цікава книга на тему високих технологій");
        System.out.println(book1);
        
    }
    
}
