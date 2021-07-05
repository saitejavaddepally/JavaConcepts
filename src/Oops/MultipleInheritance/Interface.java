package Oops.MultipleInheritance;


interface Loan{
//    only abstract methods or variables
    abstract void loan();
}

interface vehicleLoan{
    abstract void vehicleLoan();
}

abstract class Bank{
    abstract void savings();
    abstract void current();
}

// can't provide loan
class IndianBank extends Bank{
    @Override
    void savings() {
        System.out.println("you can open savings account for IB");
    }

    @Override
    void current() {
        System.out.println("you can open current account for IB");
    }
}

// SBI provides loan
// extends is-A
// implements has-A
class SBI extends Bank implements Loan, vehicleLoan{
    @Override
    void savings() {
        System.out.println("you can open savings account for SBI");
    }

    @Override
    void current() {
        System.out.println("you can open current account for SBI");
    }

    @Override
    public void loan() {
        System.out.println("I provide loan");
    }

    @Override
    public void vehicleLoan() {
        System.out.println("I provide vehicle loan");
    }
}

public class Interface {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.vehicleLoan();
        sbi.loan();
    }
}
