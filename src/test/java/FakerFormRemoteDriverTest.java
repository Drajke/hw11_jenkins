import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("faker")
public class FakerFormRemoteDriverTest extends TestBase
{
    TestData testData = new TestData();
    @Test
    void fillForm(){

//        String fname = "John";
//        String lname = "Doe";
//        String email = "tessting@gmail.com";
//        String gender = "Male";
//        String number = "4955521321";
//        String subject = "Math";
//        String hobbie = "Reading";
//        String ufile = "1.jpeg";
//        String street = "Park Avenue";
//        String state = "Haryana";
//        String city = "Panipat";


        step("Открываем страницу:", () -> {
        registrationPage.openPage();
        });

        step("Заполняем форму случайными данными:", () -> {
        registrationPage.setFirstName(testData.firstName);
        registrationPage.setLastName(testData.lastName);
        registrationPage.setEmail(testData.email);
        registrationPage.setGender(testData.gender);
        registrationPage.setNumber(testData.number);
        registrationPage.setBirthDate(testData.birthDay,testData.birthMonth,testData.birthYear);
        registrationPage.setSubject(testData.subject);
        registrationPage.setHobbies(testData.hobbie);
        registrationPage.setFile(testData.ufile);
        registrationPage.setStreet(testData.address);
        registrationPage.setState(testData.state);
        registrationPage.setCity(testData.city);
        registrationPage.clckSubmit();
        });

        step("ОПроверяем результат заполнения:", () -> {
        regResult.verifyName(testData.firstName,testData.lastName);
        regResult.verifyEmail(testData.email);
        regResult.verifyGender(testData.gender);
        regResult.verifyNumber(testData.number);
        regResult.verifyBirthDate(testData.birthDay,testData.birthMonth,testData.birthYear);
        regResult.verifySubject(testData.subject);
        regResult.verifyHobbies(testData.hobbie);
        regResult.verifyFile(testData.ufile);
        regResult.verifyStreet(testData.address);
        regResult.verifyStateCity(testData.state,testData.city);
        });
    }
}
