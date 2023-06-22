package class1;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void Login(){
        System.out.println(10/0);
    }
    @Test(dependsOnMethods = {"Login"})
    public void TestTheDashBoardPage(){
        System.out.println("i am testing dashboard page");
    }
}
