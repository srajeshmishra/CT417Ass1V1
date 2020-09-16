/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.schukat.ct417ass1v1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michael
 */
public class Subject {
    private String name;
    private HashSet<Student> subjectStudents;
    private HashSet<Course> subjectCourses;
    
    public Subject(String name) {
        this.name = name;
        subjectStudents = new HashSet<Student>();
        subjectCourses = new HashSet<Course>();
    }
    
    public void addStudent(Student s) {
        subjectStudents.add(s);
    }
    
    public void addCourse(Course c) {
        subjectCourses.add(c);
    }

    public String getName() {
        return this.name;
    }
    
    public HashSet<Student> getStudents() {
        return this.subjectStudents;
    }
    
}
