package stactic_singleton_pattern.facade_pattern.movieApp;

class PaymentProcessor {
    public void processPayment(String paymentMethod) {
        System.out.println("Processing payment via: " + paymentMethod);
    }
}