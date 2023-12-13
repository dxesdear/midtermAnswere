package org.test66Chakhrit;

import lib023.Book023;
import lib023.BookList023;
import u023Chakhrit.Util023Chakhrit;

import java.awt.print.Book;

public class Main23Chakhrit {
    public static void main(String[] args) {
        testUniqe023Chakhrit();
        testCheckdigit();
        testBook();
        testBookList();
    }

    private static void testBook() {
        System.out.println("## test book ##");
        // constructor
        try{
            var b = new Book023("null" , 230.0);
        }catch (Exception e){
            System.out.println("Book construction error : " + e);
        }
        try{
            var b2 = new Book023("Dear" , 0.0);
        }catch(Exception e){
            System.out.println("Book construction error : " + e);
        }
        Book023 b3 = new Book023("Chakhrit",250.0);
        Book023 b4 = new Book023("Tom" , 456.0);
        Book023 b5 = new Book023("Chakhrit",250.0);

        System.out.println(b3);
        System.out.println("b3.getIsbn : " + b3.getIsbn023());
        System.out.println("b3.getTitle : " + b3.getTitle023());
        System.out.println("b3.getPrice : " + b3.getPrice023());

        System.out.println("Book.hashcode : " + b3.hashCode());

        System.out.println("Book.equal : " + b3.equals(b4));
        System.out.println("Book.equal : " + b3.equals(b3));
    }

    private static void testBookList() {
        var bookList = BookList023.newList();
        System.out.println(bookList);
        Book023 b1 = new Book023("one" , 230.0);
        Book023 b2 = new Book023("two",240.0);
        var b3 = new Book023("three",550.50);
        bookList.add(b1);
        bookList.add(b1);
        System.out.println(bookList);
        bookList.add(b2);
        bookList.add(b3);
        System.out.println(bookList);

        System.out.println("BookList total price : "+ bookList.totalPrice());

        //remove
        bookList.remove023(b2);
        bookList.remove023(b1);
        System.out.println(bookList);

        System.out.println(bookList.totalPrice());
    }

    private static void testCheckdigit() {
        System.out.println("## check digit ##");
        System.out.println("check digit '123456789 ' = " +Util023Chakhrit.checkDigit023( 123456789L));
    }

    static void testUniqe023Chakhrit() {
        System.out.println("## test unique ##");
        System.out.println("unique "+ Util023Chakhrit.unique023Chakhrit());
        System.out.println("unique "+ Util023Chakhrit.unique023Chakhrit());
        System.out.println("unique "+ Util023Chakhrit.unique023Chakhrit());
    }
}