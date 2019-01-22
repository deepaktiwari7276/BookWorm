package mypack;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book 
{
	private int book_id;
	private String book_name;
	private String book_image;
	private double book_price;
	private String book_description;
	private String book_path;
	private int book_edition;
	private Date book_published_date;
	private String book_author;
	private String book_publisher;
	private String book_category;
	private String book_type;
	private String book_language;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	@Column
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	@Column
	public String getBook_image() {
		return book_image;
	}
	public void setBook_image(String book_image) {
		this.book_image = book_image;
	}
	@Column
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	@Column
	public String getBook_description() {
		return book_description;
	}
	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}
	@Column
	public String getBook_path() {
		return book_path;
	}
	public void setBook_path(String book_path) {
		this.book_path = book_path;
	}
	@Column
	public int getBook_edition() {
		return book_edition;
	}
	public void setBook_edition(int book_edition) {
		this.book_edition = book_edition;
	}
	@Column
	public Date getBook_published_date() {
		return book_published_date;
	}
	public void setBook_published_date(Date book_published_date) {
		this.book_published_date = book_published_date;
	}
	@Column
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	@Column
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	@Column
	public String getBook_category() {
		return book_category;
	}
	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}
	@Column
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	@Column
	public String getBook_language() {
		return book_language;
	}
	public void setBook_language(String book_language) {
		this.book_language = book_language;
	}
	
}
