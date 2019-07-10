package com.base.day5.Student;

import java.io.File;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        HomeWorkController hc = new HomeWorkController();
        Student s1 = new Student("A",1,20);
        Student s2 = new Student("B",2,20);
        hc.regist(s1);
        hc.regist(s2);
        HomeWork hw1 = new HomeWork(s1,new Date(2019-1900,7,10,15,0,0),"homework1");
        HomeWork hw2 = new HomeWork(s1,new Date(2019-1900,7,10,16,0,0),"homework2");
        HomeWork hw3 = new HomeWork(s2,new Date(2019-1900,7,10,5,0,0),"homework2");
        hc.upload(hw1);
        hc.upload(hw2);
        hc.upload(hw3);
        hc.setScore(hw1,20);
        hc.setScore(hw2,60);
        hc.setScore(hw3,120);
        hc.showWork(s1);
        hc.showWork(s2);

    }
}