abstract class payment {
    protected double amount;

    payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void receipt() {
        System.out.println("Receipt Generated");
        System.out.println("Amount paid: ₹" + amount);
    }

    void showpaymentstatus() {
        System.out.println("Payment Successful");
    }
}

class upipayment extends payment {
    private String upiID;

    upipayment(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }

    @Override
    void pay() {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiID);
    }
}

class cardpayment extends payment {
    private String cardNumber;

    cardpayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Processing Card Payment...");
        System.out.println("Card Number: **** **** **** " +
                cardNumber.substring(cardNumber.length() - 4));
    }
}

public class Main {
    public static void main(String[] args) {

        payment p1 = new upipayment(550.75, "yash@oksbi");
        payment p2 = new cardpayment(120.50, "1234567812345678");

        p1.pay();
        p1.receipt();
        p1.showpaymentstatus();

        System.out.println();

        p2.pay();
        p2.receipt();
        p2.showpaymentstatus();
    }
}
