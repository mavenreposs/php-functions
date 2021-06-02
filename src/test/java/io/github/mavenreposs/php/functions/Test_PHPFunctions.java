package io.github.mavenreposs.php.functions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

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

    @Test
    public void test_md5() {
        String hash = PHPFunctions.md5("123123");
        System.out.println(hash);
        Assertions.assertEquals("4297f44b13955235245b2497399d7a93", hash);
    }

    @Test
    public void test_sha1() {
        String hash = PHPFunctions.sha1("123123");
        System.out.println(hash);
        Assertions.assertEquals("601f1889667efaebb33b8c12572835da3f027f78", hash);
    }


}
