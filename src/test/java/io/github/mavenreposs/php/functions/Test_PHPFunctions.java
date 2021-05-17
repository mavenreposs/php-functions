package io.github.mavenreposs.php.functions;


import org.junit.jupiter.api.Test;

public class Test_PHPFunctions {

    @Test
    public void test_gmtime()
    {
        Integer a = PHPFunctions.gmtime();
        System.out.println(a);
    }

    @Test
    public void test_getdate() {
        GetDate getDate = PHPFunctions.getdate();
        System.out.println(getDate);
    }


}
