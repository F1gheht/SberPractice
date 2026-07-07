public class Phone{

    private String number;
    private String model;
    private double weight;

    // Конструкторы
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "", 0.0);
    }

    // Методы
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " (" + number + ")");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public String toString() {
        return String.format(
                "номер='%s', модель='%s', вес=%.2f г",
                number, model, weight
        );
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("+7-999-123-45-67", "iPhone 40", 187.5);
        Phone phone2 = new Phone("+7-916-789-12-34", "Samsung F144");
        Phone phone3 = new Phone();


        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);


        phone1.receiveCall("Роман");
        phone1.receiveCall("Михаил", "+7-495-555-55-55");


        System.out.println(phone1.getNumber());


        phone1.sendMessage("+7-999-111-22-33", "+7-999-444-55-66");
    }
}