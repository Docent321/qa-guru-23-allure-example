package tests;

import helpers.DriverConfig;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.Project;
import helpers.AllureAttachments;
import helpers.DriverUtils;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith({AllureJunit5.class})
public class BaseTest {

    @BeforeAll
    static void setup() {

        DriverConfig.configure();
    }

    @BeforeEach
    public void setupEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (Project.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
    }

}
