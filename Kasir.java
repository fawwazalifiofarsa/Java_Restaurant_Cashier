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
        String[] menuCategories = {
            "Fried Rice", 
            "Fried Chicken", 
            "Hamburger",
            "Pasta",
            "Appetizer",
            "Juice",
            "Milkshake",
            "Tea",
            "Mineral Water",
            "Salad",
            "Ice Cream"
        };
        String[][] menu = {
        
            // Main Dish - Fried Rice Pax
            { "Original Fried Rice (Spicy/Medium/Normal)", "Rp. 12,000", "12000", menuTypes[0], menuCategories[0] },
            { "Javanese Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0] },
            { "Seafood Fried Rice (Spicy/Medium/Normal)", "Rp. 17,000", "17000", menuTypes[0], menuCategories[0] },
            { "Goat Fried Rice (Spicy/Medium/Normal)", "Rp. 20,000", "20000", menuTypes[0], menuCategories[0] },
            { "Crazy Fried Rice (Spicy/Medium/Normal)", "Rp. 17,000", "17000", menuTypes[0], menuCategories[0] },
            { "Sausage Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0] },
            { "MeatBall Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0] },
            { "Chicken Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0] },
            { "Pete Fried Rice (Spicy/Medium/Normal)", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0] },
            { "Babat Fried Rice (Spicy/Medium/Normal)", "Rp. 20,000", "20000", menuTypes[0], menuCategories[0] },
            { "Special Fried Rice (Spicy/Medium/Normal)", "Rp. 25,000", "25000", menuTypes[0], menuCategories[0] },
        
            // Main Dish - Fried Chicken Pax
            { "Fried Chicken Original", "Rp. 22,000", "22000", menuTypes[0], menuCategories[1] },
            { "Fried Chicken Mentai", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1] },
            { "Fried Chicken BBQ", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1] },
            { "Fried Chicken Teriyaki", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1] },
            { "Fried Chicken Spicy", "Rp. 22,000", "22000", menuTypes[0], menuCategories[1] },
            { "Fried Chicken Salted Egg", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1] },
            { "Fried Chicken Black Pepper", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1] },
        
            // Main Dish - Hamburger Pax
            { "Classic Beef Burger", "Rp. 15,000", "15000", menuTypes[0], menuCategories[2] },
            { "Fish Fillet Burger", "Rp. 15,000", "15000", menuTypes[0], menuCategories[2] },
            { "Cheese Burger", "Rp. 17,000", "17000", menuTypes[0], menuCategories[2] },
            { "Double Cheese Burger", "Rp. 20,000", "20000", menuTypes[0], menuCategories[2] },
            { "Mushroom Swiss Burger", "Rp. 22,000", "22000", menuTypes[0], menuCategories[2] },
            { "Mozzarella Cheese Burger", "Rp. 25,000", "25000", menuTypes[0], menuCategories[2] },
            { "BBQ Beef Burger", "Rp. 22,000", "22000", menuTypes[0], menuCategories[2] },
        
            // Main Dish - Pasta Pax
            { "Lasagne", "Rp. 15,000", "15000", menuTypes[0], menuCategories[3] },
            { "Spaghetti in Tomato Sauce", "Rp. 15,000", "15000", menuTypes[0], menuCategories[3] },
            { "Chicken and Linguini", "Rp. 15,000", "15000", menuTypes[0], menuCategories[3] },
            { "Pasta and Tomato Sauce", "Rp. 12,000", "12000", menuTypes[0], menuCategories[3] },
        
            // Side Dish - Appetizer
            { "Dimsum", "Rp. 3,500/pcs", "3500", menuTypes[1], menuCategories[4] },
            { "Dumpling", "Rp. 3,500/pcs", "3500", menuTypes[1], menuCategories[4] },
            { "Bakwan", "Rp. 2,000/pcs", "2000", menuTypes[1], menuCategories[4] },
            { "Pempek", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4] },
            { "Mendoan", "Rp. 3,000/pcs", "3000", menuTypes[1], menuCategories[4] },
            { "French Fries Large", "Rp. 10,000", "10000", menuTypes[1], menuCategories[4] },
            { "French Fries Medium", "Rp. 8,000", "8000", menuTypes[1], menuCategories[4] },
            { "French Fries Small", "Rp. 5,000", "5000", menuTypes[1], menuCategories[4] },
            { "Potato Chip", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4] },
            { "Fried Tofu", "Rp. 2,000/pcs", "2000", menuTypes[1], menuCategories[4] },
            { "Macaroni", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4] },
            { "Waffle", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4] },
            { "Egg (Sunny Side Up/Omelet/half boiled egg)", "Rp. 5,000/pcs", "5000", menuTypes[1], menuCategories[4] },
            { "Rice", "Rp. 3,000/portion", "3000", menuTypes[1], menuCategories[4] },

            // Beverage - Juice
            { "Apple Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Mango Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Avocado Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Strawberry Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Orange Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Pineapple Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Beetroot Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Tomato Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Grapefruit Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
            { "Watermelon Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5] },
        
            // Beverage - Milkshake
            { "Vanilla Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Chocolate Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Strawberry Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Banana Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Mango Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Caramel Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Coconut Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Oreo Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
            { "Milo Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6] },
        
            // Beverage - Tea
            { "Iced Tea", "Rp. 8,000", "8000", menuTypes[2], menuCategories[7] },
            { "Hot Tea", "Rp. 8,000", "8000", menuTypes[2], menuCategories[7] },
            { "Black Tea", "Rp. 10,000", "10000", menuTypes[2], menuCategories[7] },
            { "Green Tea", "Rp. 10,000", "10000", menuTypes[2], menuCategories[7] },
        
            // Beverage - Mineral Water
            { "Mineral Water", "Rp. 5,000", "5000", menuTypes[2], menuCategories[8] },

            // Dessert - Salad
            { "Salad", "Rp. 10,000", "10000", menuTypes[3], menuCategories[9] },

            // Dessert - Ice Cream
            { "Vanilla Ice Cream", "Rp. 10,000", "10000", menuTypes[3], menuCategories[10] },
            { "Chocolate Ice Cream", "Rp. 10,000", "10000", menuTypes[3], menuCategories[10] },
            { "Strawberry Ice Cream", "Rp. 10,000", "10000", menuTypes[3], menuCategories[10] },
            { "Caramel Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10] },
            { "Mocha Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10] },
            { "Mint Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10] },
            { "Macha Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10] },
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
                totalPrice = chooseMenu(menu, menuTypes, menuCategories);

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
        String[] menuCategories
    ) {
        Scanner input = new Scanner(System.in);
        int menuIndex, menuTypesIndex;
        double totalPrice = 0.0;
        int amount;
        int[] index = new int[menu.length];
        String orderMore;  
        boolean 
            checkMenuIndex = true, 
            checkMenuTypesIndex = true;

        // Choose menu.
        while (true) {
            System.out.println("                --------- Happy Christmas!!! ---------                ");
            System.out.println("Get your discount by spending Rp. 500.000 or more in this restaurant.");
            System.out.println("This discount will reduce your cost by 20%, so Happy Chrimast everybody! :D");
            System.out.println("=======================================");
            System.out.println();
            menuTypeHorizontalGrid();
            System.out.printf("| %-3s| %-15s|%n", "ID", "Menu Type");
            menuTypeHorizontalGrid();
            for (int i = 0; i < menuTypes.length; i++) {
                System.out.printf("| %-3s| %-15s|%n", (i+1), menuTypes[i]);
            }
            menuTypeHorizontalGrid();
            while (checkMenuTypesIndex) {
                System.out.print("Please choose your type : ");
                menuTypesIndex = input.nextInt();
                if (menuTypesIndex > menuTypes.length) {
                    System.out.println("Please choose available type.");
                    continue;
                } else {
                    System.out.println("0. Back");
                    int validIndexCount = 0;
                    menuHorizontalGrid();
                    System.out.printf("| %-3s| %-45s| %-20s| %-20s|%n", "ID", "Menu Item", "Category", "Price");
                    menuHorizontalGrid();

                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i][3].equals(menuTypes[menuTypesIndex - 1])) {
                            System.out.printf("| %-3s| %-45s| %-20s| %-20s|%n", (i+1), menu[i][0], menu[i][4], menu[i][1]);
                            index[validIndexCount] = (i + 1);
                            validIndexCount++;
                        }
                    }
                    menuHorizontalGrid();
                    checkMenuTypesIndex = false;
                }
            }

            // Choose a menu
            while (checkMenuIndex) {
                System.out.print("Please choose your menu : ");
                menuIndex = input.nextInt();

                // Check if the input menuIndex is within the valid range
                boolean isValidIndex = false;
                for (int i = 0; i < index.length; i++) {
                    if (menuIndex == index[i]) {
                        isValidIndex = true;
                        checkMenuIndex = false;
                    }
                }

                // Check if the selected menuIndex is valid
                if (isValidIndex) {
                    System.out.println("=======================================");
                    System.out.println(menu[menuIndex-1][0] + " = " + menu[menuIndex-1][1]);
                    System.out.print("Total amount: ");
                    amount = input.nextInt();
                    totalPrice += Integer.parseInt(menu[menuIndex-1][2]) * amount;
                    System.out.println("Total Price : Rp. " + totalPrice);
                    System.out.println("=======================================");
                } else {
                    System.out.println("Please choose the available menus.");
                } 
            }

            // Choose to order more or not.
            while (true) {
                System.out.print("Do you want to order more? (y/n) : ");
                orderMore = input.next();

                if (orderMore.equalsIgnoreCase("n")) {
                    double 
                        discount=0,
                        beforeDis = totalPrice;
                    if (totalPrice>500000) {
                        discount = beforeDis * 0.2;
                        totalPrice = beforeDis - discount;
                        System.out.println("Congratulation for your discount!");
                        System.out.println("Total price : Rp. " + totalPrice);
                        System.out.println("You save Rp. " + (beforeDis - totalPrice) + " of your money");
                        System.out.println("=======================================");
                    } 
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

    public static void menuHorizontalGrid() {
        System.out.printf("+%-4s+%-46s+%-21s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "---------------------");
    }

    public static void menuTypeHorizontalGrid() {
        System.out.printf("|%-4s|%-16s|%n", "----", "----------------");
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