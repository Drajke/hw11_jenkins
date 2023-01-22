import org.junit.jupiter.api.Test;

public class NotSimpleFormTest extends TestBase
{


    @Test
    void fillForm(){
        String fname = "John";
        String lname = "Doe";
        String email = "tessting@gmail.com";
        String gender = "Male";
        String number = "4955521321";
        String subject = "Math";
        String hobbie = "Reading";
        String ufile = "1.jpeg";
        String street = "Park Avenue";
        String state = "Haryana";
        String city = "Panipat";


        //Заполнение
        registrationPage.openPage();
        registrationPage.setFirstName(fname);
        registrationPage.setLastName(lname);
        registrationPage.setEmail(email);
        registrationPage.setGender(gender);
        registrationPage.setNumber(number);
        registrationPage.setBirthDate("07","May","1951");
        registrationPage.setSubject(subject);
        registrationPage.setHobbies(hobbie);
        registrationPage.setFile(ufile);
        registrationPage.setStreet(street);
        registrationPage.setState(state);
        registrationPage.setCity(city);
        registrationPage.clckSubmit();

        //Проверка
        regResult.verifyResults();

    }
}
