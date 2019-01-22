package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class LanguageDAOImpl implements LanguageDAO
{
	@Autowired
	HibernateTemplate template;
	
	@Override
	public void add(Language ref) 
	{
		template.save(ref);
	}

	@Override
	public List<Language> getAllLanguage() 
	{
		return template.loadAll(Language.class);
	}
	

}
