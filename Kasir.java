package Java_Restaurant_Cashier;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {

        // Variables declaration.
        Scanner input = new Scanner(System.in);

        String[] roles = {
            "Cashier",
            "Administrator",
            "Manager"
        };
        String[][] user = {
            { "fawwaz", "fawwaz", roles[0] },
            { "ekya", "ekya", roles[1] },
            { "raul", "raul", roles[2] }
        };
        String 
            userAuthorization = null;

        // Login with function
        userAuthorization = login(input, user, userAuthorization);
        if (userAuthorization == roles[0]) {
            cashierActions(input);
        } else if (userAuthorization == roles[1]) {
            System.out.println("(ERROR) No available action.");
        } else if (userAuthorization == roles[2]) {
            System.out.println("(ERROR) No available action.");
        }
    }
    
    // Functions Initialization

    public static void cashierActions (
        Scanner input
    ) {
<<<<<<< HEAD
        int
            table = 2,
            customer = 1,
            inputAction;

        System.out.println("1. Process Transaction");
        System.out.println("2. Input Tables");
        System.out.println("3. View Sales Reports");
        System.out.print("Select your action : ");
        inputAction = input.nextInt();
        switch (inputAction) {
            case 1:
                processTransaction(input, customer, table);
=======
        String
            confirmAnotherTransaction;
        double 
            totalPrice,
            todaysIncome = 0.0;
        boolean
            checkTable;
        String [][] chooseMenu = chooseMenu(input);
        while (true) {
            // Check if there's table available.
            checkTable = checkTable(table);
            System.out.println("Customer " + customer);
            if (checkTable) {
                
                // Choose menu with function
                totalPrice = Double.parseDouble(chooseMenu[0][4]);

                // Choose payment type.
                Payment(chooseMenu, input, totalPrice, todaysIncome);

                todaysIncome += totalPrice;
                customer++;

                System.out.print("Do you want to add another transaction? (y/n) : ");
                while (true) {
                    confirmAnotherTransaction = input.next();
                    if (confirmAnotherTransaction.equalsIgnoreCase("y")) {
                        ProcessTransaction(input, customer, table);
                    } else if (confirmAnotherTransaction.equalsIgnoreCase("n")) {
                        System.out.println("Total customers : " + customer);
                        System.out.println("Today's income is : Rp. " + todaysIncome);
                        break;
                    } else {
                        System.out.print("Please choose the available options (y/n) : ");
                        continue;
                    }
                }
>>>>>>> d570db2ba76f09878aa4f424b8d0868f0d82522c
                break;
        
            default:
                break;
        }
    }

    public static String login(
        Scanner input,
        String[][] user,
        String userAuthorization
        ) {
        boolean checkUser = true;
        String username, password;

        // Input username and password to login.
        while (checkUser) {
            System.out.println("Please login first.");
            System.out.print("Username  : ");
            username = input.next();
            System.out.print("Password  : ");
            password = input.next();
            // Check if the username and password is correct.
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user[i].length; j++) {
                    if (user[i][0].equals(username) && user[i][1].equals(password)) {
                        checkUser = false;
                        userAuthorization = user[i][2];
                        System.out.println("Login Success!");
                        System.out.println("Logged in as " + userAuthorization);
                        break;
                    }
                }
            }
            if (checkUser) {
                System.out.println("Username or password is incorrect. Please try again.");
            }
        }
        return userAuthorization;
    }

    public static void processTransaction(
        Scanner input,
        int customer,
        int table
    ) {
        String
            confirmAnotherTransaction,
            diningOption;
        double 
            totalPrice,
            todaysIncome = 0.0;
        boolean
            checkTable = true;
        while (true) {
            diningOption = selectDiningOption(input);
            if (diningOption.equals("Dine-in")) {

                // Check if there's table available for dine-in.
                checkTable = checkTable(table);
            }

            System.out.println("Customer " + customer);
            if (checkTable) {
                
                // select menu with function
                totalPrice = selectMenu(input);

                // select payment type.
                Payment(input, totalPrice, todaysIncome);

                todaysIncome += totalPrice;
                customer++;

                System.out.print("Do you want to add another transaction? (y/n) : ");
                while (true) {
                    confirmAnotherTransaction = input.next();
                    if (confirmAnotherTransaction.equalsIgnoreCase("y")) {
                        processTransaction(input, customer, table);
                    } else if (confirmAnotherTransaction.equalsIgnoreCase("n")) {
                        System.out.println("Total customers : " + customer);
                        System.out.println("Today's income is : Rp. " + todaysIncome);
                        break;
                    } else {
                        System.out.print("Please select the available options (y/n) : ");
                        continue;
                    }
                }
                break;
            } else {
                System.out.println("There's no available table.");
                break;
            }
        }
    }

    public static String selectDiningOption(
        Scanner input
    ) {
        String[] diningOptions = {
            "Dine-in",
            "Takeaway"
        };
        String selectedDiningOptions = "";
        int index;
        boolean checkDiningOptionsIndex;

        diningOptionsHorizontalGrid();
        System.out.printf("| %-3s| %-15s|%n", "ID", "Dining Option");
        diningOptionsHorizontalGrid();
        for (int i = 0; i < diningOptions.length; i++) {
            System.out.printf("| %-3s| %-15s|%n", (i+1), diningOptions[i]);
        }
        diningOptionsHorizontalGrid();
        System.out.printf("| %-20s|%n", "0. Back");
        System.out.printf("|%-21s|%n", "---------------------");
        
        checkDiningOptionsIndex = true;
        while (checkDiningOptionsIndex) {
            System.out.print("Select your option : ");
            index = input.nextInt();
            if (index > diningOptions.length) {
                System.out.println("Please select the available option.");
                continue;
            } else if (index == 0) {
                cashierActions(input);
            } else {
                selectedDiningOptions = diningOptions[index-1];
                checkDiningOptionsIndex = false;
            }
        }
        return selectedDiningOptions;
    }
    
    public static void diningOptionsHorizontalGrid() {
        System.out.printf("|%-4s|%-16s|%n", "----", "----------------");
    }

    public static boolean checkTable(int table) {
        System.out.println("Checking if there's table available...");
        if (table != 0) {
            table--;
            System.out.println(table + " Table available.");
            return true;
        } else {
            System.out.println("There's no table available.");
            return false;
        }
    }

<<<<<<< HEAD
    public static double selectMenu(
=======
    public static String [][] chooseMenu(
>>>>>>> d570db2ba76f09878aa4f424b8d0868f0d82522c
        Scanner input
    ) {
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
<<<<<<< HEAD
        int menuIndex, menuTypesIndex;
        double totalPrice = 0.0;
        int amount;
=======

        int menuIndex = 0, menuTypesIndex = 0, counter = 0;
        double totalPrice = 0.0, discount = 0, pricePerMenu = 0, beforeDis = 0;
        int amount = 0 ,diningOptions = 0;
        int [][] choseMemory = new int [99][2];
        double [][] totalPricePerMenuSave = new double [99][2];
>>>>>>> d570db2ba76f09878aa4f424b8d0868f0d82522c
        int[] index = new int[menu.length];
        String orderMore;  
        boolean 
            checkMenuIndex, 
            checkMenuTypesIndex,
            isValidIndex;

        // select menu.
        while (true) {
            menuTypeHorizontalGrid();
            System.out.printf("| %-3s| %-15s|%n", "ID", "Menu Type");
            menuTypeHorizontalGrid();
            for (int i = 0; i < menuTypes.length; i++) {
                System.out.printf("| %-3s| %-15s|%n", (i+1), menuTypes[i]);
            }
            menuTypeHorizontalGrid();
            System.out.printf("| %-20s|%n", "0. Back");
            System.out.printf("|%-21s|%n", "---------------------");

            // Reset the available menu index
            for (int i = 0; i < index.length; i++) {
                index[i] = 0;
            }

            // select the menu type
            checkMenuTypesIndex = true;
            while (checkMenuTypesIndex) {
                System.out.print("Please select your type : ");
                menuTypesIndex = input.nextInt();
                if (menuTypesIndex > menuTypes.length) {
                    System.out.println("Please select available type.");
                    continue;
                } else {
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

                    System.out.printf(" | %-92s|%n", "0. Back");
                    checkMenuTypesIndex = false;
                }
            }

            // select the menu
            checkMenuIndex = true;
            while (checkMenuIndex) {
                System.out.print("Please select your menu : ");
                menuIndex = input.nextInt();

                // Check if the input menuIndex is within the valid range
                isValidIndex = false;
                for (int i = 0; i < index.length; i++) {
                    if (menuIndex == index[i]) {
                        isValidIndex = true;
                        checkMenuIndex = false;
                    }
                }

                // Check if the selected menuIndex is valid
                if (isValidIndex) {
                    System.out.println(menu[menuIndex-1][0] + " = " + menu[menuIndex-1][1]);
                    System.out.print("Total amount: ");
                    amount = input.nextInt();
                    pricePerMenu = Integer.parseInt(menu[menuIndex-1][2]) * amount;
                    totalPrice += Integer.parseInt(menu[menuIndex-1][2]) * amount;
                    System.out.println("Total Price : Rp. " + totalPrice);
                    break;
                } else {
                    System.out.println("Please select the available menus.");
                } 
            }

            // select to order more or not.
            while (true) {
                System.out.print("Do you want to order more? (y/n) : ");
                orderMore = input.next();

                if (orderMore.equalsIgnoreCase("n")) {
<<<<<<< HEAD
                    System.out.println("Please select payment type.");
=======
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
>>>>>>> d570db2ba76f09878aa4f424b8d0868f0d82522c
                    break;
                } else if (orderMore.equalsIgnoreCase("y")) {
                    System.out.println("Please select your menu : ");
                    break;
                } else {
                    System.out.println("Please answer (y/n)");
                }
            }
            if (orderMore.equalsIgnoreCase("n")) {
                break;
            }

            // This is index data for the receipt
            choseMemory[counter][0] = menuIndex - 1;
            choseMemory[counter][1] = amount;

            totalPricePerMenuSave[counter][0] = pricePerMenu;
            totalPricePerMenuSave[counter][1] = totalPrice;

            counter++;
            }

        String [][] dataForReceipt = dataForReceipt(menu, choseMemory, totalPricePerMenuSave, totalPrice, counter, discount, beforeDis);

        return dataForReceipt;
    }

    public static void menuHorizontalGrid() {
        System.out.printf("|%-4s|%-46s|%-21s|%-21s|%n", "----", "----------------------------------------------", "---------------------", "---------------------");
    }

    public static void menuTypeHorizontalGrid() {
        System.out.printf("|%-4s|%-16s|%n", "----", "----------------");
    }

    public static void Payment(
        String [][] chooseMenu,
        Scanner input,
        double totalPrice,
        double todaysIncome
    ) {
        String[] paymentType = {
            "Cash",
            "Debit Card"
        };
        int paymentId;

        // select payment type.
        for (int j = 0; j < paymentType.length; j++) {
            System.out.println((j + 1) + ". " + paymentType[j]);
        }
        System.out.print("Input payment type ID : ");
        paymentId = input.nextInt();

        while (true) {
            // Cash payment type.
            if (paymentId == 1) {
                Cash(chooseMenu, input, totalPrice, todaysIncome);
                break;
            } 
            // Debit payment type.
            else if (paymentId == 2) {
                Debit(chooseMenu, input, totalPrice, todaysIncome);
                break;
            } 
            // Unavailable payment type.
            else {
                System.out.println("Please select available payment type.");
                continue;
            }
        }
    }

    public static double Debit(
        String [][] chooseMenu,
        Scanner input,
        double totalPrice, 
        double todaysIncome
    ) {        
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
        int bankId;
        boolean checkBank = true;
        String [][] theReceiptData = chooseMenu;

        // Display available banks.
        for (int j = 0; j < availableBank.length; j++) {
            System.out.println((j + 1) + ". " + availableBank[j]);
        }
        while (checkBank) {
            System.out.print("Input Bank ID : ");
            bankId = input.nextInt();
            for (int j = 0; j < availableBank.length; j++) {
                if (bankId == (j+1)) {
                    
                    System.out.println("Bank        : " + availableBank[j]);
                    System.out.println("Total price : " + totalPrice);
                    System.out.println("Printing receipt...");
                    printReceipt(theReceiptData);
                    System.out.println("Thanks for the purchase!");
                    
                    checkBank = false; 
                    todaysIncome += totalPrice;
                    totalPrice = 0.0;
                }

            // Bank unavailable.
            }
            if (bankId >= availableBank.length) {
                
                System.out.println("Please select available bank.");
                
            }
        }
        return todaysIncome;
    }

    public static double Cash(
        String [][] chooseMenu,
        Scanner input,
        double totalPrice, 
        double todaysIncome
    ) {
        double paymentAmount, change;
        String [][] theReceiptData = chooseMenu;
        
        System.out.println("Total price           : " + totalPrice);
        System.out.print("Input payment nominal : ");
        paymentAmount = input.nextInt();
        change = paymentAmount - totalPrice;

        // Print the receipt.
        while (paymentAmount - totalPrice < 0) {
            
            System.out.println("Please input the correct nominal.");
            
        }
        System.out.println("Change                : " + change);
        
        System.out.println("Printing receipt...");
        printReceipt(theReceiptData);
        System.out.println("Thanks for the purchase!");
        
        todaysIncome += totalPrice;
        totalPrice = 0.0;

        return todaysIncome;
    }

    // This is the data for the receipt
        public static String[][] dataForReceipt (
            String[][] menu, 
            int[][] choseMemory,
            double[][] totalPricePerMenuSave,
            double totalPrice,
            int counter,
            double discount,
            double beforeDis
            ){
        String[][] theReceiptData = new String[counter + 1][7];

        for (int i = 0; i <= counter; i++) {
            theReceiptData[i][0] = String.valueOf(totalPricePerMenuSave[i][0]);
            theReceiptData[i][1] = String.valueOf(choseMemory[i][1]);
            theReceiptData[i][2] = menu[choseMemory[i][0]][0];
            theReceiptData[i][3] = menu[choseMemory[i][0]][1];
            theReceiptData[i][4] = String.valueOf(totalPrice);
            theReceiptData[i][5] = String.valueOf(discount);
            theReceiptData[i][6] = String.valueOf(beforeDis);
        }
    
        return theReceiptData;
    }

    // This is the design of the receipt
    public static void printReceipt (String [][] theReceiptData) {
        receiptHorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", "No", "Menu Item", "Price", "Amount", "Total Price");
        receiptHorizontalGrid();
        for (int i = 0; i < theReceiptData.length; i++) {
            System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", i + 1, theReceiptData[i][2], theReceiptData[i][3], theReceiptData[i][1] , theReceiptData[i][0]);
        }
        receiptHorizontalGrid();
        System.out.printf("| %-83s| %-20s|%n", "Price", theReceiptData[0][6]);
        System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
        System.out.printf("| %-83s| %-20s|%n", "Discount", theReceiptData[0][5]);
        System.out.printf("|%-4s %-46s %-21s %-10s+%-21s+%n", " ", " ", "  ", "  ", "---------------------");
        System.out.printf("| %-83s| %-20s|%n", "Total Price", theReceiptData[0][4]);
        System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
    }

    public static void receiptHorizontalGrid () {
        System.out.printf("+%-4s+%-46s+%-21s+%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
    }
}