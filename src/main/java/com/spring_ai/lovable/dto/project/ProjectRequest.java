package com.spring_ai.lovable.dto.project;

import jakarta.validation.constraints.NotNull;

public record ProjectRequest(
       @NotNull String name
) {
}
