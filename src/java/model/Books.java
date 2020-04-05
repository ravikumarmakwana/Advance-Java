/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Ravikumar Makwana
 */
public class Books {
    public int isbnNo;
    public String title;
    public String author;
    public int stock;

    public Books(int isbnNo, String title, String author, int stock) {
        this.isbnNo = isbnNo;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public int getIsbnNo() {
        return isbnNo;
    }

    public String getTitle() {
        return title;
    }
    
}
