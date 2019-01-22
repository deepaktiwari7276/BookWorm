package mypack;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Transactional
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired(required=true)
	private HibernateTemplate template;
	
	public void register(Register ref)
	{
		template.save(ref);
	}
	
	 public List<Register> ViewAll()
	{
		List<Register> mylist = (List<Register>)template.find("from Register");
		return mylist;
	}
}
