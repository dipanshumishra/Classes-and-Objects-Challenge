import java.util.Scanner;

public class Employee {

    public static class details
    {
        int year;
        String name,address;
        float salary;

        public void getInput() {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter Your name :: ");
            name= in.next();
            System.out.print("Enter the year of joining:: ");
            year = in.nextInt();
            System.out.print("Enter your salary :: ");
            salary = in.nextInt();
            System.out.println("Enter your Address ::");
            address = in.next();
        }

        public void display() {

            System.out.println("Name Year of joining Salary Address :" +name+ "\t" +year+ "\t" +salary+ "\t" +address);

        }
    }


    public static void main(String[] args) {

        details e[] = new details[3];

        for(int i=0; i<3; i++) {


            e[i].getInput();
        }

        for(int i=0; i<3; i++) {

            e[i].display();
        }
    }
}