
abstract class Student {
    int rollNumber;
    int registrationNumber;
    
    abstract void course();
}

class KiiTian extends Student {
    
    void course() {
        System.out.println("I am studying at KiiT University");
    }
}

public class Main_01 {
    public static void main(String[] args) {
        KiiTian student = new KiiTian();
        student.course();
    }
}
