
 //Created by 19augusthummert on 1/25/2018.
 // ***************************************************************
 // Item.java
 //
 // Represents an item in a shopping cart.
 // ***************************************************************

 import java.text.NumberFormat;

 public class Item implements Comparable {
  private String name;
  private double price;
  private int quantity;

  // -------------------------------------------------------
  // Create a new item with the given attributes.
  // -------------------------------------------------------
  public Item(String itemName, double itemPrice, int numPurchased) {
   name = itemName;
   price = itemPrice;
   quantity = numPurchased;
  }

  // -------------------------------------------------------
  // Return a string with the information about the item
  // -------------------------------------------------------
  public String toString() {
   NumberFormat fmt = NumberFormat.getCurrencyInstance();

   return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
           + fmt.format(price * quantity));

  }

  // -------------------------------------------------
  // Returns the unit price of the item
  // -------------------------------------------------
  public double getPrice() {
   return price;
  }

  // -------------------------------------------------
  // Returns the name of the item

  // -------------------------------------------------
  public String getName() {
   return name;
  }

  // -------------------------------------------------
  // Returns the quantity of the item
  // -------------------------------------------------
  public int getQuantity() {
   return quantity;
  }


  public int compareTo(Object otherItem) {
   int compare;
   compare = name.compareTo(((Item)otherItem).getName());

   return compare;
  }
 }
