package Java_Restaurant_Cashier;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {

        // Variables declaration.
        Scanner input = new Scanner(System.in);
        String[][] menu = {{"Fried Rice Pax", "Rp. 22000", "22000"},
                            {"Fried Chicken Pax", "Rp. 23000", "23000"},
                            {"Hamburger Pax", "Rp. 24000", "24000"}};
        String[][] user = {{ "fawwaz", "fawwaz"},
                            {"ekya" , "ekya"},
                            { "raul", "raul"}};
        String username,
                password,
                orderMore;
        int table = 3,
                id_payment_type,
                id_menu = 1,
                customer = 1,
                amount;
        double total_price = 0.0,
                todays_income = 0.0,
                payment,
                change;
        boolean checkUser = true;

        // Input username and password to login.
        while (checkUser) {
            System.out.println("Please login first.");
            System.out.println("=======================================");
            System.out.print("Username  : ");
            username = input.next();
            System.out.print("Password  : ");
            password = input.next();
            System.out.println("=======================================");
            // Check if the username and password is correct.
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user[i].length; j++) {
                    if (user[i][0].equals(username) && user[i][j].equals(password)) {
                        checkUser = false;
                    }
                }
            }
        }
        // Check if there's table available.
        for (int i = 0 ; i < customer ; i++){
            System.out.println("Customer " + customer);
            System.out.println("Checking if there's table available...");
            if (table != 0) {
                table--;
                System.out.println(table + " Table available.");
                System.out.println("=======================================");

                // Choose menu.
                while (id_menu != 0) {
                    System.out.println("0. Pay\n1. Fried Rice Pax \n2. Fried Chicken Pax \n3. Hamburger Pax");
                    System.out.print("Please choose your menu : ");
                    id_menu = input.nextInt();
                    switch (id_menu) {
                        case 0:
                            System.out.println("=======================================");
                            System.out.println("Checkout");
                            System.out.println("Total Price : " + total_price);
                            System.out.println("=======================================");
                            continue;
                        case 1:
                            System.out.println("=======================================");
                            System.out.println(menu[0][0] + " = " + menu[0][1]);
                            System.out.print("Total amount: ");
                            amount = input.nextInt();
                            total_price = total_price + Integer.parseInt(menu[0][2]) * amount;
                            System.out.println("Total Price : Rp. " + total_price);
                            System.out.println("=======================================");
                            break;
                        case 2:
                            System.out.println("=======================================");
                            System.out.println(menu[1][0] + " = " + menu[1][1]);
                            System.out.print("Total amount: ");
                            amount = input.nextInt();
                            total_price = total_price + Integer.parseInt(menu[1][2]) * amount;
                            System.out.println("Total Price : Rp. " + total_price);
                            System.out.println("=======================================");
                            break;
                        case 3:
                            System.out.println("=======================================");
                            System.out.println(menu[2][0] + " = " + menu[2][1]);
                            System.out.print("Total amount: ");
                            amount = input.nextInt();
                            total_price = total_price + Integer.parseInt(menu[2][2]) * amount;
                            System.out.println("Total Price : Rp. " + total_price);
                            System.out.println("=======================================");
                            break;
                        default:
                            System.out.println("=======================================");
                            System.out.println("Please select available menu.");
                            System.out.println("=======================================");
                    }

                    // Choose to order more or not.
                    while (true) {
                        System.out.println("Do you want to order more? (y/n)");
                        System.out.print("Your answer : ");
                        orderMore = input.next();

                        if (orderMore.equalsIgnoreCase("n")) {
                            System.out.println("Please choose payment type.");
                            break;
                        } else if (orderMore.equalsIgnoreCase("y")) {
                            System.out.println("Please choose your menu : ");
                            break;
                        } else {
                            System.out.println("Please answer (y/n)");
                        }
                    }
                    if (orderMore.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                // Choose payment type.
                System.out.println("1. Cash \n2. Debit");
                System.out.print("Input payment type ID : ");
                id_payment_type = input.nextInt();

                // Cash payment type.
                if (id_payment_type == 1) {
                    System.out.println("=======================================");
                    System.out.println("Total price           : " + total_price);
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
                        todays_income += total_price;
                        total_price = 0.0;
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
                break;
            }
            todays_income+= total_price;
            customer++;
        }
        System.out.println("Today's income is : Rp. " + todays_income);
    }
}