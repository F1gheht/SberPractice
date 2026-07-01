public class PizzaOrder {

    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean accepted;

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.accepted = false;
    }

    public void order() {
        if (accepted) {
            System.out.println("Заказ уже принят.");
        } else {
            accepted = true;

            String sizeText = "";
            switch (size) {
                case SMALL:
                    sizeText = "Маленькая";
                    break;
                case MEDIUM:
                    sizeText = "Средняя";
                    break;
                case BIG:
                    sizeText = "Большая";
                    break;
            }

            System.out.print("Заказ принят. " + sizeText + " пицца \"" + name + "\"");

            if (sauce) {
                System.out.println(" с соусом на адрес " + address + ".");
            } else {
                System.out.println(" на адрес " + address + ".");
            }
        }
    }

    public void cancel() {
        if (accepted) {
            accepted = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean getSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PizzaOrder{name='" + name + "', size=" + size +
                ", sauce=" + sauce +
                ", address='" + address + "'}";
    }
}