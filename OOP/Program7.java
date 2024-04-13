class Books
{
    private int pageNum;
    //setter
    void setPageNUm(int x)
    {
        if(x>0)
        {
            pageNum=x;
        }
        else
        {
            System.out.println("Only positive numbers accepted");
        }
    }
    //getter
    int getPageNum()
    {
        return pageNum;
    }
}

public class Program7 {
    public static void main(String[] args) {
        Books book=new Books();
        book.setPageNUm(100);
        System.out.println(book.getPageNum());
    }
}
