package com.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class SelenideTest {

    @Test
    public void testSelenide() {
        WebDriverManager.chromedriver().setup();  // драйвер сам подтянется!

        Selenide.open("http://uitestingplayground.com");

        $x("//a[contains(@class, 'navbar-brand')]")
                .shouldBe(Condition.visible, Duration.ofSeconds(10));

        System.out.println("Элемент найден, тест прошел успешно!");
    }
}
