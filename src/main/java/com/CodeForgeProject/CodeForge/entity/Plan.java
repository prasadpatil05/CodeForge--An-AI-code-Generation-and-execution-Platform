package com.CodeForgeProject.CodeForge.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

//stores differnet types of plans detail like free pro premium,buisness , enterprise plan  like this
//and resource accesss
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Plan {
    //Q. why wrapper classes so when we add Long id without define it becomes null in database but int without define will give us error
    Long id;

    String name;

    String stripePriceId;

    Integer maxProject;

    Integer maxTokensPerDay;

    Integer maxPreviews;//max number of previews allowed per plan

    Boolean unlimitedAi;//unlimited access to LLm , ignore maxTokensPerDay if true

    Boolean active; // this is for admins only

}
