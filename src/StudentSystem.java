import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentSystem {



    public static void main(String[] args) {

        ArrayList <Student> list = new ArrayList<>();



       while (true){
           System.out.println("Welcome to the Student Manager System");
           System.out.println("1.Add");
           System.out.println("2.Delete");
           System.out.println("3.Modify");
           System.out.println("4.Search");
           System.out.println("5.Exit");

           Scanner sc = new Scanner(System.in);
           String choose = sc.next();

           switch (choose){
               case "1"-> addStudent(list);
               case "2"-> deleteStudent(list);
               case "3"-> modifyStudent(list);
               case "4"-> searchStudent(list);

               case "5"-> {
                   System.out.println("Exit");
                   return;
               }
               default -> System.out.println("No option");



           }
       }


    }



    public static void addStudent(ArrayList <Student> list){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter student id");
        String id = sc.next();

        System.out.println("Please enter student name");
        String name = sc.next();
        System.out.println("Please enter student age");
        int age = sc.nextInt();
        System.out.println("Please enter student address");
        String address = sc.next();

        Student s = new Student(id,name,age,address);
        list.add(s);


    }
    public static void deleteStudent(ArrayList <Student> list){
        System.out.println("Delete student");

    }
    public static void modifyStudent(ArrayList <Student> list){
        System.out.println("Modify student");

    }
    public static void searchStudent(ArrayList <Student> list){
        System.out.println("Search student");

        if (list.isEmpty()){
            System.out.println("There is no student info, please added");
            return;
        }else {

            System.out.println("ID\t\tName\t\tAge\t\tAddress");
            for (Student student : list) {
                System.out.println(student.getId() + "\t" + student.getId() + "\t" + student.getName() + "\t" + student.getAddress() + "\t");

            }

        }



    }

}
