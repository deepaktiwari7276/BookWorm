package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_Author")
public class AuthorController 
{
	@Autowired
	AuthorDAO adao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Author a=new Author();
		return new ModelAndView("AddAuthor","author",a);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String after(Author ref,HttpServletRequest request)
	{
		request.setAttribute("message", "Author");
		adao.add(ref);
		return "Success";
	}

}
