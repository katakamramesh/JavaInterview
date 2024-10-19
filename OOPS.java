// Abstraction (abstract class)
abstract class Animal {
    // Encapsulation (private variables with public getters/setters)
    private String name;
    private int age;

    // Constructor for setting name and agec
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method (to be implemented by subclasses)
    abstract void makeSound();

    // Public methods to get encapsulated fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Common method for all animals
    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}

// Inheritance (Dog is a subclass of Animal)
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);  // Calling the constructor of superclass
    }

    // Polymorphism (Method overriding)
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Bark!");
    }
}

// Inheritance (Cat is a subclass of Animal)
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);  // Calling the constructor of superclass
    }

    // Polymorphism (Method overriding)
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

// Main class to demonstrate OOP concepts
public class OOPS {
    // Polymorphism (Method overloading)
    public void playWithAnimal(Animal animal) {
        System.out.println(animal.getName() + " is playing.");
    }

    // Overloaded method (compile-time polymorphism)
    public void playWithAnimal(Animal animal, String toy) {
        System.out.println(animal.getName() + " is playing with a " + toy);
    }

    public static void main(String[] args) {
        // Object creation
        Dog dog = new Dog("Buddy", 5);
        Cat cat = new Cat("Whiskers", 3);

        // Encapsulation (accessing private fields via getters)
        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        // Polymorphism (method overloading and method overriding)
        OOPS mainApp = new OOPS();
        mainApp.playWithAnimal(dog);               // Uses overridden method
        mainApp.playWithAnimal(cat, "ball");       // Uses overloaded method
    }
}
