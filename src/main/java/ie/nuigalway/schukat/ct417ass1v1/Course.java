/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.schukat.ct417ass1v1;

import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTime;

/**
 *
 * @author Michael
 */
public class Course {
    private String name;
    private HashSet<Subject> courseSubjects;
    private HashSet<Student> courseStudents;
    private DateTime start, end;
    
    public Course(String name, DateTime start, DateTime end) {
        this.name = name;
        courseSubjects = new HashSet<Subject>();
        courseStudents = new HashSet<Student>();
        this.start = start;
        this.end = end;        
    }
    
    public void addStudent(Student s) {
        courseStudents.add(s);
    }
    
    public void addSubject(Subject c) {
        courseSubjects.add(c);
    }
    
    public void addAcademicDates(DateTime start, DateTime end) {
        this.start = start;
        this.end = end;
    }
    
    public String getName() {
        return this.name;
    }
        
}
