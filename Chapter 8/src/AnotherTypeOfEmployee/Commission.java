package AnotherTypeOfEmployee;

/**
 * Created by 19augusthummert on 3/12/2018.
 */
public class Commission extends Hourly {
    double total;
    double cRate;
    String name;
    String address;
    String phone;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
                      double totalSales, double commRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        name = eName;
        address = eAddress;
        phone = ePhone;
        total = totalSales;
        cRate = commRate;
    }

    public void addSales(double totalSales)
    {
        totalSales += total;
    }

    public double pay()
    {
        total = 0;
        return (super.pay()) + (total*cRate);
    }

    public String toString()
    {
        return super.toString() + total;
    }




}
