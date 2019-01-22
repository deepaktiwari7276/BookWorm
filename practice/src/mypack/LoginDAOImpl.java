package mypack;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class LoginDAOImpl implements LoginDAO {
	@Autowired(required=true)
	private HibernateTemplate template;
	
	
	public boolean checkLogin(Register ref)
	{
		List<Register> mylist = (List<Register>)template.find("from Register  where login='"+ref.getLogin()+"' and password='"+ref.getPassword()+"'");
		if (mylist.size() > 0)
			return true;
		else
			return false;
		
	}
}
