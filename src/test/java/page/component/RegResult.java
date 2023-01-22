package page.component;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;

public class RegResult {
    public void verifyResults(){
        $(".modal-header").shouldHave(Condition.text("Thanks for submitting the form"));
        $("td",1).shouldHave(Condition.text("John Doe"));
        $("td",3).shouldHave(Condition.text("tessting@gmail.com"));
        $("td",5).shouldHave(Condition.text("Male"));
        $("td",7).shouldHave(Condition.text("4955521321"));
        $("td",9).shouldHave(Condition.text("7 May,1951"));
        $("td",11).shouldHave(Condition.text("Math"));
        $("td",13).shouldHave(Condition.text("Reading"));
        $("td",15).shouldHave(Condition.text("1.jpeg"));
        $("td",17).shouldHave(Condition.text("Park Avenue"));
        $("td",19).shouldHave(Condition.text("Haryana Panipat"));
    }
}
