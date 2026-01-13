package com.CodeForgeProject.CodeForge.entity;


import com.CodeForgeProject.CodeForge.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Subcription {
    Long id;
    User user;
    Plan plan;
    String stripCustomerId;
    String stripSubscriptionId;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
   SubscriptionStatus status; //enum so that status cannot be anything (user defined data types with constraint)

}
