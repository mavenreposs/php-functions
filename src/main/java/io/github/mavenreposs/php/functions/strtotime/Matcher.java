package io.github.mavenreposs.php.functions.strtotime;

import java.util.Date;

public interface Matcher {

    Date tryConvert(String input, Date date);

}
