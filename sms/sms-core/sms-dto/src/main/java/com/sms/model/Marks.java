package com.sms.model;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Marks {

    private Map<String,Map<String, Integer>> semesterSubjectScore;

    public Map<String, Map<String, Integer>> getSemesterSubjectScore() {
        return semesterSubjectScore;
    }

    public void setSemesterSubjectScore(Map<String, Map<String, Integer>> semesterSubjectScore) {
        this.semesterSubjectScore = semesterSubjectScore;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "semesterSubjectScore=" + semesterSubjectScore +
                '}';
    }
}
