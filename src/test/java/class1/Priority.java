package class1;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 4, groups = "smoke")
    public void Atest(){
        System.out.println("i am A test");
    }
    @Test(priority = 3)
    public void Btest(){
        System.out.println("i am b test");
    }
    @Test(priority = 2)
    public void ctest(){
        System.out.println("i am c test");
    }
    @Test(priority = 1)
    public void Dtest(){
        System.out.println("i am D test");
    }
    @Test
    public void ABTest(){
        System.out.println("i am D Test");
    }
}
