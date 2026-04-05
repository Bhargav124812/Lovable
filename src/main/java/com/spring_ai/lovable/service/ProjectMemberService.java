package com.spring_ai.lovable.service;



import com.spring_ai.lovable.dto.member.InviteMemberRequest;
import com.spring_ai.lovable.dto.member.MemberResponse;
import com.spring_ai.lovable.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
