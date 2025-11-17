import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {     // Multilevel: Animal → Dog → Cat
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal: 1. Animal  2. Dog  3. Cat");
        int choice = sc.nextInt();

        Animal a;

        if (choice == 1)
            a = new Animal();
        else if (choice == 2)
            a = new Dog();
        else
            a = new Cat();

        a.makeSound();  // Calls overridden method
    }
}
