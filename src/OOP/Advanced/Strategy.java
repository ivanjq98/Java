package OOP.Advanced;

// Step 1: Define the PaymentStrategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Implement CreditCardPayment and PayPalPayment
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Step 3: Create a PaymentContext class
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment method selected.");
        }
    }
}

public class Strategy {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.makePayment(100);

        // Switching to PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.makePayment(200);
    }
}
