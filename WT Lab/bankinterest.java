interface PersonalLoan {
    float findInterest(float balance, int year);
}

class Bank1 implements PersonalLoan {
    static final float INTEREST_RATE = 0.05f;
    
    public float findInterest(float balance, int year) {
        return balance * INTEREST_RATE * year;
    }
}

class Bank2 implements PersonalLoan {
    static final float INTEREST_RATE = 0.06f;

    public float findInterest(float balance, int year) {
        return balance * INTEREST_RATE * year;
    }
}

public class bankinterest {
    public static void main(String[] args) {
        PersonalLoan bank1 = new Bank1();
        PersonalLoan bank2 = new Bank2();

        float balance = 10000f;
        int year = 5;

        float interestBank1 = bank1.findInterest(balance, year);
        float interestBank2 = bank2.findInterest(balance, year);

        System.out.println("Interest from Bank1: " + interestBank1);
        System.out.println("Interest from Bank2: " + interestBank2);
    }
}
