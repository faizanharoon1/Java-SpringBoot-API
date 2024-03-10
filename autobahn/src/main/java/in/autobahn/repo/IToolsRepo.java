package in.autobahn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.autobahn.core.entities.Tool;
@Repository
public interface IToolsRepo extends JpaRepository<Tool, Integer> {

}
