/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.schukat.ct417ass1v1;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michael
 */
public class Student {
    private String name;
    private Date dob;
    private int id;
    private HashSet<Subject> studentSubjects;
    private String username;
    private HashSet<Course> studentCourses;
    
    public Student(String name, Date dob, int id, String username) {
        this.name = name;
        this.username = username;
        this.dob = dob;
        studentSubjects = new HashSet<Subject>();
        studentCourses = new HashSet<Course>();
    }
    
    public void addSubject(Subject s) {
        studentSubjects.add(s);
    }
    
    public void addCourse(Course c) {
        studentCourses.add(c);
    }
    
    public String getName() {
        return this.name;
    }
    
    public HashSet<Course> getCourses() {
        return this.studentCourses;
    }
    
}
