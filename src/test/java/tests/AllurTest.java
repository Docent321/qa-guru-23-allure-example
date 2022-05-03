package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AllurTest extends BaseTest {


    @Test
    @DisplayName("Проверка Ozon в хедере")
    @Tag("Web")
    void testLogotipOzon() {
        step("Открыть главную страницу", () -> {
            open("https://www.ozon.ru/");
        });
        step("Проверить наличие надписи Ozon в хедере", () -> {
            $("[data-widget=header]").should(text("Ozon"));
        });
    }

}
