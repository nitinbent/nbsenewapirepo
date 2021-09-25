package om.nbse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import om.nbse.model.NBSEClass;
import om.nbse.model.NBSESchool;
import om.nbse.model.NBSESubject;
import om.nbse.repositories.ClassRepository;
import om.nbse.repositories.SchoolRepository;
import om.nbse.repositories.SubjectRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class NBSEController {

	private static final Logger logger = LoggerFactory.getLogger(NBSEController.class);

	 @Autowired
	 ClassRepository classRepository;
	 
	 @Autowired
	 SchoolRepository schoolRepository;
	 
	 @Autowired
	 SubjectRepository subjectRepository;
	 
	 
	 @GetMapping(value = "/getAllClasses",produces = MediaType.APPLICATION_JSON_VALUE)
	   	public ResponseEntity<Object> getAllClasses() {
	   	 
	   	   try {

	   		          List<NBSEClass> classes = classRepository.findByIsActive("1");
	   				   
	   				   if(classes!=null)
	   				   {
	   				      return ResponseEntity.ok().body(classes);
	   				   }
	   				   else
	   				   {
						  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"status\":\"No Class found\"}");
	   				   }
	   	
	   	} 	
	    catch (Exception e) {
	   		e.printStackTrace();
	   		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
	   	}
	   	   	 
	       }
	 
	    @GetMapping(value = "/getSchoolBySchoolCode/{schoolCode}",produces = MediaType.APPLICATION_JSON_VALUE)
	   	public ResponseEntity<Object> getSchoolBySchoolCode(@PathVariable("schoolCode") String schoolCode ) {
	   	 
	   	   try {

	   		           NBSESchool school = schoolRepository.findBySchoolCode(schoolCode);
	   				   
	   				   if(school!=null)
	   				   {
	   				      return ResponseEntity.ok().body(school);
	   				   }
	   				   else
	   				   {
						  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"status\":\"No School found\"}");
	   				   }
	   	
	   	} 	
	    catch (Exception e) {
	   		e.printStackTrace();
	   		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
	   	}
	   	   	 
	       }
	    
	    
	    @GetMapping(value = "/getSubjectsByClassId/{classId}",produces = MediaType.APPLICATION_JSON_VALUE)
	   	public ResponseEntity<Object> getSubjectsByClassId(@PathVariable("classId") Integer classId ) {
	   	 
	   	   try {

	   		          List<NBSESubject> subjects = subjectRepository.findByClassIdAndIsActive(classId,"1");
	   				   
	   				   if(subjects!=null)
	   				   {
	   				      return ResponseEntity.ok().body(subjects);
	   				   }
	   				   else
	   				   {
						  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"status\":\"No Subject found\"}");
	   				   }
	   	
	   	} 	
	    catch (Exception e) {
	   		e.printStackTrace();
	   		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
	   	}
	   	   	 
	       }
	    
	 
}
