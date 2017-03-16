import org.testng.annotations.*;

/**
 * Created by User on 14.03.2017.
 */
public class test2 {
    @BeforeClass
    public void  SetUpClass(){
        System.out.println("Make before Class2");
    }
    @AfterClass
    public void  tearDOwnClass(){
        System.out.println("Make after Class2");
    }
    @BeforeMethod
    public void  SetUpMethod(){
        System.out.println("Make before метод2");
    }
    @AfterMethod
    public void  tearDOwnMethod(){
        System.out.println("Make after Метод2");
    }
    @Test
    public void firstTest(){
        System.out.println("first test");
    }
}
