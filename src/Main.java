import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*      Bank System
    Account деген класс тузунуз ,анын сөзсүз double balance деген полясы болот жана сиз
    каалагандай поле кошсонуз болот. Томонку методдор болуусу керек:
    checkBalance -   балансты текшеруу,
    deposit() -  баланска акча кошот ,
    withdrawal() -  баланстан акча алат
    transaction() -  бир account тан экинчи account ка акча которуу методору болсун.
    main методдон  2-3 account тузуп ар кандай операцияларды жасаныз.
         */

        Account account1 = new Account();
        account1.setId(1);
        account1.setName("John");
        account1.setBalance(200);
        account1.setCountry("KG");

        Account account2 = new Account();
        account2.setId(2);
        account2.setName("David");
        account2.setBalance(500);
        account2.setCountry("Turkey");

        Account account3 = new Account();
        account3.setId(3);
        account3.setName("Kristen");
        account3.setBalance(300);
        account3.setCountry("Switzerland");

        Account[] account = {account1, account2, account3};
        for(Account accounts : account){
            System.out.println(accounts.toString());
        }

        System.out.println();
        System.out.println("Балансты текшеруу");
        account1.checkBalance();
        account2.checkBalance();
        account3.checkBalance();

        System.out.println();
        account1.deposit(400);
        account2.deposit(100);
        account3.deposit(200);

        System.out.println();
        account1.withdrawal(100);
        account2.withdrawal(200);
        account3.withdrawal(300);

        System.out.println();
        System.out.println("Акча которуу");
        account1.transaction(account3,200);
        account2.transaction(account1,200);
        account3.transaction(account2,200);









        // Task 1
//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(5);
//        rectangle.setWidth(3);
//
//        System.out.println(rectangle.getArea());





        // Task 2
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//
//        Student student = new Student();
//
//        System.out.println("Write name: " );
//        student.setFirstName(scanner.nextLine());
//
//        System.out.println("Write Lastname: ");
//        student.setLastName(scanner.nextLine());
//
//        System.out.println("Write age:");
//        student.setAge(scanner.nextInt());
//
//        System.out.println(" Quantity of course: ");
//        int quantity = scanner1.nextInt();
//
//        System.out.println("Write course: ");
//        String[]courses = new String[quantity];
//
//
//        scanner1.nextLine();
//        for (int i = 0; i < quantity; i++) {
//           courses[i] = scanner1.nextLine();
//        }
//        student.setCourses(courses);
//
//        System.out.println("~~~~~~~~~~~~~~info~~~~~~~~~~~~~~~~~~ " );
//        System.out.println("Name: " + student.getFirstName());
//        System.out.println("Lastname: " + student.getLastName());
//        System.out.println("Age: " + student.getAge());
//        System.out.println("Courses: " + Arrays.toString(student.getCourses()));


       










    }
}