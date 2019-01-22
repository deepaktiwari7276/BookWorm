package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TypeDAOImpl implements TypeDAO
{
	@Autowired
	HibernateTemplate template;
	
	@Override
	public void add(Type ref) 
	{
		template.save(ref);
	}

	@Override
	public List<Type> getAllType() 
	{
		return template.loadAll(Type.class);
	}
}
