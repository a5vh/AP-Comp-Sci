import java.text.NumberFormat;

public class FoodItem {

    private String name;
    private double price;
    private int quantity;
    private  String type;
    private int itemCount;
    private double totalPrice;

    public FoodItem(String foodName, double foodPrice, String foodType, int foodQuantity)
    {
        name = foodName;
        price = foodPrice;
        type = foodType;
        quantity = foodQuantity;
    }

    public String getName()
    {
        return name;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String g = getName() + "\t\t" + fmt.format(price) + "\t\t" + quantity + "\t\t" + fmt.format(price*quantity) + "\n";
        return g;
    }

    public int compareTo(Item other)
    {
        if(this.getPrice() * this.getPrice() > other.getPrice() * other.getQuantity())
            return 1;
        else if (this.getPrice() * this.getQuantity() < other.getPrice() * other.getQuantity())
            return 1;
        else
            return 0;
    }
}
