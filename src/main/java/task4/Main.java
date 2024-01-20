package task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Potap", 25, "Vanilna", "Kyiv", "Ukraine");


        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Address: " + user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", " + user.getAddress().getCountry());
    }
}