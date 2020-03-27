/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

/**
 *
 * @author Ravikumar Makwana
 */
public class Student extends User{

    public int studentId;
    public int semester;
    public String branch;
    public int bookBalance;

    public Student(int studentId,String name, int semester, String branch, int bookBalance) {
        super(name,'s');
        this.studentId = studentId;
        this.semester = semester;
        this.branch = branch;
        this.bookBalance = bookBalance;
    }

    public int getBookBalance() {
        return bookBalance;
    }

    public String getBranch() {
        return branch;
    }

    public int getSemester() {
        return semester;
    }

}
