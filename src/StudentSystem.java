import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {

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
               case "1"-> addStudent();
               case "2"-> deleteStudent();
               case "3"-> modifyStudent();
               case "4"-> searchStudent();

               case "5"-> {
                   System.out.println("Exit");
                   return;
               }
               default -> System.out.println("No option");



           }
       }


    }



    public static void addStudent(){
        System.out.println("Add student");

    }
    public static void deleteStudent(){
        System.out.println("Delete student");

    }
    public static void modifyStudent(){
        System.out.println("Modify student");

    }
    public static void searchStudent(){
        System.out.println("Search student");

    }

}
