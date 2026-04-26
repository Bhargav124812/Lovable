package com.spring_ai.lovable.mapper;


import com.spring_ai.lovable.dto.project.ProjectResponse;
import com.spring_ai.lovable.dto.project.ProjectSummaryResponse;
import com.spring_ai.lovable.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);
}
