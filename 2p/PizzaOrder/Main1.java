public class Main1 {
    public static void main(String[] args) {

        PizzaOrder order = new PizzaOrder(
                "Аль-Капчоне",
                Size.BIG,
                true,
                "Ярославская 101"
        );

        order.order();
        order.order();
        order.cancel();
        order.cancel();

        System.out.println(order);
    }
}