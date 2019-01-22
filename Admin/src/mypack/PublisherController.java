package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_Publisher")
public class PublisherController 
{
	@Autowired
	PublisherDAO pdao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Publisher p=new Publisher();
		return new ModelAndView("AddPublisher","publisher",p);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String after(Publisher ref,HttpServletRequest request)
	{
		request.setAttribute("message", "Publisher");
		pdao.add(ref);
		return "Success";
	}
}
