package ru.tunkoff.fintech.qa;

public class Main {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("Интересное название");
        library[1] = new Book("СЗСГ-42. Инструкция по эксплуатации", "ООО \"Моя оборона\"");
        library[2] = new Book("Как стать бедным за 7 дней", "Б.Т. Коинов", 7);
        library[3] = new Book("Уличная магия для домашних магглов, ч.2", 2, "С.А. Руман");
        library[4] = new Book("Квантовая хромодинамика для самых маленьких", 147,
                "Под ред. проф. Г.Г. Разжижайло. Галактический институт низких технологий. Кафедра слизи", 1584);

        Reader reader = new Reader();

        Book chosenBook = reader.choiceBook(library);
        reader.readBook(chosenBook);
        reader.rateBook(chosenBook);
    }
}
