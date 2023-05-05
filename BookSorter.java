package bookSorter;


import java.util.Comparator;

public class BookSorter implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class BookSorterByPage implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPage()-o2.getPage();
    }
}
