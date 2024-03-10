package in.autobahn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.autobahn.core.entities.Tool;
import in.autobahn.core.interfaces.IToolsService;
import in.autobahn.repo.IToolsRepo;

@Service
public class ToolsService implements IToolsService {

	/*
	 * @Override public Tool upsert(Tool tool) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public List<Tool> getALL() { // TODO Auto-generated method stub
	 * return null; }
	 */

	
	  private final IToolsRepo _toolRepo;
	  
	  public ToolsService(IToolsRepo toolRepo) { _toolRepo = toolRepo; }
	  
	  @Override public Tool upsert(Tool tool) { return _toolRepo.save(tool); }
	  
	  @Override public List<Tool> getALL() { return _toolRepo.findAll(); }
	 
}
