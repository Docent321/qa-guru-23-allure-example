package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AllurTest extends TestBase {


    @Test
    @Owner("AlexDonskov")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Задачи в репозитории")
    @DisplayName("Проверка Ozon в хедере")
    @Tag("Web")
    void testLogotipOzon() {
        step("Открыть главную страницу", () -> {
            open("https://www.ozon.ru/");;
        });
        step("Проверить наличие надписи Ozon в хедере", () -> {
            $("[data-widget=header]").should(text("Ozon"));
        });
    }

}
