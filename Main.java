public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.save();
        menu.printDrinks();

        Customer customer = new Customer();
        customer.myInfo();
    }
}