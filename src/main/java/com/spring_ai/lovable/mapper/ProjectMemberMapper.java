package com.spring_ai.lovable.mapper;


import com.spring_ai.lovable.dto.member.MemberResponse;
import com.spring_ai.lovable.entity.ProjectMember;
import com.spring_ai.lovable.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "role", constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(User owner);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "role", source = "user.username")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
