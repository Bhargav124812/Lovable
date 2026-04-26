package com.spring_ai.lovable.dto.member;


import com.spring_ai.lovable.enums.ProjectRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record InviteMemberRequest(
       @Email @NotBlank String username,
       @NotNull ProjectRole role
) {
}
