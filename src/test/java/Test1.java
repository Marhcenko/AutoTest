import org.testng.annotations.*;

/**
 * Created by User on 09.03.2017.
 */
public class Test1 {

    @BeforeClass
    public void  SetUpClass(){
        System.out.println("Make before Class1");
    }
    @AfterClass
    public void  tearDOwnClass(){
        System.out.println("Make after Class1");
    }
    @BeforeMethod
    public void  SetUpMethod(){
        System.out.println("Make before метод1");
    }
    @AfterMethod
    public void  tearDOwnMethod(){
        System.out.println("Make after Метод1");
    }
    @Test(groups = {"checkingtest", "smoke"})
    public void firstTest(){
        System.out.println("1");
    }
    @Test(groups = {"checkingtest", "smoke"})
    public void firstTest2(){
        System.out.println("2");
    }
    @Test(groups = {"checkingtest", "smoke"})
    public void firstTest3(){
        System.out.println("3");
    }
}

