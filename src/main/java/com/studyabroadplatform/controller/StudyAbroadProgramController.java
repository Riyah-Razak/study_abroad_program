package com.studyabroadplatform.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studyabroadplatform.entity.StudyAbroadProgram;
import com.studyabroadplatform.service.StudyAbroadProgramService;

@RestController
@RequestMapping("/programs")
public class StudyAbroadProgramController {

	@Autowired
	private StudyAbroadProgramService programService;

	@GetMapping("/all")
	public List<StudyAbroadProgram> getAllPrograms() {
		return programService.getAllPrograms();
	}

	@GetMapping("/{id}")
	public ResponseEntity<StudyAbroadProgram> getProgramById(@PathVariable Integer id) {
		Optional<StudyAbroadProgram> program = programService.getProgramById(id);
		return program.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/create")
    public ResponseEntity<StudyAbroadProgram> createProgram(@RequestBody StudyAbroadProgram program) {
        StudyAbroadProgram createdProgram = programService.createProgram(program);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProgram);
    }
	
	@PutMapping("/update/{id}")
    public ResponseEntity<StudyAbroadProgram> updateProgram(@PathVariable Integer id, @RequestBody StudyAbroadProgram program) {
        StudyAbroadProgram updatedProgram = programService.updateProgram(id, program);
        if (updatedProgram != null) {
            return ResponseEntity.ok(updatedProgram);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProgram(@PathVariable Integer id) {
        programService.deleteProgram(id);
        return ResponseEntity.ok("program deleted");
    }
}
