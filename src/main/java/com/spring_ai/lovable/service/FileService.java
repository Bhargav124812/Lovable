package com.spring_ai.lovable.service;



import com.spring_ai.lovable.dto.project.FileContentResponse;
import com.spring_ai.lovable.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
