package ru.tunkoff.fintech.qa;

public class Book {
    String title;
    String author;
    int numberInSeries = -1;
    int pageCount = -1;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this(title);
        this.author = author;
    }

    Book(String title, String author, int pageCount) {
        this(title, author);
        this.pageCount = pageCount;
    }

    Book(String title, int numberInSeries, String author) {
        this(title, author);
        this.numberInSeries = numberInSeries;
    }

    Book(String title, int numberInSeries, String author, int pageCount) {
        this(title, numberInSeries, author);
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        String temp = "";
        if (title != null && !title.isBlank()) {
            temp += "Название: \t\t" + title + "\n";
        } else {
            temp += "Название: \t\t- \n";
        }
        if (author != null && !author.isBlank()) {
            temp += "Автор: \t\t\t" + author + "\n";
        } else {
            temp += "Автор: \t\t\t- \n";
        }
        if (numberInSeries >= 0) {
            temp += "Номер в серии: \t" + numberInSeries + "\n";
        } else {
            temp += "Номер в серии: \t- \n";
        }
        if (pageCount >= 0) {
            temp += "Кол-во страниц: " + pageCount + "\n";
        } else {
            temp += "Кол-во страниц: - \n";
        }
        return temp;
    }
}
