package Exam1;

public class Library {
    private Book books[];
    public Library()
    {
        this.books=new Book[]{
                new Book("夏末未至",59,new Author("男","郭敬明",35)),
                new Book("射雕英雄传",50,new Author("男","金庸",32)),
                new Book("三国演义",90,new Author("男","罗贯中",55)),
                new Book("红楼梦",95,new Author("男","曹雪芹",60)),
                new Book("西游记",99,new Author("男","吴承恩",62)),
                new Book("水浒传",88,new Author("男","施耐庵",59)),
                new Book("斗破苍穹",60,new Author("男","天蚕土豆",30)),
                new Book("斗罗大陆",43,new Author("男","唐家三少",35)),
                new Book("武动乾坤",70,new Author("男","天蚕土豆",30)),
                new Book("大主宰",80,new Author("男","天蚕土豆",30)),
                new Book("繁星",88,new Author("女","冰心",100))

        };
    }
    public void sort(BookComparator bookComparator)
    {
        for(int i=0;i<books.length;i++)
        {
            for(int j=0;j<books.length-1-i;j++)
            {
                if(bookComparator.compare(books[j],books[j+1])>0)
                {
                    Book temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                }
            }
        }
    }
    public void show(BookPredicate predicate)
    {
        for(Book book:books)
        {
           if(predicate.check(book))
           {
               System.out.println(book);
           }
        }
    }

}
