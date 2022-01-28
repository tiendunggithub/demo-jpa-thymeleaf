package edu.tiendung.jpath.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	@NotEmpty(message  = "Tiêu đề không được rỗng")
	private String title;
	
	@Column(name="content")
	@NotEmpty(message  = "Nội dung không được rỗng")
	@Size(min = 20, message ="Nội dung phải có độ dài trên 20 ký tự")
	private String content;
	
	@Column(name="image")
	private String image;
	
	/*
	 * @Column(name="likes") private long likes = 0;
	 * 
	 * @Column(name="dislikes") private int dislikes = 0;
	 */

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer auth;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToMany(fetch=FetchType.EAGER , cascade = CascadeType.MERGE)
	@JoinTable(name = "post_tag",
			joinColumns = @JoinColumn(name = "post_id"),
			inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private List<Tag> tags = new ArrayList<Tag>();
	
	public Post() {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	/*
	 * public long getLikes() { return likes; }
	 * 
	 * public void setLikes(long likes) { this.likes = likes; }
	 * 
	 * public int getDislikes() { return dislikes; }
	 * 
	 * public void setDislikes(int dislikes) { this.dislikes = dislikes; }
	 */

	public Customer getAuth() {
		return auth;
	}

	public void setAuth(Customer auth) {
		this.auth = auth;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", image=" + image
				+ ", auth=" + auth + ", category=" + category + ", tags=" + tags + "]";
	}
	
	
}
