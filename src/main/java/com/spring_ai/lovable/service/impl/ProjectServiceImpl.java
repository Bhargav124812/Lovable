package com.spring_ai.lovable.service.impl;

import com.spring_ai.lovable.dto.project.ProjectRequest;
import com.spring_ai.lovable.dto.project.ProjectResponse;
import com.spring_ai.lovable.dto.project.ProjectSummaryResponse;
import com.spring_ai.lovable.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
