/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ie.nuigalway.schukat.ct417ass1v1.Course;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Michael
 */
public class CourseJUnitTest {
    
    public CourseJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test1() {} {
        String s1 = "BSc (CS&IT)";
        Course t1 = new Course(s1, new DateTime(), new DateTime());
        assertEquals(s1, t1.getName());  
    }
}
