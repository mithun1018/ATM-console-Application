package ATM_Console_Application;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            while(true) {
                System.out.println("are you a user or admin\n1.User\n2.Admin\nenter your access:");
                int access_inp = scan.nextInt();
                if (access_inp == 2) {
                    System.out.println("enter your Admin id:");
                    String input_id = scan.next();
                    //int x=Integer.parseInt(variable);
                    // nextline ->  int Integer.parseInt() //wrapper
                    if (input_id.equals(Admin_info.getAdmin_id())) {
                        int j=0;
                        while (j<=2) {
                            Scanner s1 = new Scanner(System.in);
                            System.out.println("enter your Admin pin:");
                            String input_pin = s1.nextLine();
                            if (input_pin.equals(Admin_info.getAdmin_pin()))
                            {
                                Admin admin=new Admin();
                                admin.print();
                            }
                            else {
                                System.out.println("wrong pin");
                                j++;
                            }
                        }
                    }
                    else{
                        System.out.println("invalid id");
                        continue;
                    }
                }
            }
        }
    }

