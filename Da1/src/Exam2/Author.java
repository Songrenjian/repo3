package Exam2;

public class Author {
    private String authorName;
    private int authorAge;
    private String authorGender;
    public String getAuthorName()
    {
        return authorName;
    }
    public void setAuthorName(String authorName)
    {
        this.authorName=authorName;
    }
    public String getAuthorGender()
    {
        return authorGender;
    }
    public void setAuthorGender(String authorGender)
    {
        this.authorGender=authorGender;
    }
    public int getAuthorAge()
    {
        return authorAge;
    }
    public void setAuthorAge(int authorAge)
    {
        this.authorAge=authorAge;
    }
    public Author(){};
    public Author(String authorGender,String authorName,int authorAge)
    {
        setAuthorAge(authorAge);
        setAuthorGender(authorGender);
        setAuthorName(authorName);
    }
    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorAge=" + authorAge +
                ", authorGender='" + authorGender + '\'' +
                '}';
    }
}
