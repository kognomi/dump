/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sandbox2;

import org.testng.annotations.*;
import prj.tst.sandbox2.MyFirstProgram;

import static org.testng.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        MyFirstProgram classUnderTest = new MyFirstProgram();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}