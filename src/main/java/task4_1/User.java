package task4_1;

// Слабкий зв’язок між класом User та інтерфейсом Address

/**
 * Щоб був слабкий зв’язок між класами - використовуємо інтерфейс замість конкретних класів.
 * Інтерфейси визначають контракти між класами, але не визначають деталі реалізації.
 * Таким чином, класи можуть використовувати інтерфейси для спілкування з іншими класами, не знаючи про їх внутрішню логіку.
 * Це дозволяє замінювати одну реалізацію інтерфейсу іншою, не змінюючи класи, які її використовують.
 */
public class User {
    private String name;
    private int age;
    private Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
