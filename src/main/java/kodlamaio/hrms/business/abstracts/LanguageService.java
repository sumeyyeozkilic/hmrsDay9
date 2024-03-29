package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Language;

public interface LanguageService {
	 Result add(Language language);
	 DataResult<List<Language>> getAll();
}
