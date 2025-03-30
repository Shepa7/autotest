package com.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SelenideTest {

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        Configuration.headless = false; // Отключаем headless-режим, чтобы видеть браузер
        Configuration.timeout = 10000; // Увеличиваем глобальный тайм-аут до 10 секунд
    }

    @Test
    public void testSelenide() {
        // Открываем тестовую страницу
        Selenide.open("http://uitestingplayground.com");

        // Явное ожидание элемента, если он медленно загружается
        $x("//a[contains(@class, 'navbar-brand')]")
                .shouldBe(Condition.visible, Duration.ofSeconds(10));

        // Логируем успешное обнаружение элемента
        System.out.println("Элемент найден, тест прошел успешно!");
    }
}