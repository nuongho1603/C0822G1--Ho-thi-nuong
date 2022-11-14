package Post.View;

import FuramaResorts.Util.ReadFile;
import Post.Models.Posts;
import Post.Util.ReadandWriteFile;

import java.util.List;

public class view {
    public static void main(String[] args) {
        List<Posts> postsList = ReadandWriteFile.readFilePost("module-2\\src\\Post\\Data\\post1.csv");
        for (Posts post : postsList) {
            System.out.println(post.toString());
        }
        postsList.add(new Posts(3, "n", "....", "//", 10.2));
        ReadandWriteFile.writeFilePost("module-2\\src\\Post\\Data\\post1.csv", postsList);
    }

}
