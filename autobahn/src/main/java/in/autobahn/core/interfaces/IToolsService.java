package in.autobahn.core.interfaces;

import java.util.List;

import in.autobahn.core.entities.Tool;

public interface IToolsService {
public Tool upsert(Tool tool);
public List<Tool> getALL();

}
