import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import page.RegPage;
import page.component.RegResult;

import java.util.Map;

public class TestBase {
    RegPage registrationPage = new RegPage();
    RegResult regResult = new RegResult();
    @BeforeAll
    static void beforeAll(){

        Configuration.browserSize = System.getProperty("sizeBrowser", "1920x1080");

        Configuration.browser = System.getProperty("browser", "chrome");

        Configuration.browserVersion = System.getProperty("versionBrowser", "100");

        Configuration.remote = System.getProperty("urlRemote","https://user1:1234@selenoid.autotests.cloud/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Скриншот");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
