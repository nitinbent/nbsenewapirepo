package om.nbse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import om.nbse.model.NBSESchool;

@CrossOrigin(origins = "*")
public interface SchoolRepository extends JpaRepository<NBSESchool, Integer>{
	
	NBSESchool findBySchoolCode(String schoolCode);

}
