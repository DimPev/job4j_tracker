package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookSol = new Book("Искра жизни", 211);
        Book bookCb = new Book("Clean code", 666);
        Book bookMaM = new Book("Мастер и Маргарита", 555);
        Book bookLotr = new Book("властелин колец", 1350);
        Book[] books = new Book[4];
        books[0] = bookSol;
        books[1] = bookCb;
        books[2] = bookMaM;
        books[3] = bookLotr;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        books[0] = bookLotr;
        books[3] = bookSol;
        System.out.println("Replace index 0 for 3");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println("Only CleanCode: " + bk.getName() + " - " + bk.getPage());
                break;
            }
        }
    }
}