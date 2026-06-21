package com.spring_ai.lovable.service;

import com.spring_ai.lovable.dto.deploy.DeployResponse;

public interface DeploymentService {
    DeployResponse deploy(Long projectId);
}
