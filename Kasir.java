package Java_Restaurant_Cashier;
import java.util.Scanner;
public class Kasir {

    static Scanner input = new Scanner(System.in);
    
    static String[][] receiptData = new String[99][4];
    static String[] menuTypes = {
            "Main Dish",
            "Side Dish",
            "Beverages",
            "Dessert"
    };
    static String[] menuCategories = {
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
    static String[][] menu = {

            // Main Dish - Fried Rice Pax
            { "Original Fried Rice", "Rp. 12,000", "12000", menuTypes[0], menuCategories[0], "0"},
            { "Javanese Fried Rice", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0], "21"},
            { "Seafood Fried Rice", "Rp. 17,000", "17000", menuTypes[0], menuCategories[0], "19" },
            { "Goat Fried Rice", "Rp. 20,000", "20000", menuTypes[0], menuCategories[0], "24" },
            { "Crazy Fried Rice", "Rp. 17,000", "17000", menuTypes[0], menuCategories[0], "25" },
            { "Sausage Fried Rice", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0], "36" },
            { "MeatBall Fried Rice", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0], "47" },
            { "Chicken Fried Rice", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0], "58" },
            { "Pete Fried Rice", "Rp. 15,000", "15000", menuTypes[0], menuCategories[0], "12" },
            { "Babat Fried Rice", "Rp. 20,000", "20000", menuTypes[0], menuCategories[0], "10" },
            { "Special Fried Rice", "Rp. 25,000", "25000", menuTypes[0], menuCategories[0], "15" },

            // Main Dish - Fried Chicken Pax
            { "Fried Chicken Original", "Rp. 22,000", "22000", menuTypes[0], menuCategories[1], "10" },
            { "Fried Chicken Mentai", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1], "15" },
            { "Fried Chicken BBQ", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1], "13" },
            { "Fried Chicken Teriyaki", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1], "11" },
            { "Fried Chicken Spicy", "Rp. 22,000", "22000", menuTypes[0], menuCategories[1], "12" },
            { "Fried Chicken Salted Egg", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1], "25" },
            { "Fried Chicken Black Pepper", "Rp. 25,000", "25000", menuTypes[0], menuCategories[1], "26" },

            // Main Dish - Hamburger Pax
            { "Classic Beef Burger", "Rp. 15,000", "15000", menuTypes[0], menuCategories[2], "19" },
            { "Fish Fillet Burger", "Rp. 15,000", "15000", menuTypes[0], menuCategories[2], "15" },
            { "Cheese Burger", "Rp. 17,000", "17000", menuTypes[0], menuCategories[2], "13" },
            { "Double Cheese Burger", "Rp. 20,000", "20000", menuTypes[0], menuCategories[2], "12" },
            { "Mushroom Swiss Burger", "Rp. 22,000", "22000", menuTypes[0], menuCategories[2], "32" },
            { "Mozzarella Cheese Burger", "Rp. 25,000", "25000", menuTypes[0], menuCategories[2], "24" },
            { "BBQ Beef Burger", "Rp. 22,000", "22000", menuTypes[0], menuCategories[2], "15" },

            // Main Dish - Pasta Pax
            { "Lasagne", "Rp. 15,000", "15000", menuTypes[0], menuCategories[3], "21" },
            { "Spaghetti in Tomato Sauce", "Rp. 15,000", "15000", menuTypes[0], menuCategories[3], "17" },
            { "Chicken and Linguini", "Rp. 15,000", "15000", menuTypes[0], menuCategories[3], "28" },
            { "Pasta and Tomato Sauce", "Rp. 12,000", "12000", menuTypes[0], menuCategories[3], "15" },

            // Side Dish - Appetizer
            { "Dimsum", "Rp. 3,500/pcs", "3500", menuTypes[1], menuCategories[4], "10" },
            { "Dumpling", "Rp. 3,500/pcs", "3500", menuTypes[1], menuCategories[4], "11" },
            { "Bakwan", "Rp. 2,000/pcs", "2000", menuTypes[1], menuCategories[4], "22" },
            { "Pempek", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4], "33" },
            { "Mendoan", "Rp. 3,000/pcs", "3000", menuTypes[1], menuCategories[4], "20" },
            { "French Fries Large", "Rp. 10,000", "10000", menuTypes[1], menuCategories[4], "5" },
            { "French Fries Medium", "Rp. 8,000", "8000", menuTypes[1], menuCategories[4], "10" },
            { "French Fries Small", "Rp. 5,000", "5000", menuTypes[1], menuCategories[4], "21" },
            { "Potato Chip", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4], "11" },
            { "Fried Tofu", "Rp. 2,000/pcs", "2000", menuTypes[1], menuCategories[4], "10" },
            { "Macaroni", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4], "20" },
            { "Waffle", "Rp. 10,000/portion", "10000", menuTypes[1], menuCategories[4], "31" },
            { "Egg (Sunny Side Up/Omelet/half boiled egg)", "Rp. 5,000/pcs", "5000", menuTypes[1], menuCategories[4], "12" },
            { "Rice", "Rp. 3,000/portion", "3000", menuTypes[1], menuCategories[4], "23" },

            // Beverage - Juice
            { "Apple Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "30" },
            { "Mango Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "31" },
            { "Avocado Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "45" },
            { "Strawberry Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "26" },
            { "Orange Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "17" },
            { "Pineapple Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "12" },
            { "Beetroot Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "7" },
            { "Tomato Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "9" },
            { "Grapefruit Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "15" },
            { "Watermelon Juice", "Rp. 12,000", "12000", menuTypes[2], menuCategories[5], "20" },

            // Beverage - Milkshake
            { "Vanilla Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "14" },
            { "Chocolate Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "25" },
            { "Strawberry Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "36" },
            { "Banana Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "17" },
            { "Mango Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "23" },
            { "Caramel Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "14" },
            { "Coconut Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "20" },
            { "Oreo Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "16" },
            { "Milo Milkshake", "Rp. 15,000", "15000", menuTypes[2], menuCategories[6], "10" },

            // Beverage - Tea
            { "Iced Tea", "Rp. 8,000", "8000", menuTypes[2], menuCategories[7], "13" },
            { "Hot Tea", "Rp. 8,000", "8000", menuTypes[2], menuCategories[7], "24" },
            { "Black Tea", "Rp. 10,000", "10000", menuTypes[2], menuCategories[7], "25" },
            { "Green Tea", "Rp. 10,000", "10000", menuTypes[2], menuCategories[7], "36" },

            // Beverage - Mineral Water
            { "Mineral Water", "Rp. 5,000", "5000", menuTypes[2], menuCategories[8], "107" },

            // Dessert - Salad
            { "Salad", "Rp. 10,000", "10000", menuTypes[3], menuCategories[9], "15" },

            // Dessert - Ice Cream
            { "Vanilla Ice Cream", "Rp. 10,000", "10000", menuTypes[3], menuCategories[10], "19" },
            { "Chocolate Ice Cream", "Rp. 10,000", "10000", menuTypes[3], menuCategories[10], "20" },
            { "Strawberry Ice Cream", "Rp. 10,000", "10000", menuTypes[3], menuCategories[10], "31" },
            { "Caramel Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10], "21" },
            { "Mocha Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10], "32" },
            { "Mint Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10], "24" },
            { "Macha Ice Cream", "Rp. 12,000", "12000", menuTypes[3], menuCategories[10], "13" },
    };  
    static String[] availableBank = {
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
    static String[] diningOptions = {
        "Dine-in",
        "Takeaway"
    };
    static String[][] user = {
        { "Fawwaz", "Fawwaz" },
        { "Ekya", "Ekya" },
        { "Raul", "Raul" }
    };
    static boolean userAuthorization;
    static int table = 5;
    static double todaysIncome = 0.0;
    static int choseDiscount = 0;
    public static void main(String[] args) {

        // Login with function
        userAuthorization = login(user);
        if (userAuthorization == true) {
            cashierActions();
        } else {
            System.out.println("User not authorized.");
        }
    }
    
    // Functions Initialization
    public static void cashierActions() {
        int inputAction;

        switch (choseDiscount) {
            case 1:
                System.out.println("==========================================================");
                System.out.println("Selamat Hari Raya Idul Fitri!");
                System.out.println("Total price will be cut by 25% when it reach Rp. 300.000");
                System.out.println("==========================================================");
                break;
            case 2:
                System.out.println("==========================================================");
                System.out.println("Merry Christmast!");
                System.out.println("Total price will be cut by 35% when it reach Rp. 500.000");
                System.out.println("==========================================================");
                break;
            case 3:
                System.out.println("==========================================================");
                System.out.println("Happy independence day!");
                System.out.println("Total price will be cut by 15% when it reach Rp. 350.000");
                System.out.println("==========================================================");
                break;
            default:
                break;
        }
        System.out.println("There is " + table + " avaible table");
        System.out.println("1. Process Transaction");
        System.out.println("2. Input Table");
        System.out.println("3. Input Stock Menu");
        System.out.println("4. View Sales Reports");
        System.out.println("5. Add Discount");
        System.out.println("0. Turn OFf Cashier System");
        while (true) {
            System.out.print("Select your action : ");
            inputAction = input.nextInt();
            if (inputAction > 5) {
                System.out.println("Please select available action.");
                continue;
            } else {
                break;
            }
        }
        switch (inputAction) {
            case 1:
                selectDiningOption(diningOptions);
            case 2:
                table += inputTable(table);
                cashierActions();
            case 3:
                inputStock(menu);
                cashierActions();
            case 4:
                System.out.println("Today's income : " + formatCurrency(todaysIncome));
                cashierActions();
            case 5:
                insertDiscount();
                cashierActions();
            default:
                System.exit(0);
                break;
        }
    }

    // Functions

    public static void insertDiscount(){
        System.out.println("Insert content of the discount");
        System.out.println("1. Hari Raya Idul Fitri");
        System.out.println("2. Hari Raya Natal");
        System.out.println("3. Hari Kemerdekaan");
        System.out.println("0. Delete discount");
        System.out.print("Choose your options : ");

        choseDiscount = input.nextInt();
    }

    public static int inputTable(
        int table
    ) {
        System.out.println("There is " + table + " avaible table");
        System.out.print("Insert avaible table : ");
        table = input.nextInt();
        return table;
    }

    public static void inputStock(
        String[][] menu
    ) {
        int id, stock;
        menuHorizontalGrid();
        System.out.printf(
            "| %-3s| %-45s| %-20s| %-20s| %-10s| %n",
            "ID", "Menu Item", "Category", "Price", "Stock");
        menuHorizontalGrid();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-10s|%n", (i+1), menu[i][0], menu[i][4], menu[i][1],menu[i][5]);
        }
        menuHorizontalGrid();
        System.out.printf("| %-106s|%n", "0. Back");
        System.out.printf("+%103s+%n", "-----------------------------------------------------------------------------------------------------------");
        while (true) {
            System.out.print("Select ID Menu to Edit : ");
            id = input.nextInt();
            if (id > menu.length) {
                System.out.println("Please input a valid ID.");
                continue;
            } else if (id == 0) {
                cashierActions();
            } else {
                System.out.println("Updating Stock of " + menu[id-1][0]);
                while (true) {
                    System.out.print("Insert available stock : ");
                    stock = input.nextInt();
                    if (stock == 0) {
                        inputStock(menu);
                        break;
                    } else {
                        menu[id-1][5] = Integer.toString(Integer.parseInt(menu[id-1][5]) + stock);
                        System.out.println("Stock of " + menu[id-1][0] + " Updated");
                        break;
                    }
                }
                break;
            }
        }
    }

    public static boolean login(
        String[][] user
    ) {
        boolean checkUser = true;
        String username, password;

        // Input username and password to login.
        while (checkUser) {
            System.out.println("==========================================================");
            System.out.println("------------------ Please login first --------------------");
            System.out.println("==========================================================");
            System.out.print("Username  : ");
            username = input.next();
            System.out.print("Password  : ");
            password = input.next();
            // Check if the username and password is correct.
            for (int i = 0; i < user.length; i++) {
                for (int j = 0; j < user[i].length; j++) {
                    if (user[i][0].equals(username) && user[i][1].equals(password)) {
                        checkUser = false;
                        System.out.println("Login Success!");
                        System.out.println("Logged in as " + username);
                        break;
                    }
                }
            }
            if (checkUser) {
                System.out.println("==========================================================");
                System.out.println("Username or password is incorrect. Please try again.");         
            }
        }
        return true;
    }

    public static void selectDiningOption(
        String[] diningOptions
    ) {
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
        System.out.printf("+%-21s+%n", "---------------------");
        
        checkDiningOptionsIndex = true;
        while (checkDiningOptionsIndex) {
            System.out.print("Select your option : ");
            index = input.nextInt();
            if (index == 0) {
                cashierActions();
            } else if (index == 1) {
                if (checkTable(table) == true) {
                    selectedDiningOptions = diningOptions[index-1];
                    checkDiningOptionsIndex = false;
                    table--;
                } else {
                    continue;
                }
            } else if (index > diningOptions.length) {
                System.out.println("Please select the available option.");
                continue;
            } else {
                selectedDiningOptions = diningOptions[index-1];
                checkDiningOptionsIndex = false;
            }
        }
        selectMenu(selectedDiningOptions, table, 0.0, 0, todaysIncome);
    }

    public static void diningOptionsHorizontalGrid() {
        System.out.printf("+%-4s+%-16s+%n", "----", "----------------");
    }

    public static boolean checkTable(int table) {
        System.out.println("Checking if there's table available...");
        if (table != 0) {
            System.out.println(table + " Table available.");
            return true;
        } else {
            System.out.println("There's no table available.");
            return false;
        }
    }

    public static void selectMenu(
        String diningOption,
        int table,
        double totalPrice,
        int receiptIndex,
        double todaysIncome
    ) {
        int menuIndex = 0, menuTypesIndex, amount = 0;
        int[] index = new int[menu.length];
        String orderMore = null; 
        double pricePerMenu = 0;
        boolean 
            checkSelectMenu,
            checkMenuIndex, 
            checkMenuTypesIndex,
            isValidIndex,
            checkOrderMore;

        // select menu.
        switch (choseDiscount) {
            case 1:
                discountAlFitr();
                break;
            case 2:
                discountChristmast();
                break;
            case 3:
                discountIndependence();
                break;
            default:
                break;
        }
        checkSelectMenu = true;
        while (checkSelectMenu) {
            menuTypeHorizontalGrid();
            System.out.printf("| %-3s| %-15s|%n", "ID", "Menu Type");
            menuTypeHorizontalGrid();
            for (int i = 0; i < menuTypes.length; i++) {
                System.out.printf("| %-3s| %-15s|%n", (i+1), menuTypes[i]);
            }
            menuTypeHorizontalGrid();
            System.out.printf("| %-20s|%n", "0. Back");
            System.out.printf("+%-21s+%n", "---------------------");

            // Reset the available menu index
            for (int i = 0; i < index.length; i++) {
                index[i] = 0;
            }

            // select the menu type
            checkMenuTypesIndex = true;
            while (checkMenuTypesIndex) {
                System.out.print("Please select your type : ");
                menuTypesIndex = input.nextInt();
                if (menuTypesIndex == 0) {
                    selectDiningOption(diningOptions);
                } else if (menuTypesIndex > menuTypes.length) {
                    System.out.println("Please select available type.");
                    continue;
                } else {
                    int validIndexCount = 0;
                    menuHorizontalGrid();
                    System.out.printf(
                        "| %-3s| %-45s| %-20s| %-20s| %-10s| %n",
                        "ID", "Menu Item", "Category", "Price", "Stock");
                    menuHorizontalGrid();

                    for (int i = 0; i < menu.length; i++) {
                        if (menu[i][3].equals(menuTypes[menuTypesIndex - 1])) {
                            System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-10s|%n", (i+1), menu[i][0], menu[i][4], menu[i][1],menu[i][5]);
                            index[validIndexCount] = (i + 1);
                            validIndexCount++;
                        }
                    }
                    menuHorizontalGrid();

                    System.out.printf("| %-106s|%n", "0. Back");
                    System.out.printf("+%103s+%n", "-----------------------------------------------------------------------------------------------------------");
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
                    if (menuIndex != 0) {
                        if (Integer.parseInt(menu[menuIndex-1][5]) == 0) {
                            System.out.println("Stock not available.");
                            selectMenu(diningOption, table, totalPrice, receiptIndex, todaysIncome);
                        } else {
                            System.out.printf("+%-46s+%-21s+%-11s+%n", "----------------------------------------------", "---------------------", "-----------");
                            System.out.printf("| %-45s| %-20s| %-10s| %n", "Menu Item", "Price", "Stock");
                            System.out.printf("+%-46s+%-21s+%-11s+%n", "----------------------------------------------", "---------------------", "-----------");
                            System.out.printf("| %-45s| %-20s| %-10s| %n", menu[menuIndex-1][0], menu[menuIndex-1][1], menu[menuIndex-1][5]);
                            System.out.printf("+%-46s+%-21s+%-11s+%n", "----------------------------------------------", "---------------------", "-----------");
                            while (true){
                                System.out.print("Total amount : ");
                                amount = input.nextInt();
                                if (amount == 0){
                                    System.out.println("Please choose amount above 0.");
                                    continue;
                                } else if (!(Integer.parseInt(menu[menuIndex-1][5]) < amount)) {
                                    break;
                                } else {
                                    System.out.println("Maximum Order is " + (menu[menuIndex-1][5]));
                                    continue;
                                }
                            }
                            receiptData[receiptIndex][0] = menu[menuIndex-1][0];
                            receiptData[receiptIndex][1] = menu[menuIndex-1][1];
                            receiptData[receiptIndex][2] = String.valueOf(amount);
                            receiptData[receiptIndex][3] = String.valueOf(Integer.parseInt(menu[menuIndex-1][2]) * amount);
                            menu[menuIndex-1][5] = String.valueOf(Integer.parseInt(menu[menuIndex-1][5]) - amount);
                            receiptIndex += 1;
                            pricePerMenu = Integer.parseInt(menu[menuIndex-1][2]) * amount;
                            totalPrice += pricePerMenu;

                            System.out.println("Total Price : " + formatCurrency(totalPrice));
                            break;
                        }
                    } else if (menuIndex == 0) {
                        selectMenu(diningOption, table, totalPrice, receiptIndex, todaysIncome);
                    }
                } else {
                    System.out.println("Please select the available menus.");
                } 
            }

            // select to order more or not.
            checkOrderMore = true;
            while (checkOrderMore) {
                System.out.print("Do you want to order more? (y/n) : ");
                orderMore = input.next();

                if (orderMore.equalsIgnoreCase("n")) {
                    System.out.println("Please select payment type.");
                    checkOrderMore = false;
                } else if (orderMore.equalsIgnoreCase("y")) {
                    System.out.println("Please select your menu ");
                    checkOrderMore = false;
                } else {
                    System.out.println("Please answer (y/n)");
                }
            }
            if (orderMore.equalsIgnoreCase("n")) {
                checkSelectMenu = false;
            } else {
                continue;
            }

            double beforeDis = totalPrice;
            double discount = 0;

            switch (choseDiscount) {
                case 1:
                    if (totalPrice >= 300000) {
                        discount = totalPrice * 0.25;
                        totalPrice = beforeDis - discount;
                        System.out.println("Congratulation for your discount!");
                        System.out.println("Total price : Rp. " + formatCurrency(totalPrice));
                        System.out.println("You save Rp. " + formatCurrency(beforeDis - totalPrice) + " of your money");
                    }
                    break;
                case 2:
                    if (totalPrice >= 500000) {
                        discount = beforeDis * 0.35;
                        totalPrice = beforeDis - discount;
                        System.out.println("Congratulation for your discount!");
                        System.out.println("Total price : Rp. " + formatCurrency(totalPrice));
                        System.out.println("You save Rp. " + formatCurrency(beforeDis - totalPrice) + " of your money");

                    }
                    break;
                case 3:
                    if (totalPrice >= 350000) {
                        discount = beforeDis * 0.15;
                        totalPrice = beforeDis - discount;
                        System.out.println("Congratulation for your discount!");
                        System.out.println("Total price : " + formatCurrency(totalPrice));
                        System.out.println("You save " + formatCurrency(beforeDis - totalPrice) + " of your money");

                    }
                    break;
                default:
                    break;
            }
            confirmation(totalPrice,menuIndex,amount,discount);
            Payment(totalPrice, discount);
            checkSelectMenu = false;
        }
    }

    public static void confirmation(double totalPrice, int menuIndex,int amount,double discount){

        String menuConfirmation = " ", selectedDiningOptions = "";;

        receiptHorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", "No", "Menu Item", "Price", "Amount", "Total Price");
        receiptHorizontalGrid();

        for (int i = 0; i < receiptData.length; i++) {
            if (
                    receiptData[i][0] != null ||
                            receiptData[i][1] != null ||
                            receiptData[i][2] != null ||
                            receiptData[i][3] != null)
            {
                System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", i + 1, receiptData[i][0], receiptData[i][1], receiptData[i][2] , "Rp. " + addCommas(Integer.parseInt(receiptData[i][3])));
            }
        }
        receiptHorizontalGrid();
        System.out.printf("| %-83s| %-20s|%n", "Discount", formatCurrency(discount));
        receiptHorizontalGrid();
        System.out.printf("| %-83s| %-20s|%n", "Total Price", formatCurrency(totalPrice));
        receiptHorizontalGrid();
        while (!menuConfirmation.equalsIgnoreCase("y") || !menuConfirmation.equalsIgnoreCase("n")){
            System.out.print("Do you want to change menu? (y/n): ");
            menuConfirmation = input.next();

            if (menuConfirmation.equalsIgnoreCase("y")){
                for (int i = 0; i < receiptData.length; i++) {
                    System.out.println(receiptData[i][0]);
                    if (receiptData[i][0] == null){
                        break;
                    }
                    for (int j = 0; j < menu.length; j++) {
                        if (receiptData[i][0].equals(menu[j][0])){
                            menu[j][5] = String.valueOf(Integer.parseInt(menu[j][5]) + Integer.parseInt(receiptData[i][2]));
                        }
                    }
                }
                selectMenu(selectedDiningOptions, table, 0.0, 0, todaysIncome);
            } else if (menuConfirmation.equalsIgnoreCase("n")) {
                Payment(totalPrice,discount);
            }

        }


    }

    public static void menuHorizontalGrid() {
        System.out.printf("+%-4s+%-46s+%-21s+%-21s+%-11s+%n", "----", "----------------------------------------------", "---------------------", "---------------------","-----------");
    }

    public static void menuTypeHorizontalGrid() {
        System.out.printf("+%-4s+%-16s+%n", "----", "----------------");
    }

    public static void Payment(
        double totalPrice,
        double discount
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
        while (true) {
            System.out.print("Input payment type ID : ");
            paymentId = input.nextInt();
            // Cash payment type.
            if (paymentId == 1) {
                Cash( paymentId, paymentType[paymentId-1], totalPrice, discount);
                break;
            } 
            // Debit payment type.
            else if (paymentId == 2) {
                Debit( paymentId, paymentType[paymentId-1], totalPrice, discount);
                break;
            } 
            // Unavailable payment type.
            else {
                System.out.println("Please select available payment type.");
                continue;
            }
        }
    }

    public static void Debit(
        int paymentId,
        String paymentType,
        double totalPrice,
        double discount
    ) {
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
                    System.out.println("Bank        : " + availableBank[j]);
                    System.out.println("Printing receipt...");
                    receiptHorizontalGrid();
                    System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", "No", "Menu Item", "Price", "Amount", "Total Price");
                    receiptHorizontalGrid();
                    for (int i = 0; i < receiptData.length; i++) {
                        if (
                            receiptData[i][0] != null || 
                            receiptData[i][1] != null || 
                            receiptData[i][2] != null || 
                            receiptData[i][3] != null) 
                        {    
                            System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", i + 1, receiptData[i][0], receiptData[i][1], receiptData[i][2] , "Rp. " + addCommas(Integer.parseInt(receiptData[i][3])));
                        }
                    }
                    receiptHorizontalGrid();
                    System.out.printf("| %-83s| %-20s|%n", "Discount", formatCurrency(discount));
                    System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
                    System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
                    System.out.printf("| %-83s| %-20s|%n", "Payment", paymentType);
                    System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
                    System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
                    System.out.printf("| %-83s| %-20s|%n", "Bank", availableBank[j]);
                    System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
                    System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
                    System.out.printf("| %-83s| %-20s|%n", "Total Price", formatCurrency(totalPrice));
                    System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
                    System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
                    System.out.println("Thanks for the purchase!");
                    
                    checkBank = false; 
                }

            // Bank unavailable.
            }
            if (bankId >= availableBank.length) {
                System.out.println("Please select available bank.");
            }
        }

        todaysIncome += totalPrice;
        cashierActions();
    }

    public static void Cash(
        int paymentId,
        String paymentType,
        double totalPrice,
        double discount
    ) {
        double 
            paymentAmount = 0.0,
            change = 0.0;

        System.out.println("Total price           : " + formatCurrency(totalPrice));
        while (paymentAmount - totalPrice < 0) {
            System.out.print("Input payment nominal : ");
            paymentAmount = input.nextInt();
            change = paymentAmount - totalPrice;
            System.out.println("Please input the correct nominal.");
        }
        System.out.println("Change                : " + formatCurrency(change));

        // Print the receipt.
        System.out.println("Printing receipt...");
        receiptHorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", "No", "Menu Item", "Price", "Amount", "Total Price");
        receiptHorizontalGrid();
        for (int i = 0; i < receiptData.length; i++) {
            if (
                receiptData[i][0] != null || 
                receiptData[i][1] != null || 
                receiptData[i][2] != null || 
                receiptData[i][3] != null
                ) 
            {    
                System.out.printf("| %-3s| %-45s| %-20s| %-9s| %-20s|%n", i + 1, receiptData[i][0], receiptData[i][1], receiptData[i][2] , "Rp. " + addCommas(Integer.parseInt(receiptData[i][3])));
            }
        }
        receiptHorizontalGrid();
        System.out.printf("| %-83s| %-20s|%n", "Discount", formatCurrency(discount));
        System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
        System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
        System.out.printf("| %-83s| %-20s|%n", "Payment Type", paymentType);
        System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
        System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
        System.out.printf("| %-83s| %-20s|%n", "Total Price", formatCurrency(totalPrice));
        System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
        System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
        System.out.printf("| %-83s| %-20s|%n", "Payment Amount", formatCurrency(paymentAmount));
        System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
        System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
        System.out.printf("| %-83s| %-20s|%n", "Change", formatCurrency(change));
        System.out.printf("|%-4s %-46s %-21s %-10s|%-21s|%n", "    ", "                  ", "      ", "    ", "      ");
        System.out.printf("+%-4s-%-46s-%-21s-%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
        System.out.println("Thanks for the purchase!");

        todaysIncome += totalPrice;
        cashierActions();
    }

    public static void receiptHorizontalGrid () {
        System.out.printf("+%-4s+%-46s+%-21s+%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "----------", "---------------------");
    }

    public static String formatCurrency(double value) {
        double doubleValue = value;

        // Format the value as currency
        return "Rp. " + addCommas((int) doubleValue) + formatDecimal(doubleValue);
    }

    public static String addCommas(int value) {
        String valueStr = Integer.toString(value);

        StringBuilder formattedValue = new StringBuilder();
        int length = valueStr.length();

        for (int i = 0; i < length; i++) {
            formattedValue.append(valueStr.charAt(i));

            int remainingDigits = length - i - 1;
            if (remainingDigits > 0 && remainingDigits % 3 == 0) {
                formattedValue.append(',');
            }
        }

        return formattedValue.toString();
    }

    
    public static String formatDecimal(double value) {
        String decimalPart = String.valueOf(value % 1);

        // Remove "0." from the decimal part
        return decimalPart.substring(1);
    }

    // Helper method to add commas to the integer part of the number
    public static String formatWithCommas(int value) {
        String stringValue = Integer.toString(value);
        StringBuilder result = new StringBuilder();

        // Add commas to the integer part
        int length = stringValue.length();
        int commaIndex = length % 3;

        for (int i = 0; i < length; i++) {
            result.append(stringValue.charAt(i));

            if (i == commaIndex - 1 && i < length - 1) {
                result.append(',');
                commaIndex += 3;
            }
        }

        return result.toString();
    }

    public static void discountHorizontalGrid() {
        System.out.printf("+%-70s+%n", "------------------------------------------------------------------------");
    }

    public static void discountAlFitr() {
        discountHorizontalGrid();
        System.out.printf("| %-40s |%n", "                --------- Happy Eid al-Fitr! ---------                ");
        discountHorizontalGrid();
        System.out.printf("| %-70s |%n", "Taqabbalallahu minna wa minkum, Forgive me, both in body and soul. May");
        System.out.printf("| %-70s |%n", "we all attain true victory on this blessed day.");
        System.out.printf("| %-70s |%n", " ");
        System.out.printf("| %-70s |%n", "Get your discount by 25% with reaching your total price to");
        System.out.printf("| %-70s |%n", "Rp. 300.000!!!");
        discountHorizontalGrid();
    }
    public static void discountChristmast() {
        discountHorizontalGrid();
        System.out.printf("| %-40s |%n", "                --------- Merry Christmas!!! ---------                ");
        discountHorizontalGrid();
        System.out.printf("| %-70s |%n", "Warmest thoughts and best wishes for a wonderful Christmas and a Happy");
        System.out.printf("| %-70s |%n", "New Year.");
        System.out.printf("| %-70s |%n", " ");
        System.out.printf("| %-70s |%n", "Get your price cut by 35% with reaching your total price to");
        System.out.printf("| %-70s |%n", "Rp. 500.000!!!");
        discountHorizontalGrid();
    }
    public static void discountIndependence() {
        discountHorizontalGrid();
        System.out.printf("| %-40s |%n", "            --------- Happy Independence Day!!! ---------             ");
        discountHorizontalGrid();
        System.out.printf("| %-70s |%n", "May the flag of our country always fly high.");
        System.out.printf("| %-70s |%n", " ");
        System.out.printf("| %-70s |%n", "Get your price cut by 15% with reaching your total price to");
        System.out.printf("| %-70s |%n", "Rp. 350.000!!!");
        discountHorizontalGrid();
    }
}