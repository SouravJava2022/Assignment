import java.io.Serializable;

public class Dao implements Serializable {

	private static final long serialVersionUID = 1L;
   private String title;
   private String description;
   private String content;
   private int BlogId;
public int getBlogId() {
	return BlogId;
}
public void setBlogId(int blogId) {
	BlogId = blogId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
    
	}
    
    

