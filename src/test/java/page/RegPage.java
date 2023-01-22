package page;

import com.codeborne.selenide.Selenide;
import page.component.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegPage {

    CalendarComponent calendarComponent = new CalendarComponent();

    public void openPage(){
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }

    public void setFirstName(String value){
        $("#firstName").setValue(value);
    }

    public void setLastName(String value){
        $("#lastName").setValue(value);
    }

    public void setEmail(String value){
        $("#userEmail").setValue(value);
    }

    public void setGender(String value){
        $(byText(value)).click();
    }

    public void setNumber(String value){
        $("#userNumber").setValue(value);
    }

    public void setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
    }

    public void setSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();
    }
    public void setHobbies(String value) {
        $(byText(value)).click();
    }

    public void setFile(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
    }

    public void setStreet(String value){
        $("#currentAddress").setValue(value);
    }

    public void setState(String value){
        $(byText("Select State")).click();
        $(byText(value)).click();
    }

    public void setCity(String value){
        Selenide.$(byText("Select City")).click();
        Selenide.$(byText(value)).click();
    }

    public void clckSubmit() {
        $("#submit").click();
    }
}
