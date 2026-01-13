package com.CodeForgeProject.CodeForge.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectFile {
    Long id;
    Project project;
    String path;//frontend can create tree like structure of files using this path
    String minioObjectKey;
    Instant createdAt;
    Instant updatedAt;
    User  createdBy;// these are for auditing purposes to see which member updated the file
    User updatedBy;

}
