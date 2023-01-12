import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.sleep;

public class notSimpleFormTest
{
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillForm(){
        //Заполнение
        Selenide.open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        Selenide.$("#firstName").setValue("John");
        Selenide.$("#lastName").setValue("Doe");
        Selenide.$("#userEmail").setValue("tessting@gmail.com");
        Selenide.$(byText("Male")).click();
        Selenide.$("#userNumber").setValue("4955521321");
        Selenide.$("#dateOfBirthInput").click();
        Selenide.$(".react-datepicker__month-dropdown-container").$(byText("May")).click();
        Selenide.$(".react-datepicker__year-dropdown-container").$(byText("1951")).click();
        Selenide.$(".react-datepicker__day--007").click();
        Selenide.$("#subjectsInput").setValue("Math").pressEnter();
        Selenide.$(byText("Reading")).click();
        Selenide.$("#uploadPicture").uploadFromClasspath("RM.txt");
        Selenide.$("#currentAddress").setValue("Park Avenue");
        Selenide.$(byText("Select State")).click();
        Selenide.$(byText("Haryana")).click();
        Selenide.$(byText("Select City")).click();
        Selenide.$(byText("Panipat")).click();
        Selenide.$("#submit").click();
        //Проверка
        Selenide.$(".modal-header").shouldHave(Condition.text("Thanks for submitting the form"));
        Selenide.$("td",1).shouldHave(Condition.text("John Doe"));
        Selenide.$("td",3).shouldHave(Condition.text("tessting@gmail.com"));
        Selenide.$("td",5).shouldHave(Condition.text("Male"));
        Selenide.$("td",7).shouldHave(Condition.text("4955521321"));
        Selenide.$("td",9).shouldHave(Condition.text("7 May,1951"));
        Selenide.$("td",11).shouldHave(Condition.text("Math"));
        Selenide.$("td",13).shouldHave(Condition.text("Reading"));
        Selenide.$("td",15).shouldHave(Condition.text("RM.txt"));
        Selenide.$("td",17).shouldHave(Condition.text("Park Avenue"));
        Selenide.$("td",19).shouldHave(Condition.text("Haryana Panipat"));
    }
}
