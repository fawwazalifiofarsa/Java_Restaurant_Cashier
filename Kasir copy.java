package Java_Restaurant_Cashier;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {

        // Variables declaration.
        Scanner input = new Scanner(System.in);
        String[] menuTypes = {
            "Main Dish",
            "Side Dish", 
            "Beverages",
            "Dessert"
        };
        String[] mainDishCategories = {
            "Fried Rice", 
            "Fried Chicken", 
            "Hamburger",
            "Pasta",
        };
        String[] sideDishCategories = {
            "Appetizer",
            "Salad",
        };
        String[] beveragesCategories = {
            "Juice",
            "Milkshake",
            "Tea",
            "Mineral Water",

        };
        String[] dessertCategories = {
            "Ice Cream"
        };
        String[][] menu = {

            // Exit - Checkout
            {"Checkout", "exit", ""},
        
            // Main Dish - Fried Rice Pax
            { "Original Fried Rice (Spicy/Medium/Normal)", "Rp. 12,000", "12000", menuTypes[0], mainDishCategories[0] },
            { "Javanese Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[0] },
            { "Seafood Fried Rice (Spicy/Medium/Normal)", "Rp. 17,000", "17000", menuTypes[0], mainDishCategories[0] },
            { "Goat Fried Rice (Spicy/Medium/Normal)", "Rp. 20,000", "20000", menuTypes[0], mainDishCategories[0] },
            { "Crazy Fried Rice (Spicy/Medium/Normal)", "Rp. 17,000", "17000", menuTypes[0], mainDishCategories[0] },
            { "Sausage Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[0] },
            { "MeatBall Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[0] },
            { "Chicken Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[0] },
            { "Pete Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[0] },
            { "Babat Fried Rice (Spicy/Medium/Normal)", "Rp. 20,000", "20000", menuTypes[0], mainDishCategories[0] },
            { "Special Fried Rice (Spicy/Medium/Normal)", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[0] },
        
            // Main Dish - Fried Chicken Pax
            { "Fried Chicken Original", "Rp. 22,000", "22000", menuTypes[0], mainDishCategories[1] },
            { "Fried Chicken Mentai", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[1] },
            { "Fried Chicken BBQ", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[1] },
            { "Fried Chicken Teriyaki", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[1] },
            { "Fried Chicken Spicy", "Rp. 22,000", "22000", menuTypes[0], mainDishCategories[1] },
            { "Fried Chicken Salted Egg", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[1] },
            { "Fried Chicken Black Pepper", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[1] },
        
            // Main Dish - Hamburger Pax
            { "Classic Beef Burger", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[2] },
            { "Fish Fillet Burger", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[2] },
            { "Cheese Burger", "Rp. 17,000", "17000", menuTypes[0], mainDishCategories[2] },
            { "Double Cheese Burger", "Rp. 20,000", "20000", menuTypes[0], mainDishCategories[2] },
            { "Mushroom Swiss Burger", "Rp. 22,000", "22000", menuTypes[0], mainDishCategories[2] },
            { "Mozzarella Cheese Burger", "Rp. 25,000", "25000", menuTypes[0], mainDishCategories[2] },
            { "BBQ Beef Burger", "Rp. 22,000", "22000", menuTypes[0], mainDishCategories[2] },
        
            // Main Dish - Pasta Pax
            { "Lasagne", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[3] },
            { "Spaghetti in Tomato Sauce", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[3] },
            { "Chicken and Linguini", "Rp. 15,000", "15000", menuTypes[0], mainDishCategories[3] },
            { "Pasta and Tomato Sauce", "Rp. 12,000", "12000", menuTypes[0], mainDishCategories[3] },
        
            // Side Dish - Appetizer
            { "Dimsum", "Rp. 3,500/pcs", "3500", menuTypes[1], sideDishCategories[0] },
            { "Dumpling", "Rp. 3,500/pcs", "3500", menuTypes[1], sideDishCategories[0] },
            { "Bakwan", "Rp. 2,000/pcs", "2000", menuTypes[1], sideDishCategories[0] },
            { "Pempek", "Rp. 10,000/portion", "10000", menuTypes[1], sideDishCategories[0] },
            { "Mendoan", "Rp. 3,000/pcs", "3000", menuTypes[1], sideDishCategories[0] },
            { "French Fries Large", "Rp. 10,000", "10000", menuTypes[1], sideDishCategories[0] },
            { "French Fries Medium", "Rp. 8,000", "8000", menuTypes[1], sideDishCategories[0] },
            { "French Fries Small", "Rp. 5,000", "5000", menuTypes[1], sideDishCategories[0] },
            { "Potato Chip", "Rp. 10,000/portion", "10000", menuTypes[1], sideDishCategories[0] },
            { "Fried Tofu", "Rp. 2,000/pcs", "2000", menuTypes[1], sideDishCategories[0] },
            { "Macaroni", "Rp. 10,000/portion", "10000", menuTypes[1], sideDishCategories[0] },
            { "Waffle", "Rp. 10,000/portion", "10000", menuTypes[1], sideDishCategories[0] },
            { "Egg (Sunny Side Up/Omelet/half boiled egg)", "Rp. 5,000/pcs", "5000", menuTypes[1], sideDishCategories[0] },
            { "Rice", "Rp. 3,000/portion", "3000", menuTypes[1], sideDishCategories[0] },

            // Side Dish - Salad
            { "Salad", "Rp. 10,000", "10000", menuTypes[3], sideDishCategories[1] },

            // Beverage - Juice
            { "Apple Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Mango Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Avocado Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Strawberry Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Orange Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Pineapple Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Beetroot Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Tomato Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Grapefruit Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
            { "Watermelon Juice", "Rp. 12,000", "12000", menuTypes[2], beveragesCategories[0] },
        
            // Beverage - Milkshake
            { "Vanilla Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Chocolate Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Strawberry Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Banana Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Mango Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Caramel Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Coconut Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Oreo Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
            { "Milo Milkshake", "Rp. 15,000", "15000", menuTypes[2], beveragesCategories[1] },
        
            // Beverage - Tea
            { "Iced Tea", "Rp. 8,000", "8000", menuTypes[2], beveragesCategories[2] },
            { "Hot Tea", "Rp. 8,000", "8000", menuTypes[2], beveragesCategories[2] },
            { "Black Tea", "Rp. 10,000", "10000", menuTypes[2], beveragesCategories[2] },
            { "Green Tea", "Rp. 10,000", "10000", menuTypes[2], beveragesCategories[2] },
        
            // Beverage - Mineral Water
            { "Mineral Water", "Rp. 5,000", "5000", menuTypes[2], beveragesCategories[3] },

            // Dessert - Ice Cream
            { "Vanilla Ice Cream", "Rp. 10,000", "10000", menuTypes[3], dessertCategories[0] },
            { "Chocolate Ice Cream", "Rp. 10,000", "10000", menuTypes[3], dessertCategories[0] },
            { "Strawberry Ice Cream", "Rp. 10,000", "10000", menuTypes[3], dessertCategories[0] },
            { "Caramel Ice Cream", "Rp. 12,000", "12000", menuTypes[3], dessertCategories[0] },
            { "Mocha Ice Cream", "Rp. 12,000", "12000", menuTypes[3], dessertCategories[0] },
            { "Mint Ice Cream", "Rp. 12,000", "12000", menuTypes[3], dessertCategories[0] },
            { "Macha Ice Cream", "Rp. 12,000", "12000", menuTypes[3], dessertCategories[0] },
        };
        String[][] user = {
            { "fawwaz", "fawwaz" },
            { "ekya", "ekya" },
            { "raul", "raul" }
        };
        String[] availableBank = {
            "Bank Mandiri",
            "Bank Rakyat Indonesia (BRI)",
            "Bank Central Asia (BCA)",
            "Bank Negara Indonesia (BNI)",
            "Bank Tabungan Negara (BTN)",
            "Bank CIMB Niaga",
            "Bank Danamon",
            "Bank Syariah Indonesia (BSI)",
            "Bank Permata",
            "Bank OCBC NISP",
            "Bank Panin"
        };
        String[] paymentType = {
            "Cash",
            "Debit Card"
        };
        String lineBreak = "=======================================";
        int 
            table = 2,
            paymentId,
            customer = 2;
        double 
            totalPrice,
            todays_income = 0.0;

        // Login with function
        login(user);

        // Check if there's table available.
        for (int i = 1; i <= customer; i++) {
            System.out.println("Customer " + customer);
            System.out.println("Checking if there's table available...");
            if (table != 0) {
                table--;
                System.out.println(table + " Table available.");
                System.out.println(lineBreak);

                // Choose menu with function
                totalPrice = chooseMenu(menu, menuTypes, mainDishCategories, sideDishCategories, beveragesCategories, dessertCategories);

                // Choose payment type.
                for (int j = 0; j < paymentType.length; j++) {
                    System.out.println((j + 1) + ". " + paymentType[j]);
                }
                System.out.print("Input payment type ID : ");
                paymentId = input.nextInt();

                // Cash payment type.
                if (paymentId == 1) {
                    Cash(lineBreak, totalPrice, todays_income);

                    // Debit payment type.
                } else if (paymentId == 2) {
                    Debit(availableBank, lineBreak, totalPrice, todays_income);

                // Unavailable payment type.
                } else {
                    System.out.println(lineBreak);
                    System.out.println("Please choose available payment type.");
                    System.out.println(lineBreak);
                }

                // Table unavailable.
            } else {
                System.out.println("There's no table available.");
                System.out.println(lineBreak);
                break;
            }
            todays_income += totalPrice;
            customer++;
        }
        System.out.println("Today's income is : Rp. " + todays_income);
    }

    public static void login(String[][] user) {

        Scanner input = new Scanner(System.in);
        boolean checkUser = true;
        String username, password;

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
                    if (user[i][0].equals(username) && user[i][1].equals(password)) {
                        checkUser = false;
                    }
                }
            }
            if (checkUser) {
                System.out.println("Username or password is incorrect. Please try again.");
                System.out.println("=======================================");
            }
        }

    }

    public static double chooseMenu(
        String[][] menu, 
        String[] menuTypes, 
        String[] mainDishCategories,
        String[] sideDishCategories,
        String[] beveragesCategories,
        String[] dessertCategories
    ) {
        Scanner input = new Scanner(System.in);
        int idMenu, idMenuTypes, idMenuCategories;
        double totalPrice = 0.0;
        int amount;
        String orderMore;

        // Choose menu.
        while (true) {
            for (int i = 0; i < menuTypes.length; i++) {
                System.out.println((i+1) + ". " + menuTypes[i]);
            }
            System.out.print("Please choose your menu : ");
            idMenuTypes = input.nextInt();
            if (idMenuTypes == 1) {
                System.out.println("0. Back");
                for (int j = 0; j < menuCategories.length; j++) {
                    System.out.println((j+1) + ". " + menuCategories[j]);
                }
            }
            for (int p = 0; p < menu.length; p++) {
                System.out.println(p + ". " + menu[p][0] + " = " + menu[p][1]);
            }
            System.out.print("Please choose your menu : ");
            idMenu = input.nextInt();

            if (idMenu == 0) {
                System.out.println("=======================================");
                System.out.println("Checkout");
                System.out.println("Total Price: " + totalPrice);
                System.out.println("=======================================");
            } else if (idMenu >= 1 && idMenu <= menu.length) {
                System.out.println("=======================================");
                System.out.println(menu[idMenu][0] + " = " + menu[idMenu][1]);
                System.out.print("Total amount: ");
                amount = input.nextInt();
                totalPrice += Integer.parseInt(menu[idMenu][2]) * amount;
                System.out.println("Total Price : Rp. " + totalPrice);
                System.out.println("=======================================");
            } else {
                System.out.println("=======================================");
                System.out.println("Please select available menu.");
                System.out.println("=======================================");
                continue;
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
        return totalPrice;
    }

    public static double Debit(
        String[] availableBank, 
        String lineBreak, 
        double totalPrice, 
        double todays_income
    ) {
        Scanner input = new Scanner(System.in);
        int bankId;
        boolean checkBank = true;

        // Display available banks.
        for (int j = 0; j < availableBank.length; j++) {
            System.out.println((j + 1) + ". " + availableBank[j]);
        }
        while (checkBank) {
            System.out.print("Input Bank ID : ");
            bankId = input.nextInt();
            for (int j = 0; j < availableBank.length; j++) {
                if (bankId == (j+1)) {
                    System.out.println(lineBreak);
                    System.out.println("Bank        : " + availableBank[j]);
                    System.out.println("Total price : " + totalPrice);
                    System.out.println("Printing receipt...");
                    System.out.println("Thanks for the purchase!");
                    System.out.println(lineBreak);
                    checkBank = false; 
                    todays_income += totalPrice;
                    totalPrice = 0.0;
                }

            // Bank unavailable.
            }
            if (bankId >= availableBank.length) {
                System.out.println(lineBreak);
                System.out.println("Please choose available bank.");
                System.out.println(lineBreak);
            }
        }
        return todays_income;
    }

    public static double Cash(
        String lineBreak, 
        double totalPrice, 
        double todays_income
    ) {
        Scanner input = new Scanner(System.in);
        double paymentAmount, change;

        System.out.println(lineBreak);
        System.out.println("Total price           : " + totalPrice);
        System.out.print("Input payment nominal : ");
        paymentAmount = input.nextInt();
        change = paymentAmount - totalPrice;

        // Print the receipt.
        while (paymentAmount - totalPrice < 0) {
            System.out.println(lineBreak);
            System.out.println("Please input the correct nominal.");
            System.out.println(lineBreak);
        }
        System.out.println("Change                : " + change);
        System.out.println(lineBreak);
        System.out.println("Printing receipt...");
        System.out.println("Thanks for the purchase!");
        System.out.println(lineBreak);
        todays_income += totalPrice;
        totalPrice = 0.0;

        return todays_income;
    }
}