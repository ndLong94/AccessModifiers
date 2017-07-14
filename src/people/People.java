package people;

/**
 * Created by ADMIN on 7/12/2017.
 */
public class People {
    protected String name;
    String age;
    public String gender;
    private String yearOfBirth;

    public String getName() {
        return "name is inaccessible ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return "age is inaccessible ";
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return "gender is inaccessible ";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYearOfBirth() {
        return "yearOfBirth is inaccessible: ";
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
