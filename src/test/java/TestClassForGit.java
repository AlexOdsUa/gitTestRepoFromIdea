import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClassForGit {
    @Test
    public void testMethod() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    @Test
    public void testMethod2() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'HAHAHA' HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    @Test
    public void testMethod3() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'HelloWorld' HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }


}
