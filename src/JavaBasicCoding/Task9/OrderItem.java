package JavaBasicCoding.Task9;

public class OrderItem {
    private String productName;
    private Integer quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return price * quantity;
    }

    public boolean isCorrect () {
            return (quantity > 0 && price > 0);
        }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t|");
        sb.append(price).append(" zl").append("\t| ");
        sb.append(quantity).append("pcs").append("\t| ");
        sb.append(getAmount()).append(" zl");
        System.out.println(sb);
    }
}

