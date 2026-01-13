package com.CodeForgeProject.CodeForge.entity;

import com.CodeForgeProject.CodeForge.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
public class ProjectMember {
    // this is join table to join user and project table
    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;

}
