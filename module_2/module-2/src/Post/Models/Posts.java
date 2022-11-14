package Post.Models;

public class Posts {
    private int id;
    private String title;
    private String subtitle;
    private String content;
    private Double views;

    public Posts() {
    }

    public Posts(int id, String title, String subtitle, String content, Double views) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getViews() {
        return views;
    }

    public void setViews(Double views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", content='" + content + '\'' +
                ", views=" + views +
                '}';
    }

    public String nga(){
        return id +
                ", "+title  +
                "," + subtitle  +
                ", " + content +
                ", " + views;
    }
}
