package com.altimetrik.college.information.collegeportal.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getSchoolName() {
        School s = new School();
        s.setSchoolName("De Anza College");
        String schoolName = "De Anza College";
        assertEquals(schoolName, s.getSchoolName());
    }

    @Test
    void setSchoolName() {

    }

    @Test
    void getSchoolID() {
        School s = new School();
        s.setSchoolName("De Anza College");
        String schoolName = "De Anza College";
        assertEquals(schoolName, s.getSchoolName());
    }


    @Test
    void setSchoolID() {
    }

    @Test
    void getSchoolYear() {
        School s = new School();
        s.setSchoolYear(2020);
        int year= 2019;
        assertEquals(year, s.getSchoolYear());
        assertNotEquals(year,s.getSchoolYear());
    }

    @Test
    void setSchoolYear() {
    }

    @Test
    void getZipcode() {
        School s = new School();
        s.setZipcode(95112);
        int correctZip = 95112;
        int wrongZip = 90909090;
        assertEquals(correctZip, s.getZipcode());
        assertNotEquals(wrongZip,s.getZipcode());
    }

    @Test
    void setZipcode() {
    }

    @Test
    void getNoOfDegrees() {

    }

    @Test
    void setNoOfDegrees() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void setDistance() {
    }

    @Test
    void testGetSchoolName() {
    }

    @Test
    void testSetSchoolName() {
    }

    @Test
    void testGetSchoolID() {
    }

    @Test
    void testSetSchoolID() {
    }

    @Test
    void testGetSchoolYear() {
    }

    @Test
    void testSetSchoolYear() {
    }

    @Test
    void testGetZipcode() {
    }

    @Test
    void testSetZipcode() {
    }

    @Test
    void testGetNoOfDegrees() {
    }

    @Test
    void testSetNoOfDegrees() {
    }
}