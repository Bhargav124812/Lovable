package com.spring_ai.lovable.service;



import com.spring_ai.lovable.dto.project.FileContentResponse;
import com.spring_ai.lovable.dto.project.FileNode;
import com.spring_ai.lovable.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
