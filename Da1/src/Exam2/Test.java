package Exam2;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        //library.show(book->book.getBookAuthor().getAuthorName().equals("天蚕土豆"));
        //library.show(book->book.getBookPrice()>50);
        //排序
        //library.sort((book1, book2) -> book1.getBookPrice()-book2.getBookPrice());
        //展示所有的书
        library.show(book -> true);

    }
}


