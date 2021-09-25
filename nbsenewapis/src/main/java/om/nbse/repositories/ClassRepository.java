package om.nbse.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import om.nbse.model.NBSEClass;


@CrossOrigin(origins = "*")
public interface ClassRepository extends JpaRepository<NBSEClass, Integer> {
	
	List<NBSEClass> findByIsActive(String isActive);
}
