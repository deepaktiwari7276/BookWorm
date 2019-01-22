package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired(required=true)
	RegisterDAO rdao;
	@RequestMapping(value="/new_register",method = RequestMethod.GET)
public ModelAndView before()
{
	Register r = new Register();
	return new  ModelAndView("Spring_register","MyRegister",r);
}
	@RequestMapping(method = RequestMethod.POST)
	public String After(Register ref)
	{
		rdao.register(ref);
		return "Home";
	}
	@RequestMapping(value="/View_all",method=RequestMethod.GET)
	public ModelAndView display()
	{
		List list = rdao.ViewAll();
		return new ModelAndView("View","rushi",list);
	}
}
