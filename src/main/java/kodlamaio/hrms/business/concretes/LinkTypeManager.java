package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.LinkTypeService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LinkTypeDao;
import kodlamaio.hrms.entities.concretes.LinkType;

public class LinkTypeManager implements LinkTypeService{

	private final LinkTypeDao linkTypeDao;

    @Autowired
    public LinkTypeManager(LinkTypeDao linkTypeDao) {
        this.linkTypeDao= linkTypeDao;
	
	@Override
	public Result add(LinkType linkType) {
		this.linkTypeDao.save(linkType);
        return new SuccessResult();
	}

	@Override
	public DataResult<List<LinkType>> getAll() {
		 return new SuccessDataResult<>(this.linkTypeDao.findAll());
	}

}
