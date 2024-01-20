package task4;
/*                       Завдання 4
Змінити сильно зв'язний код на слабо зв'язний на прикладі класу User.
 */

// Сильний зв’язок між класом User та класом Address.

/**
 * В цьому прикладі клас User сильно зв’язаний із класом Address,
 * бо він створює об’єкт Address в своєму конструкторі та залежить від його деталей реалізації.
 * Якщо захочемо змінити клас Address, наприклад, додати нове поле , то  доведеться змінити також клас User, щоб врахувати це поле.
 */
public class User {
    private String name;
    private int age;
    private Address address;

    public User(String name, int age, String street, String city,String country) {
        this.name = name;
        this.age = age;
        this.address = new Address(street, city, country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
