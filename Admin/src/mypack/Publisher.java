package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Publisher 
{
	private int publisher_id;
	private String publisher_name;
	private String publisher_phone_number;
	private String publisher_email;
	private String publisher_description;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	@Column
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

	@Column
	public String getPublisher_phone_number() {
		return publisher_phone_number;
	}
	public void setPublisher_phone_number(String publisher_phone_number) {
		this.publisher_phone_number = publisher_phone_number;
	}

	@Column
	public String getPublisher_email() {
		return publisher_email;
	}
	public void setPublisher_email(String publisher_email) {
		this.publisher_email = publisher_email;
	}

	@Column
	public String getPublisher_description() {
		return publisher_description;
	}
	public void setPublisher_description(String publisher_description) {
		this.publisher_description = publisher_description;
	}
	@Override
	public String toString() {
		return publisher_name;
	}
	
	

}
