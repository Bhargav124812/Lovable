package com.spring_ai.lovable.mapper;


import com.spring_ai.lovable.dto.project.ProjectResponse;
import com.spring_ai.lovable.dto.project.ProjectSummaryResponse;
import com.spring_ai.lovable.entity.Project;
import com.spring_ai.lovable.enums.ProjectRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);


    ProjectSummaryResponse toProjectSummaryResponse(Project project, ProjectRole role);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);
}
