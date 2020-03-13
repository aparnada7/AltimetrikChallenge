package com.altimetrik.college.information.collegeportal.controllers;

import com.altimetrik.college.information.collegeportal.model.School;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class searchController {

    @RequestMapping({"/", "/index"})
    public String getIndex() {
        return "index";
    }


    @GetMapping("https://api.data.gov/ed/collegescorecard/v1/schools.json/{api_key}/{zip}/{distance}/{degrees}")
    public String getSchoolInfo(@RequestParam("api_key") String apikey, @RequestParam("zip") int zipcode, @RequestParam("distance") int distance, @RequestParam("degrees") int degrees) {

        LinkedHashMap<Integer, HashMap> schoolInfo = new LinkedHashMap<>();
        HashMap<String, String> schoolMap = new HashMap<>();

        schoolMap.put("schoolName", "");
        schoolMap.put("schoolSize", "");
        schoolMap.put("zip", "");
        schoolMap.put("schoolYear", "");
        schoolMap.put("noOfDegrees", "");

//        schoolInfo.put(schoolID, schoolMap);

        String result = schoolInfo.toString();
        return result;

    }

    }

