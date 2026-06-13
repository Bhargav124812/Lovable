package com.spring_ai.lovable.mapper;

import com.spring_ai.lovable.dto.project.FileNode;
import com.spring_ai.lovable.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ProjectFileMapper {
    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
