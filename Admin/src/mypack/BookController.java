
package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_Book")
public class BookController 
{

	@Autowired
	BookDAO bdao;
	
	@Autowired
	AuthorDAO adao;
	@Autowired
	PublisherDAO pdao;
	@Autowired
	TypeDAO tdao;
	@Autowired
	CategoryDAO cdao;
	@Autowired
	LanguageDAO ldao;
	
	@ModelAttribute("authorlist")
	List<Author> getAuthorList()
	{
		return adao.getAllAuthor();
	}
	
	@ModelAttribute("publisherlist")
	List<Publisher> getPublisherList()
	{
		return pdao.getAllPublisher();
	}

	@ModelAttribute("typelist")
	List<Type> getTypeList()
	{
		return tdao.getAllType();
	}

	@ModelAttribute("categorylist")
	List<Category> getCategoryList()
	{
		return cdao.getAllCategory();
	}
	
	@ModelAttribute("languagelist")
	List<Language> getLanguageList()
	{
		return ldao.getAllLanguage();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Book b=new Book();
		return new ModelAndView("AddBook","book",b);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String after(Book ref,HttpServletRequest request)
	{
		
		request.setAttribute("message", "Book");
		bdao.add(ref);
		return "Success";
	}

	
}

