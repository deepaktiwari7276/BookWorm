package mypack;

import java.util.List;

public interface LanguageDAO 
{
	void add(Language ref);

	List<Language> getAllLanguage();
}
