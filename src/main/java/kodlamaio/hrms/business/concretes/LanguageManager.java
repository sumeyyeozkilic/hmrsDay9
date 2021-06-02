package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;

public class LanguageManager implements LanguageService{

	 private final LanguageDao languageDao;

	    @Autowired
	    public LanguageManager(LanguageDao languageDao) {
	        this.languageDao = languageDao;
	    }
	
	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
        return new SuccessResult();
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
	}

}
