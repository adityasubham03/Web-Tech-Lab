class Animal {
  public void makeSound() {
    System.out.println("The animal makes a sound.");
  }
}

// Child classes
class Dog extends Animal {
  public void makeSound() {
    System.out.println("The dog barks.");
  }
}

class Cat extends Animal {
  public void makeSound() {
    System.out.println("The cat meows.");
  }
}

class Main_03 {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    Animal animal2 = new Dog();
    Animal animal3 = new Cat();
    
    animal1.makeSound();
    animal2.makeSound();
    animal3.makeSound();
  }
}
