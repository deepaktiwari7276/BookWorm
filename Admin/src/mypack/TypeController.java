package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_Type")
public class TypeController 
{
	@Autowired
	TypeDAO tdao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Type t=new Type();
		return new ModelAndView("AddType","type",t);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String after(Type ref,HttpServletRequest request)
	{
		request.setAttribute("message","Type");
		tdao.add(ref);
		return "Success";
	}
}
