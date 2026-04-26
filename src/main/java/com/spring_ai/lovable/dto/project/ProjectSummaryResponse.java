package com.spring_ai.lovable.dto.project;

import com.spring_ai.lovable.enums.ProjectRole;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String projectName,
        Instant createdAt,
        Instant updatedAt,
        ProjectRole role
) {
}
