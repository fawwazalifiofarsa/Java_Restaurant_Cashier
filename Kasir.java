package Java_Restaurant_Cashier;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {

        // Variables declaration.
        Scanner input = new Scanner(System.in);

        String username, TrueUsername, TruePassword, password, horizonline, OrderMore;
        int table = 2, id_payment_type, menu1, menu2, menu3, id_menu;
        double total_price = 0.0, payment, change;

        TrueUsername = "kelompok6";
        TruePassword = "kelompok6";
        horizonline = "=======================================";

        // Input username and password to login.
        while (true) {
        System.out.println("Please login first.");
        System.out.println(horizonline);
        System.out.print("Username  : ");
        username = input.nextLine();
        System.out.print("Password  : ");
        password = input.nextLine();
        System.out.println("=======================================");
        // Check if the username and password is correct.
        if (username.equals(TrueUsername) && password.equals(TruePassword)){
            System.out.println("Login success.");
            System.out.println("=======================================");
            break;
        }if (!username.equals(TrueUsername) && !password.equals(TruePassword))  {
            System.out.println("Wrong username and password");
            System.out.println("=======================================");
        } else {
            System.out.println("Wrong username or password");
            System.out.println("=======================================");
        }
        }
            // Check if there's table available.
            System.out.println("Checking if there's table available...");
            if (table != 0) {
                System.out.println("Table available.");
                System.out.println("=======================================");

                // Choose menu.
                while (true) {
                System.out.println("1. Fried Rice Pax \n2. Fried Chicken Pax \n3. Hamburger Pax");
                System.out.print("Please choose your menu : ");
                id_menu = input.nextInt();
                input.nextLine();
                switch (id_menu) {
                    case 1:
                        System.out.println("=======================================");
                        System.out.println("Fried Rice Pax = Rp.22000");
                        menu1 = 22000;
                        total_price = total_price + menu1;
                        System.out.println("Total Price : " + total_price);
                        System.out.println("=======================================");
                        break;
                    case 2: 
                        System.out.println("=======================================");
                        System.out.println("Fried Chicken Pax = Rp.23000");
                        menu2 = 23000;
                        total_price = total_price + menu2;
                        System.out.println("Total Price : " + total_price);
                        System.out.println("=======================================");
                        break;
                    case 3:
                        System.out.println("=======================================");  
                        System.out.println("Hamburger Pax = Rp.24000");
                        menu3 = 24000;
                        total_price = total_price + menu3;
                        System.out.println("Total Price : " + total_price);
                        System.out.println("=======================================");
                        break;
                    default:
                        System.out.println("=======================================");
                        System.out.println("Please select available menu.");
                        System.out.println("=======================================");
                    }

                    //Choose to order more or not
                    while (true) {
                        System.out.println("Do you want to order more? (y/n)");
                        System.out.print("Your answer : ");
                        OrderMore = input.nextLine();
                        
                        if (OrderMore.equalsIgnoreCase("n")) {
                        System.out.println("Please choose payment type.");
                        break;
                        }else if (OrderMore.equalsIgnoreCase("y")) {
                        System.out.println("Please choose your menu : ");
                        break;
                        }else {
                        System.out.println("Please answer (y/n)");
                        }
                    }
                    if (OrderMore.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                // Choose payment type.
                System.out.println("1. Cash \n2. Debit");
                System.out.print("Input payment type ID : ");
                id_payment_type = input.nextInt();

                // Cash payment type.
                if (id_payment_type == 1 ){
                    System.out.println("=======================================");
                    System.out.print("Input payment nominal : ");
                    payment = input.nextInt();
                    change = payment - total_price;

                    // Print the receipt.
                    if (payment - total_price >= 0) {
                        System.out.println("Change                : " + change);
                        System.out.println("=======================================");
                        System.out.println("Printing receipt...");
                        System.out.println("Thanks for the purchase!");
                        System.out.println("=======================================");
                    } else {
                        System.out.println("=======================================");
                        System.out.println("Please input the correct nominal.");
                        System.out.println("=======================================");
                    }

                // Debit payment type.
                } else if (id_payment_type == 2) {
                    System.out.println("=======================================");
                    System.out.println("Printing receipt...");
                    System.out.println("Thanks for the purchase!");
                    System.out.println("=======================================");

                // Unavailable payment type.
                } else {
                    System.out.println("=======================================");
                    System.out.println("Please choose available payment type.");
                    System.out.println("=======================================");
                }

            // Table unavailable.
            } else {
                System.out.println("There's no table available.");
                System.out.println("=======================================");
            }
        
    }
}  
