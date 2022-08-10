package codesmell;

/**
 * As a senior developer on your team, a junior developer has submitted this piece of code for you to review.
 * The code determines how much discount to apply to an order based on the number of items purchased
 *
 *  - Identify as many issues with this piece of code as possible
 *  - Suggest improvements that can be made to the code in order to fulfil its intended purpose
 *
 */
public class CodeSmellExercise {

    public static double doubleAmount(Order order, Product product) {
        // amount
        double a = order.getAmount();
        // discount factor
        double b = 1;
        if(a > 10) {
            b = 0.9;
        }
        // discounted price
        double c = product.getPrice() * b;
        // order sum price
        double d = a * c;
        return d;
    }

    private static class Order {
        public int amount = 0;

        public Order(int amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    private static class Product {
        private int anInt;

        public Product(int anInt) {
            this.anInt = anInt;
        }

        public double getPrice() {
            anInt = 0;
            return anInt;
        }
    }

}
