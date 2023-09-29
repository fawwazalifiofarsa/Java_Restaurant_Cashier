package TA_Kasir;

import java.util.Scanner;

public class Kasir2 {
    public static void main(String[] args) {

        // Variables declaration.
        Scanner input = new Scanner(System.in);
        String username, password;
        int table = 2, id_menu, id_payment_type;
        double total_price, payment, change;

        // Input username and password to login.
        System.out.println("Please login first.");
        System.out.println("=======================================");
        System.out.print("Username  : ");
        username = input.nextLine();
        System.out.print("Password  : ");
        password = input.nextLine();
        System.out.println("=======================================");

        // Check if the username and password is correct.
        if (username.equals("kel6") && password.equals("kel6")) {
            System.out.println("Login success.");
            System.out.println("=======================================");

            // Check if there's table available.
            System.out.println("Checking if there's table available...");
            if (table != 0) {
                System.out.println("Table available.");
                System.out.println("=======================================");

                // Choose menu.
                System.out.println("1. Fried Rice Pax \n2. Fried Chicken Pax \n3. Hamburger Pax");
                System.out.print("Please choose your menu : ");
                id_menu = input.nextInt();
                switch (id_menu) {
                    case 1:
                        System.out.println("=======================================");
                        System.out.println("Fried Rice Pax");
                        total_price = 22000;
                        System.out.println("Total Price : " + total_price);
                        System.out.println("=======================================");

                        // Choose payment type
                        System.out.println("Please choose payment type.");
                        System.out.println("1. Cash \n2. Debit");
                        System.out.print("Input payment type ID : ");
                        id_payment_type = input.nextInt();
                        switch (id_payment_type) {
                            case 1:
                                System.out.println("=======================================");
                                System.out.print("Input payment nominal : ");
                                payment = input.nextDouble();
                                if (payment >= total_price) {
                                    change = payment - total_price;
                                    System.out.println("Change                : " + change);
                                    System.out.println("=======================================");
                
                                    // Print the receipt.
                                    System.out.println("Printing receipt...");
                                    System.out.println("Thanks for the purchase!");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("Please input the correct nominal.");
                                    System.out.println("=======================================");
                                }
                                break;

                            case 2:
                                // Print the receipt.
                                System.out.println("=======================================");
                                System.out.println("Printing receipt...");
                                System.out.println("Thanks for the purchase!");
                                System.out.println("=======================================");
                                break;

                            default:
                                System.out.println("Please choose available payment type.");
                                System.exit(0);
                        }
                        break;

                    case 2:
                        System.out.println("=======================================");
                        System.out.println("Fried Chicken Pax");
                        total_price = 23000;
                        System.out.println("Total Price : " + total_price);
                        System.out.println("=======================================");

                        // Choose payment type
                        System.out.println("Please choose payment type.");
                        System.out.println("1. Cash \n2. Debit");
                        System.out.print("Input payment type ID : ");
                        id_payment_type = input.nextInt();
                        switch (id_payment_type) {
                            case 1:
                                System.out.println("=======================================");
                                System.out.print("Input payment nominal : ");
                                payment = input.nextDouble();
                                if (payment >= total_price) {
                                    change = payment - total_price;
                                    System.out.println("Change                : " + change);
                                    System.out.println("=======================================");
                
                                    // Print the receipt.
                                    System.out.println("Printing receipt...");
                                    System.out.println("Thanks for the purchase!");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("Please input the correct nominal.");
                                    System.out.println("=======================================");
                                }
                                break;

                            case 2:
                                // Print the receipt.
                                System.out.println("=======================================");
                                System.out.println("Printing receipt...");
                                System.out.println("Thanks for the purchase!");
                                System.out.println("=======================================");
                                break;

                            default:
                                System.out.println("=======================================");
                                System.out.println("Please choose available payment type.");
                                System.out.println("=======================================");
                                System.exit(0);
                        }
                        break;

                    case 3:
                        System.out.println("=======================================");
                        System.out.println("Hamburger Pax");
                        total_price = 24000;
                        System.out.println("Total Price : " + total_price);
                        System.out.println("=======================================");

                        // Choose payment type.
                        System.out.println("Please choose payment type.");
                        System.out.println("1. Cash \n2. Debit");
                        System.out.print("Input payment type ID : ");
                        id_payment_type = input.nextInt();
                        switch (id_payment_type) {

                            // Cash payment type.
                            case 1:
                                System.out.println("=======================================");
                                System.out.print("Input payment nominal : ");
                                payment = input.nextDouble();
                                if (payment >= total_price) {
                                    change = payment - total_price;
                                    System.out.println("Change                : " + change);
                                    System.out.println("=======================================");
                
                                    // Print the receipt.
                                    System.out.println("Printing receipt...");
                                    System.out.println("Thanks for the purchase!");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("Please input the correct nominal.");
                                    System.out.println("=======================================");
                                }
                                break;

                            // Debit payment type.
                            case 2:

                                // Print the receipt.
                                System.out.println("=======================================");
                                System.out.println("Printing receipt...");
                                System.out.println("Thanks for the purchase!");
                                System.out.println("=======================================");
                                break;

                            // Payment type unavailable
                            default:
                                System.out.println("=======================================");
                                System.out.println("Please choose available payment type.");
                                System.out.println("=======================================");
                                System.exit(0);
                        }
                        break;

                    // Menu unavailable.
                    default:
                        System.out.println("=======================================");
                        System.out.println("Please select available menu.");
                        System.out.println("=======================================");
                        System.exit(0);
                }

            // Table unavailable
            } else {
                System.out.println("There's no table available.");
                System.out.println("=======================================");
            }
        
        // Incorrect user login
        } else {
            System.out.println("Incorrect username or password.");
            System.out.println("=======================================");
        }
    }
}