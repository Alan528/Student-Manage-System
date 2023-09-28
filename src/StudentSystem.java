import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {


    public static void main(String[] args) {

        ArrayList <Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        loop: while (true) {
            System.out.println("-------Welcome to the Student manager System--------");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Modify");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            int choes = sc.nextInt();
            switch (choes) {
//                case 1 -> add(list);
//                case 2 -> delete(list);
//                case 3 -> modify(list);
                case 4 -> search(list);
                case 5 -> {
                    break loop;
                }
                default -> System.out.println("No option");
            }
        }


    }

    public static void add(ArrayList<Student>list){

    }

    public static void delete(ArrayList<Student> list){

    }
    public static void modify(ArrayList<Student> list){

    }
    public static void search(ArrayList<Student> list){
        if (list.isEmpty()){
            System.out.println("There is no info");

        }else {
            System.out.println("ID\t\tName\t\tAge\t\tAddress");
            for (int i=0; i<list.size();i++){
                Student stu = list.get(i);
                System.out.println("ID\t\tName\t\tAge\t\tAddress");

            }
        }
    }




















}