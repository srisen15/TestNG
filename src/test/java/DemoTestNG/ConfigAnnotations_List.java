package DemoTestNG;

import org.testng.annotations.*;

@Test
public class ConfigAnnotations_List {

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
        System.out.println("Before class - List Picket");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class - List Picker");
    }


    public void test3_BootstrapListbox() {
        System.out.println("List picker - Test method date list 1");
    }

    public void test4_BootstrapListbox(){
        System.out.println("List picker - Test method date list  2");
    }

}

