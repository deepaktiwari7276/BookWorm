package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_Category")
public class CategoryController 
{
	@Autowired
	CategoryDAO cdao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Category c=new Category();
		return new ModelAndView("AddCategory","category",c);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String after(Category ref,HttpServletRequest request)
	{
		request.setAttribute("message", "Category");
		cdao.add(ref);
		return "Success";
	}

}
