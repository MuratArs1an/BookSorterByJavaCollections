package bookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>(new BookSorter());
        books.add(new Book("Duma Island",600,"Stephen King","2008"));
        books.add(new Book("Lotr",1200,"J.R.R. Tolkien","1967"));
        books.add(new Book("Nutuk",543,"Mustafa Kemal ATATURK","1927"));
        books.add(new Book("Elveda Guzel Vatanim",350,"Ahmet Umit","2018"));
        books.add(new Book("Yarinin adami",400,"Con Snow","2023"));

        System.out.println("========Isime Gore Siralama===========");

        for(Book b:books){
            System.out.println(b.getName());
        }

        System.out.println("========Sayfa Sayisina Gore Siralama===========");

        TreeSet<Book> bookList=new TreeSet<>(new BookSorterByPage().reversed());
        bookList.add(new Book("Duma Island",600,"Stephen King","2008"));
        bookList.add(new Book("Lotr",1200,"J.R.R. Tolkien","1967"));
        bookList.add(new Book("Nutuk",543,"Mustafa Kemal ATATURK","1927"));
        bookList.add(new Book("Elveda Guzel Vatanim",350,"Ahmet Umit","2018"));
        bookList.add(new Book("Yarinin adami",400,"Con Snow","2023"));

        for(Book b:bookList){
            System.out.println(b.getName()+" "+b.getPage());
        }
    }
}
