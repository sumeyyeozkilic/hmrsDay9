package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.LinkType;

public interface LinkTypeService {
	Result add(LinkType linkType);
    DataResult<List<LinkType>> getAll();
}
