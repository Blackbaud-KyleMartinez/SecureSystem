package com.company;

/**
 * Created by kylemartinez on 9/11/14.
 */
public class Subject {

    public String subjectName;
    public int readValue = 0;
    public SecurityLevel securityLevel;


    public Subject(String name, SecurityLevel clearanceLevel){
        subjectName = name;
        securityLevel = clearanceLevel;
    }

    public void updateReadValue(int value){
        readValue = value;
    }
}
