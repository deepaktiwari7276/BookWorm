package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	@Autowired(required=true)
	LoginDAO ldao;
		
	@RequestMapping(value="/login_user",method = RequestMethod.GET)
	public ModelAndView check()
	{
		Register r = new Register();
		return new ModelAndView("Spring_login","MyLogin",r);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String logged(@ModelAttribute("rushi")Register r)
	{
		boolean b = ldao.checkLogin(r);
		
		if(b)
			return "success";
		else
			return "fail";
	}
	

}
