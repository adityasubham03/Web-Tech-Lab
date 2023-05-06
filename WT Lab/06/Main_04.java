class Account {
  int accountNo;
  float balance;

  public void disp() {
    System.out.println("Account No.: " + accountNo);
	System.out.println("Balance: " + balance);
  }
}

class Person extends Account {
  String name;
  int AdhaarNo;

  public void disp() {
    System.out.println("Name: " + name);
	System.out.println("Balance: " + balance);
    System.out.println("Adhaar No.: " + AdhaarNo);
    super.disp();
  }
}

public class Main_04 {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "John";
	person1.balance = 68;
    person1.AdhaarNo = 123456789;
    person1.accountNo = 1001;

    Person person2 = new Person();
    person2.name = "Jane";
	person2.balance = 12;
    person2.AdhaarNo = 987654321;
    person2.accountNo = 1002;

    Person person3 = new Person();
    person3.name = "Bob";
	person3.balance = 0;
    person3.AdhaarNo = 456789123;
    person3.accountNo = 1003;

    Person person4 = new Person();
    person4.name = "Alice";
	person4.balance = 1;
    person4.AdhaarNo = 321654987;
    person4.accountNo = 1004;

    Person person5 = new Person();
    person5.name = "Tom";
	person5.balance = 6;
    person5.AdhaarNo = 654123789;
    person5.accountNo = 1005;

    // Display details of each person
    person1.disp();
    System.out.println();
    person2.disp();
    System.out.println();
    person3.disp();
    System.out.println();
    person4.disp();
    System.out.println();
    person5.disp();
  }
}
