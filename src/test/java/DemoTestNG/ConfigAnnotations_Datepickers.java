package DemoTestNG;
import org.testng.annotations.*;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ConfigAnnotations_Datepickers {
    @Test(groups = "smoke")
    public void test1_Bootstrap() {
        System.out.println("Datepickers - Test method date picker 1");
    }
    @Test
    public void test2_Bootstrap(){
        System.out.println("Datepickers - Test method date picker 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Execute before each of test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Execute after each of test method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class - DatePicker");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class - DatePicker");
    }

    @BeforeGroups(groups = {"smoke"})
    public void beforeGroups(){
        System.out.println("Executed before group");
    }



}
