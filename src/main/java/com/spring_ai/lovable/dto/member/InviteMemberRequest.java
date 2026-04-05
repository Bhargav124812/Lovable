package com.spring_ai.lovable.dto.member;


import com.spring_ai.lovable.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
