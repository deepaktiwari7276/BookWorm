package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Author 
{
	private int author_id;
	private String author_name;
	private String author_phone_number;
	private String author_email;
	private String author_description;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	@Column
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	@Column
	public String getAuthor_phone_number() {
		return author_phone_number;
	}
	public void setAuthor_phone_number(String author_phone_number) {
		this.author_phone_number = author_phone_number;
	}

	@Column
	public String getAuthor_email() {
		return author_email;
	}
	public void setAuthor_email(String author_email) {
		this.author_email = author_email;
	}

	@Column
	public String getAuthor_description() {
		return author_description;
	}
	public void setAuthor_description(String author_description) {
		this.author_description = author_description;
	}
	@Override
	public String toString() {
		return author_name;
	}
	
	
	
}
