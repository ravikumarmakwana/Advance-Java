/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

/**
 *
 * @author Ravikumar Makwana
 */
public class Staff extends User {

    public int staffId;
    public String post;
    public int bookBalance;

    public Staff(int staffId,String name, String post, int bookBalance) {
        super(name,'f');
        this.staffId = staffId;
        this.post = post;
        this.bookBalance = bookBalance;
    }

    public String getPost() {
        return post;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setBookBalance(int bookBalance) {
        this.bookBalance = bookBalance;
    }
   
}
