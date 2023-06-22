package class1;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false )
    public void Atest() {
        System.out.println("I am test A");
    }

    @Test
    public void Btest() {
        System.out.println("I am test B");
    }

    @Test(enabled = false)
    public void Ctest() {
        System.out.println("I am test C");
    }
}
