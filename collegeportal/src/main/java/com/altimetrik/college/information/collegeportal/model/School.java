package com.altimetrik.college.information.collegeportal.model;

import org.springframework.stereotype.Component;


public class School {

    private String schoolName;
    private int schoolID;
    private int schoolYear;
    private int zipcode;
    private int noOfDegrees;
    private int schoolSize;

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int distance;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getNoOfDegrees() {
        return noOfDegrees;
    }

    public void setNoOfDegrees(int noOfDegrees) {
        this.noOfDegrees = noOfDegrees;
    }
}
