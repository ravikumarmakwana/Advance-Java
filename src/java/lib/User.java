/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

/**
 *
 * @author Ravikumar Makwana
 */
public class User {
    public String name;
    public char p;

    public User(String name, char p) {
        this.name = name;
        this.p = p;
    }

    public char getP() {
        return p;
    }

    public String getName() {
        return name;
    }
    
}
