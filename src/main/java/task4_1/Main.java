package task4_1;

public class Main {
    public static void main(String[] args) {
        UserAddress address = new UserAddress("Vanilna", "Kyiv", "Ukraine");
        User user = new User("Potap", 25, address);


        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Address: " + user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", " + user.getAddress().getCountry());
    }
}
