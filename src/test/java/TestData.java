import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String gender = faker.options().option("Male","Female","Other");
    String number = faker.phoneNumber().subscriberNumber(10);
    String birthMonth = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    String birthYear = faker.number().numberBetween(1900, 2022) + "";
    String birthDay = faker.number().numberBetween(1, 28) + "";
    String subject = faker.options().option("Math", "Chemistry", "English", "Physics" );
    String hobbie = faker.options().option("Sports", "Reading");
    String ufile = "1.jpeg";
    String address = faker.address().streetAddress();
    String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    String city = selectCity();

    private String selectCity() {
        String cityName = null;

        if (state.equals("NCR")) {
            cityName = faker.options().option("Delhi", "Gurgaon", "Noida");
        }

        if (state.equals("Uttar Pradesh")) {
            cityName = faker.options().option("Agra", "Lucknow", "Merrut");
        }

        if (state.equals("Haryana")) {
            cityName = faker.options().option("Karnal", "Panipat");
        }

        if (state.equals("Rajasthan")) {
            cityName = faker.options().option("Jaipur", "Jaiselmer");
        }

        return cityName;
    }
}
