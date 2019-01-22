package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public void add(Category ref) 
	{
		template.save(ref);
	}

	@Override
	public List<Category> getAllCategory() 
	{
		return template.loadAll(Category.class);
	}
	

}
