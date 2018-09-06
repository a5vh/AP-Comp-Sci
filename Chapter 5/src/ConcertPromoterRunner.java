/**
 * Created by augusthummert on 11/28/17.
 */

import java.util.Scanner;

public class ConcertPromoterRunner {

    public static void main(String[] args) {
        ConcertPromoter concert = new ConcertPromoter();
        concert.setBandName("Counting Crows");
        concert.getBandName();
        concert.setVenueCapacity(50000);
        concert.getTicketsLeft();
        concert.SaleDay("phone");
        concert.getTotalSale();
    }
}
