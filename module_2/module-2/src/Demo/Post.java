package Demo;

public class Post {
    private String name;
    private int id;
    private String content;

    public Post(String name, int id, String content) {
        this.name = name;
        this.id = id;
        this.content = content;
    }

    public Post() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    public String convertLine() {
        final String COMMA = ",";
        return this.name + COMMA + this.id + COMMA + this.content;
    }
}
