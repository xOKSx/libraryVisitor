package ru.tunkoff.fintech.qa;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] library) {
        Random random = new Random();
        int i = random.nextInt(library.length);
        return library[i];
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public void rateBook(Book book) {
        int rating = 0;
        String temp;
        Random random = new Random();

        if (book.title != null && !book.title.isBlank()) {
            temp = book.title.replace(" ", "");
            rating += temp.length();
        } else {
            rating -= random.nextInt(20) + 1;
        }

        if (book.author != null && !book.author.isBlank()) {
            temp = book.author.replace(" ", "");
            rating += temp.length();
        } else {
            rating -= random.nextInt(20) + 1;
        }

        if (book.numberInSeries >= 0) {
            rating -= book.numberInSeries;
        } else {
            rating -= random.nextInt(20) + 1;
        }

        if (book.pageCount >= 0) {
            rating += book.pageCount;
        } else {
            rating -= random.nextInt(20) + 1;
        }

        if (!book.title.isBlank()) {
            temp = "Книга \"" + book.title + "\": \nОценка " + rating;
        } else {
            temp = "Книга [Без названия]: \nОценка " + rating;
        }
        System.out.println(temp);
    }
}
