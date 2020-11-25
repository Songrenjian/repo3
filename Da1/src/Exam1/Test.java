package Exam1;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        //library.show(new AgePredicate());
        //library.show(new NamePredicate("天蚕土豆"));
        //library.show(b->b.getBookAuthor().getAuthorName().equals("天蚕土豆"));
       // library.sort(new CompareByPrice());
        library.show(new NonePredicate());
        library.sort((b1,b2)->b1.getBookAuthor().getAuthorAge()-b2.getBookAuthor().getAuthorAge());
    }
}
/*class CompareByPrice implements BookComparator
{
    @Override
    public int compare(Book book1,Book book2)
    {
        return book1.getBookPrice()-book2.getBookPrice();
    }
}*/
class NonePredicate implements  BookPredicate
{
    @Override
    public boolean check(Book book) {
        return true;
    }
}
/*class AgePredicate implements BookPredicate{
    @Override
    public boolean check(Book book)
    {
        return book.getBookAuthor().getAuthorAge()>=30&&book.getBookAuthor().getAuthorAge()<=60;
    }
}*/
/*class NamePredicate implements BookPredicate{
    private String name;
    public NamePredicate(String name)
    {
        this.name=name;
    }
    @Override
    public boolean check(Book book) {
        return book.getBookAuthor().getAuthorName().equals(name);
    }
}*/

