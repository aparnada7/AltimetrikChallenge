package com.altimetrik.college.information.collegeportal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SchoolClass {

        @JsonProperty("schoolID")
        private int schoolID;

        @JsonProperty("school.name")
        private String schoolName;

        @JsonProperty("2017.student.size")
        private int schoolSize;
    }
