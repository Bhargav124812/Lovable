package com.spring_ai.lovable.entity;

import com.spring_ai.lovable.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;

    Instant acceptedAt;
}
