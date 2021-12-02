package com.capstone.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ppmtool.domain.Project;
import com.capstone.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	public Project saveOrUpdateProject (Project project) {
		
		return projectRepository.save(project);
	}
}
