/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;
import java.sql.*;

/**
 *
 * @author Ravikumar Makwana
 */
public class DAO {

    public static Student student;
    public static Staff staff;
    public static Connection con;
    public static Statement stmt;
    public static Books books;

    public static boolean login(char c, int id) {
        String msg = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajt7030", "root", "");
            stmt = con.createStatement();
            if (c == 's') {
                ResultSet rs = stmt.executeQuery("Select * from Student where student_id=" + id + "");
                if (rs.next()) {
                    student = new Student(id, rs.getString("name"), rs.getInt("semester"), rs.getString("branch"), rs.getInt("book_balance"));
                    msg = "Student SuccessFully Login";
                }
            } else {
                ResultSet rs = stmt.executeQuery("Select * from Staff where staff_id='" + id + "'");
                if (rs.next()) {
                    staff = new Staff(id, rs.getString("name"), rs.getString("post"), rs.getInt("book_balance"));
                    msg = "Staff SuccessFully Login";
                }
            }
        } finally {
            if (msg.length() == 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static String issueBook(int isbnno, char c) {
        String msg = "";
        try {
            if (c == 's') {
                if (student.bookBalance >= 4) {
                    return "Insufficent Balance";
                }
                ResultSet rs = stmt.executeQuery("Select * from books where isbn_no=" + isbnno + "");
                if (rs.next()) {
                    books = new Books(isbnno, rs.getString("title"), rs.getString("author"), rs.getInt("stock"));
                    if (books.stock == 0) {
                        msg = "Book not Available";
                    } else {
                        books.stock--;
                        student.bookBalance++;
                        int r1 = stmt.executeUpdate("Update books set stock=" + books.stock + " where isbn_no=" + isbnno + "");
                        int r2 = stmt.executeUpdate("update student set book_balance=" + student.bookBalance + " where student_id=" + student.studentId + "");
                        int r3 = stmt.executeUpdate("Insert into status values (null,'" + student.studentId + "','" + isbnno + "','" + books.title + "','" + books.author + "')");
                        msg = "Book is Issue Seccessfully";
                    }
                } else {
                    msg = "Book not Found";
                }
            } else {
                if (staff.bookBalance > 10) {
                    msg = "Insufficent Balance";
                }
                ResultSet rs = stmt.executeQuery("Select * from books where isbn_no=" + isbnno + "");
                if (rs.next()) {
                    books = new Books(isbnno, rs.getString("title"), rs.getString("author"), rs.getInt("stock"));
                    if (books.stock == 0) {
                        msg = "Book not Available";
                    } else {
                        books.stock--;
                        staff.bookBalance++;
                        int r1 = stmt.executeUpdate("Update books set stock=" + books.stock + " where isbn_no=" + isbnno + "");
                        int r2 = stmt.executeUpdate("update staff set book_balance=" + staff.bookBalance + " where staff_id=" + staff.staffId + "");
                        int r3 = stmt.executeUpdate("Insert into status values (null,'" + staff.staffId + "','" + isbnno + "','" + books.title + "','" + books.author + "')");
                        msg = "Book is Issue Seccessfully";
                    }
                } else {
                    msg = "Book not Found";
                }
            }
        } finally {
            return msg;
        }
    }

    public static String returnBook(int isbnno, char c) {
        String msg = "";
        try {
            ResultSet rs = stmt.executeQuery("Select * from books where isbn_no=" + isbnno + "");
            rs.next();
            books = new Books(isbnno, rs.getString("title"), rs.getString("author"), rs.getInt("stock"));
            if (c == 's') {
                books.stock++;
                student.bookBalance--;
                int r1 = stmt.executeUpdate("Update books set stock=" + books.stock + " where isbn_no=" + isbnno + "");
                int r2 = stmt.executeUpdate("update student set book_balance=" + student.bookBalance + " where student_id=" + student.studentId + "");
                int r3 = stmt.executeUpdate("delete from status where id="+student.studentId+" and book_id="+books.isbnNo+"");
                msg = "Book is Return Seccessfully";
            } else {
                books.stock++;
                staff.bookBalance--;
                int r1 = stmt.executeUpdate("Update books set stock=" + books.stock + " where isbn_no=" + isbnno + "");
                int r2 = stmt.executeUpdate("update staff set book_balance=" + staff.bookBalance + " where staff_id=" + staff.staffId+ "");
                int r3 = stmt.executeUpdate("delete from status where id="+staff.staffId+" and book_id="+books.isbnNo+"");
                msg = "Book is Return Seccessfully";
            }
        } finally {
            return msg;
        }
    }
}
