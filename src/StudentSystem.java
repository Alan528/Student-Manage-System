import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {


    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("-------Welcome to the Student manager System--------");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Modify");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            int choes = sc.nextInt();
            switch (choes) {
                case 1 -> add(list);
                case 2 -> delete(list);
//                case 3 -> modify(list);
                case 4 -> search(list);
                case 5 -> {
                    break loop;
                }
                default -> System.out.println("No option");
            }
        }


    }

    public static void add(ArrayList<Student> list) {
        //利用空参构造创建学生对象
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        String ID = null;
        while (true) {
            System.out.println("Please enter ID");
            ID = sc.next();
            if (contain(list, ID)) {
                System.out.println("This ID has Identify, Please enter other one");

            } else {
                s.setId(ID);
                break;
            }
        }


        System.out.println("Please enter Name");
        String Name = sc.next();
        s.setName(Name);
        System.out.println("Please enter Age");
        int Age = sc.nextInt();
        s.setAge(Age);
        System.out.println("Please enter Address");
        String Address = sc.next();
        s.setAddress(Address);

        list.add(s);
        System.out.println("Student info added");

    }

    public static void delete(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ID you want to delete");
        String deleteID = sc.next();
        int index = getIndex(list,deleteID);
        if (index>=0){
            list.remove(index);
            System.out.println("Removed "+deleteID);
        }else {
            System.out.println("There is no "+deleteID);
        }



    }

    public static void modify(ArrayList<Student> list) {

    }

    public static void search(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("There is no info");

        } else {
            System.out.println("ID\t\tName\t\tAge\t\tAddress");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getAddress());

            }
        }
    }


    public static boolean contain(ArrayList<Student> arrayList, String ID) {
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            String sid = stu.getId();
            if (sid.equals(ID)) {
                return true;
            }

        }
        return false;



    }


    public static int getIndex(ArrayList<Student> list, String deleteID){
        for (int i = 0; i < list.size(); i++) {
           Student stu = list.get(i);
           String sid = stu.getId();
           if (deleteID.equals(sid)){
               return i;
           }



        }
        return -1;
    }


}