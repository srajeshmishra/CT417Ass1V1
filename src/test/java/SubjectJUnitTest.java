/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ie.nuigalway.schukat.ct417ass1v1.Subject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Michael
 */
public class SubjectJUnitTest {
    
    public SubjectJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test1() {} {
        String s1 = "CT417";
        Subject t1 = new Subject(s1);
        assertEquals(s1, t1.getName());    
    }
}
