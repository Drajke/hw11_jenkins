package page.component;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;

public class CalendarComponent {
    public void setDate(String day, String month, String year){

        Selenide.$(".react-datepicker__month-dropdown-container").$(byText(month)).click();
        Selenide.$(".react-datepicker__year-dropdown-container").$(byText(year)).click();
        Selenide.$(".react-datepicker__day--0" + day).click();
    }
}
