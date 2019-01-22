package mypack;

import java.util.List;

public interface PublisherDAO 
{
	void add(Publisher ref);

	List<Publisher> getAllPublisher();
}
