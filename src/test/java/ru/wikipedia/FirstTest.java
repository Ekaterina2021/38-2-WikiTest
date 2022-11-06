package ru.wikipedia;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ru.wikipedia.org/");
    }

    {

    }

}
