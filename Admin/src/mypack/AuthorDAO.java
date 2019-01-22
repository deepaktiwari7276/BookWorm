package mypack;

import java.util.List;

public interface AuthorDAO 
{
	void add(Author ref);
	List<Author> getAllAuthor();
}
