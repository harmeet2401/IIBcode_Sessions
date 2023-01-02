package org.example.bean;

import java.util.List;
import java.util.Objects;


public class Student {
    private String name;
    private String stream;
    private int noofbooks;

    private int grade;

    private List<String> activities ;

    public Student(String name, String stream, int noofbooks, List<String> activities,int grade) {
        this.name = name;
        this.stream = stream;
        this.noofbooks = noofbooks;
        this.activities = activities;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getNoofbooks() {
        return noofbooks;
    }

    public void setNoofbooks(int noofbooks) {
        this.noofbooks = noofbooks;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                ", noofbooks=" + noofbooks +
                ", activities=" + activities +
                ", grade=" + grade +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return noofbooks == student.noofbooks && grade == student.grade && name.equals(student.name) && stream.equals(student.stream) && activities.equals(student.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stream, noofbooks, grade, activities);
    }
}
