import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String[] courses;

    public Student(){

    }

    public Student(String firstName, String lastName, int  age, String[]courses){
      this.firstName= firstName;
      this.lastName=lastName;
      this.age=age;
      this.courses=courses;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCourses(String[]courses) {
        this.courses = courses;
    }

    public String[] getCourses(){
        return courses;
    }


    @Override
    public String toString() {
        return "Student" +
                "firstName: "+ firstName+
                ", lastName: " + lastName  +
                ", age: " + age +
                ", courses: " + Arrays.toString(courses);
    }
}
