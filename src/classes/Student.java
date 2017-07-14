package classes;

import people.People;

/**
 * Created by ADMIN on 7/12/2017.
 */
public class Student extends People {
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String getName() {
        return "name is accessible: " + this.name;
    }

    @Override
    public String getGender() {
        return "gender is accessible: " + this.gender;
    }

    @Override
    public String getAge() {
        // cannot return "StudentAge: " + age;
        return super.getAge();
    }

    @Override
    public String getYearOfBirth() {
        //cannot  return "StudentDateOfBirth: " + dateOfBirth;
        return super.getYearOfBirth();
    }

}
