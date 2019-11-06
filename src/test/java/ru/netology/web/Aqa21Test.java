package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Aqa21Test {

    @Test
    void shouldTest() {
        open("http://localhost:9999");

        $("[data-test-id=name] input").setValue("Василий Алибабаевич");
        $("[data-test-id=phone] input").setValue("+71234567890");
        $("[data-test-id=agreement]").click();
        $(By.tagName("button")).click();
        $("[data-test-id=order-success]").should(exist);
    }
}
