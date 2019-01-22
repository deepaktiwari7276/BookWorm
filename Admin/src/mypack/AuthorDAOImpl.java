package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class AuthorDAOImpl implements AuthorDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public void add(Author ref) 
	{
		template.save(ref);
	}


	@Override
	public List<Author> getAllAuthor() 
	{
		return template.loadAll(Author.class);
	}

}
