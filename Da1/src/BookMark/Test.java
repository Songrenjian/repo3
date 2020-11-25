package BookMark;

public class Test {
   public static void main(String[] args)
   {
       BookMark bookMark[]={
               new BookMark("三打白骨精",10),
               new BookMark("女儿国",25),
               new BookMark("大闹天宫",7),
               new BookMark("车迟国斗法",30),
               new BookMark("真假美猴王",7)
       };
       showBookMarks(bookMark,30,20);
   }
   public static void showBookMarks(BookMark[] bookMark,int maxpage,int minpage)
   {
       for(BookMark bookMark1:bookMark)
       {
           if(bookMark1.getPage()<=maxpage&&bookMark1.getPage()>=minpage)
           {
               System.out.println(bookMark1.getBookMarkInfo());
           }
       }
   }
}
