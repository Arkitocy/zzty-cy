package com.base.day5.Student;

import java.util.ArrayList;
import java.util.Date;

public class HomeWorkController {
    ArrayList studentList = new ArrayList();
    ArrayList homeworkList = new ArrayList();

    public boolean regist(Student student) {
        if (student.equals(null)) {
            System.out.println("注册失败");
            return false;
        } else {
            studentList.add(student);
            System.out.println("注册成功");
            return true;
        }
    }

    public HomeWork upload(HomeWork work) {
        if (work.equals(null)) {
            System.out.println("提交失败");
            return null;
        } else {
            work.setUploadDate(new Date());
            homeworkList.add(work);
            System.out.println("提交成功");
            return work;
        }

    }

    public void showWork(Student student) {
        for (int i = 0; i < homeworkList.size(); i++) {
            HomeWork homeWork = (HomeWork) homeworkList.get(i);
            if (student.equals(homeWork.getStudent())) {
                homeWork.show();
            }else{
                System.out.println("无该学生提交的作业");
            }
        }
    }

    public void setScore(HomeWork work, int score) {
        if (score >= 0 && score <= 100) {
            for (int i = 0; i < homeworkList.size(); i++) {
                HomeWork homeWork = (HomeWork) homeworkList.get(i);
                homeWork.setScore(score);
                System.out.println("修改成功");
            }
        } else {
            System.out.println("修改失败");
        }
    }
}