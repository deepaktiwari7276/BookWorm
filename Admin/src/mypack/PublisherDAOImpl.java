package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PublisherDAOImpl implements PublisherDAO
{
	@Autowired
	HibernateTemplate template;
	
	@Override
	public void add(Publisher ref) 
	{
		template.save(ref);
	}

	@Override
	public List<Publisher> getAllPublisher() 
	{
		return template.loadAll(Publisher.class);
	}

}
