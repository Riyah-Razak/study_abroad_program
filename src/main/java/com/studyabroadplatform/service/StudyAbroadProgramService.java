package com.studyabroadplatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyabroadplatform.entity.StudyAbroadProgram;
import com.studyabroadplatform.repository.StudyAbroadProgramRepository;

@Service
public class StudyAbroadProgramService {

	    @Autowired
	    private StudyAbroadProgramRepository programRepository;  
	    
	    public List<StudyAbroadProgram> getAllPrograms() {
	        return programRepository.findAll();
	    }
	    
	    public Optional<StudyAbroadProgram> getProgramById(Integer id) {
	        return programRepository.findById(id);
	    }
	    
	    public StudyAbroadProgram createProgram(StudyAbroadProgram program) {
	        return programRepository.save(program);
	    }
	    
	    public StudyAbroadProgram updateProgram(Integer id, StudyAbroadProgram program) {
	        if (programRepository.existsById(id)) {
	            program.setId(id);
	            return programRepository.save(program);
	        }
	        return null;
	    }
	    
	    public void deleteProgram(Integer id) {
	        programRepository.deleteById(id);
	    }
}
