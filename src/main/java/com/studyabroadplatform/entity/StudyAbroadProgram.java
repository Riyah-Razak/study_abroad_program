package com.studyabroadplatform.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "study_abroad_programs")
public class StudyAbroadProgram {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name="program_name")
	    private String programName;

	    @Column(name="destination")
	    private String destination;

	    @Column(name="duration_months")
	    private Integer durationMonths;
	    
	    @Column(name="start_date")
	    private LocalDate startDate;
	    
	    @Column(name="end_date")
	    private LocalDate endDate;
	    
	    @Column(name="description")
	    private String description;

		public StudyAbroadProgram(Integer id, String programName, String destination, Integer durationMonths,
				LocalDate startDate, LocalDate endDate, String description) {
			super();
			this.id = id;
			this.programName = programName;
			this.destination = destination;
			this.durationMonths = durationMonths;
			this.startDate = startDate;
			this.endDate = endDate;
			this.description = description;
		}

		public StudyAbroadProgram() {
			super();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getProgramName() {
			return programName;
		}

		public void setProgramName(String programName) {
			this.programName = programName;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public Integer getDurationMonths() {
			return durationMonths;
		}

		public void setDurationMonths(Integer durationMonths) {
			this.durationMonths = durationMonths;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "StudyAbroadProgram [id=" + id + ", programName=" + programName + ", destination=" + destination
					+ ", durationMonths=" + durationMonths + ", startDate=" + startDate + ", endDate=" + endDate
					+ ", description=" + description + "]";
		}

}
