package om.nbse.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import om.nbse.model.NBSESubject;

@CrossOrigin(origins = "*")
public interface SubjectRepository extends JpaRepository<NBSESubject, Integer>{

	List<NBSESubject> findByClassIdAndIsActive(Integer classId, String isActive);
	
}
