package ATM_Console_Application;
import java.util.Scanner;
import java.util.ArrayList;
public class Admin {
        public static ArrayList<User> userarray = new ArrayList<User>();
        Scanner scan = new Scanner(System.in);

        public void print() {

            System.out.println("your choice \n1.Add user Account\n2.Delete your account\n3.View Transaction history\nEnter your choice:");
            int admin_choice = scan.nextInt();
            if (admin_choice == 1) {
                Admin.add_user();
            }
        }

        public static void add_user() {
            Scanner scan = new Scanner(System.in);

            User user = new User();
            System.out.println("enter user name");
            String enterUsername = scan.next();
            System.out.println("enter user pin");
            String enterUserpin=scan.next();
            user.username=enterUsername;
            user.password=enterUserpin;
            userarray.add(user);
            System.out.println("user "+userarray.toString());
            System.exit(0);

        }
    }

