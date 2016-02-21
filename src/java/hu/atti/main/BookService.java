/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.atti.main;

import javax.inject.Inject;

/**
 *
 * @author eandgya
 */
@Loggable
public class BookService {
        
    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;
    

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        System.out.println("Trying to generate number!");
        System.out.println(numberGenerator);
//        String number = numberGenerator.generateNumber();
//        System.out.println("NUMBER: " + number);
//        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
