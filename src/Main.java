import classes.Student;

public class Main {

    public static void main(String[] args) {
        //Define new Student Object
        Student student = new Student();
        //Initial student
        student.setAge("23");
        student.setName("ITLONG94");
        student.setStudentId(1);
        student.setGender("Male");
        student.setYearOfBirth("1994");

        // Print out properties of student and see whether these properties are accessible from Student to People or not
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getYearOfBirth());
        System.out.println("Note that you can access all the properties of supper class no matter what access modifiers they are by use geter and setter \nmethod as long as those methods is 'public' or  'protected' access modifier, that's how Encapsulation in java work");


    }
}
