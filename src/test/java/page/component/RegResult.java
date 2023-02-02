package page.component;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;

public class RegResult {
    public void verifyName(String fname, String lname){
        $("td",1).shouldHave(Condition.text(fname + " " + lname));
    }

    public void verifyEmail(String value){
        $("td",3).shouldHave(Condition.text(value));
    }

    public void verifyGender(String value){
        $("td",5).shouldHave(Condition.text(value));
    }

    public void verifyNumber(String value){
        $("td",7).shouldHave(Condition.text(value));
    }

    public void verifyBirthDate(String day, String month, String year){
        $("td",9).shouldHave(Condition.text(day + " " + month + "," + year));
    }

    public void verifySubject(String value){
        $("td",11).shouldHave(Condition.text(value));
    }
    public void verifyHobbies(String value) {
        $("td",13).shouldHave(Condition.text(value));
    }

    public void verifyFile(String value) {
        $("td",15).shouldHave(Condition.text(value));
    }

    public void verifyStreet(String value){
        $("td",17).shouldHave(Condition.text(value));
    }

    public void verifyStateCity(String state, String city){
        $("td",19).shouldHave(Condition.text(state + " " + city));
    }

}
