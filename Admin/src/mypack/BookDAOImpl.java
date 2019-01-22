
package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BookDAOImpl implements BookDAO
{
	@Autowired
	HibernateTemplate template;

	@Override
	public void add(Book ref) 
	{
		template.save(ref);	
	}

}
