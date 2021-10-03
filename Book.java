import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title_;
    private List<String> content_;

    public Book(String title)
    {
        title_ = title;
        content_ = new ArrayList<>();
    }

    public void createNewParagraph(String paragraph)
    {
        content_.add(paragraph);
    }

    public void createNewImage(String image)
    {
        content_.add(image);
    }

    public void createNewTable(String table)
    {
        content_.add(table);
    }

    @Override
    public String toString()
    {
        StringBuilder string = new StringBuilder();

        string.append("Title: " + title_ + "\n");

        for (String content : content_)
            string.append(content + '\n');

        return string.toString();
    }

    public void print()
    {
        System.out.println(this);
    }
}
