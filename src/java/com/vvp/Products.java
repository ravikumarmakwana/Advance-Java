/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vvp;

/**
 *
 * @author Ravikumar Makwana
 */
public class Products {
    public String pname;
    public int stock,price,pid;

    public Products(String pname, int stock, int price, int pid) {
        this.pname = pname;
        this.stock = stock;
        this.price = price;
        this.pid = pid;
    }

    public Products(){}

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
