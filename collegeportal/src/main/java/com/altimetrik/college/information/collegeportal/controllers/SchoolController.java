package com.altimetrik.college.information.collegeportal.controllers;

import com.altimetrik.college.information.collegeportal.domain.SearchResult;
import com.altimetrik.college.information.collegeportal.rest.School_API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/schooldetails")
public class SchoolController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private School_API School;

    @GetMapping({"/", ""})
    public SearchResult getSchoolInfo(@RequestParam("distance") int distance, @RequestParam("zip") int zipcode, @RequestParam("year") int schoolyear) {
        int dist = distance;
        int zip = zipcode;
        int year = schoolyear;
        return restTemplate.getForObject("https://api.data.gov/ed/collegescorecard/v1/schools.json?api_key=ZW4Gm3OQEV5heYFvHVZlnx5cw3Xay3mWoLYiwVim&school.degrees_awarded.predominant=2,3&fields=id,school.name,"+year+".student.size&per_page=100&zip="+zip+"&distance="+dist+"mi", SearchResult.class);
    }
}