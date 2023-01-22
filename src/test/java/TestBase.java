import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import page.RegPage;
import page.component.RegResult;

public class TestBase {
    RegPage registrationPage = new RegPage();
    RegResult regResult = new RegResult();
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }
}
