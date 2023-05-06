class Animal {
    String name;
  
    public Animal(String name) {
      this.name = name;
      System.out.println("An animal named " + name + " has been created.");
    }
  }
  
  class Dog extends Animal {
    public Dog(String name) {
      super(name);
      System.out.println(name + " is a dog.");
    }
  }
  
  class Main_05 {
    public static void main(String[] args) {
      Dog myDog = new Dog("ChatGPT");
    }
  }