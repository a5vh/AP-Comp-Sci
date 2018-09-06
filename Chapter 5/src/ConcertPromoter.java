import java.util.Scanner;

public class ConcertPromoter {

    private String bandName;
    private int venueCapacity, ticketSold, salesMade, ticketRemain;
    private int phoneSaleMade, venueSalesMade, ticketSalesMade;
    private static final int PHONE_TICKETS_PRICE = 50;
    private static final int VENUE_TICKETS_PRICE = 75;
    Scanner sc = new Scanner(System.in);


public void setBandName(String name){
bandName = name;
}


public String getBandName(){
return bandName;
}


public void setVenueCapacity(int cap){
venueCapacity = cap;
ticketRemain = venueCapacity;
}


public int getVenueCapacity(){
return venueCapacity;
}


public int getTicketsLeft(){
return ticketRemain;
}


private void TicketSale(int amount){
ticketSold = amount;
ticketSalesMade += amount;
ticketRemain -= ticketSold;
if(ticketRemain >= 0){
System.out.println(ticketSold + " tickets baught.");
}else{
System.out.println("Not enough tickets are available.");
ticketSalesMade -= amount;
ticketRemain += ticketSold;
}
}


public void SaleDay(String day){
if(day.equalsIgnoreCase("phone")){
System.out.println("Tickets are available over phone only");
System.out.println("Ticket price: $" + PHONE_TICKETS_PRICE);
System.out.println("How many tickets will be bought?");
System.out.println("[Tickets Remaining: " + ticketRemain + " for " + bandName + "]");
salesMade = sc.nextInt();
TicketSale(salesMade);
phoneSaleMade = salesMade * PHONE_TICKETS_PRICE;
}else if(day.equalsIgnoreCase("person")){
System.out.println("Tickets are available at venue only");
System.out.println("Ticket price: $" + VENUE_TICKETS_PRICE);
System.out.println("How many tickets will be bought?");
System.out.println("[Tickets Remaining: " + ticketRemain + " for " + bandName + "]");
salesMade = sc.nextInt();
TicketSale(salesMade);
venueSalesMade = salesMade * VENUE_TICKETS_PRICE;
}else{
System.out.println("ERROR: invalid option.");
System.out.println("Sales are made over \"Phone\" or in \"Person\"");
}
}


public void getTotalSale(){
System.out.println("Total amount of tickets sold: " + ticketSalesMade);
System.out.println("Total amount of tickets remaining: " + ticketRemain);
System.out.println("Total sale made: $" + (phoneSaleMade + venueSalesMade));
}
}

