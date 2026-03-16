class Cafee {

    static String teaNames[] = {
        "Amruth Tea",
        "Black Tea",
        "White Tea",
        "Lemon Tea",
        "Masala Tea",
        "Ginger Tea"
    };

    static String coffeeNames[] = {
        "Black Coffee",
        "Cold Coffee",
        "Filter Coffee",
        "Caramel Coffee",
        "Irish Coffee",
        "Americano Coffee"
    };

    static String snacks[] = {
        "Samosa",
        "Pakoda",
        "Pizza",
        "Burger",
        "French Fries",
        "Vada Pav"
    };

    public static void main(String[] cafe) {
        getTeaNames();
        getCoffeeNames();
        getSnacks();
    }

    public static void getTeaNames() {
        for (String teaName : teaNames)
            System.out.println(teaName);
    }

    public static void getCoffeeNames() {
        for (String coffeeName : coffeeNames)
            System.out.println(coffeeName);
    }

    public static void getSnacks() {
        for (String snack : snacks)
            System.out.println(snack);
    }
}