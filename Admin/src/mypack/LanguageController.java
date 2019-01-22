package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_Language")
public class LanguageController 
{
	@Autowired
	LanguageDAO ldao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Language l=new Language();
		return new ModelAndView("AddLanguage","language",l);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String after(Language ref,HttpServletRequest request)
	{
		request.setAttribute("message","Language");
		ldao.add(ref);
		return "Success";
	}
}
