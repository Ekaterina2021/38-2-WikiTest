package appleInsider;


import core.BaseSelenideTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppleTest extends BaseSelenideTest {

    private final static String BASE_URL = "https://skillfactory.ru/";
    private final static String SEARCH_STRING = "-";
    private final static String EXPECTED_WORD = "-";

    @Test
    public void checkHref(){
        Assertions.assertFalse(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD));
    }
}
