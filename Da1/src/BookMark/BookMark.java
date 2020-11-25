package BookMark;

public class BookMark {
    private String name;
    private int page;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPage(int page)
    {
        this.page=page;
    }
    public int getPage()
    {
        return page;
    }
    public BookMark(){};
    public BookMark(String name,int page)
    {
        setPage(page);
        setName(name);
    }
    public int compareTo(BookMark other)
    {
        if(page<other.page)
        {
            return -1;
        }
        if (page>other.page)
        {
            return 1;
        }
        return 0;
    }
    public String getBookMarkInfo()
    {
        return "书签备注"+name+",书签页码"+page;
    }


}
